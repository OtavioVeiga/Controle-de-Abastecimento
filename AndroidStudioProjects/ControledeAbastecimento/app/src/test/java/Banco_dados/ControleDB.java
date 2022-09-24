package Banco_dados;

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;

import br.unigran.controledeabastecimento.Controle;

public class ControleDB {
    private DBHelper db;
    private SQLiteOpenHelper conexao;

        public ControleDB(DBHelper db){
            this.db = db;
        }

        public void inserir(Controle controle){
            conexao = db.getWritableDatabase();
            ContentValues valores = new ContentValues();
            valores.put("km", controle.getKm());
            valores.put("quant", controle.getQuant());
            valores.put("data", controle.getData());
        }
}
