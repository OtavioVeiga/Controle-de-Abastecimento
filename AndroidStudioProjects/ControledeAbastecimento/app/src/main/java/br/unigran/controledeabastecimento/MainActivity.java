package br.unigran.controledeabastecimento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

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
        controleDB.(dado);


    }

}