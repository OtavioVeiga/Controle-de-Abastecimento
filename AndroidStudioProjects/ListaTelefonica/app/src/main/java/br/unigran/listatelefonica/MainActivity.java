package br.unigran.listatelefonica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText nome;
    EditText telefone;
    EditText datanasc;
    List<Contatos> dados;
    ListView listagem;
    DBHelper db;
    ContatoDB contatoDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}