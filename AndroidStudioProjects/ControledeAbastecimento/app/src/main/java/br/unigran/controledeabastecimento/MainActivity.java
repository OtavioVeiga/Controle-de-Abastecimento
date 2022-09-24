package br.unigran.controledeabastecimento;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.unigran.controledeabastecimento.Banco_dados.ControleDB;
import br.unigran.controledeabastecimento.Banco_dados.DBHelper;

public class MainActivity extends AppCompatActivity {

    EditText quant;
    EditText valor;
    EditText dia;
    EditText km;
    EditText media;
    ArrayList<Controle> dados;
    ListView lista;
    DBHelper db;
    ControleDB controleDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DBHelper(this);
        km = findViewById(R.id.km);
        quant = findViewById(R.id.qunt);
        valor = findViewById(R.id.valor);
        dia = findViewById(R.id.data);
        dados = new ArrayList();
        lista = findViewById(R.id.listagem);

        dados = new ArrayList();
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, dados);
        lista.setAdapter(adapter);
        controleDB = new ControleDB(db);
        controleDB.listar(dados);

        acao();

    }
    public void acao(){
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                new AlertDialog.Builder(view.getContext())
                        .setMessage("Deseja Remover")
                        .setPositiveButton("Confirma",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int k) {
                                        Controle controle = dados.get(i);
                                        controleDB.remover(controle.getId());
                                        controleDB.listar(dados);

                                    }
                                })
                        .setNegativeButton("Cancelar", null)
                        .create().show();
            }
        });


    }

    public void salvar(View view){
         Controle controle = new Controle();

         controle.setDia(dia.getText().toString());
         controle.setKm(km.getText().toString());
         controle.setQuant(quant.getText().toString());
         controle.setValor(valor.getText().toString());

         controleDB.inserir(controle);
         controleDB.listar(dados);
        Toast.makeText(this, "Salvo com sucesso!!!", Toast.LENGTH_SHORT).show();

    }

}