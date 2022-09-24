package Banco_dados;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import br.unigran.controledeabastecimento.Controle;

public class ControleDB {
    private DBHelper db;
    private SQLiteDatabase conexao;

        public ControleDB(DBHelper db){
            this.db = db;
        }

        public void inserir(Controle controle){
            conexao = db.getWritableDatabase();
            ContentValues valores = new ContentValues();
            valores.put("km", controle.getKm());
            valores.put("quant", controle.getQuant());
            valores.put("dia", controle.getDia());
            valores.put("valor", controle.getValor());
            conexao.insertOrThrow("listagem", null, valores);
            conexao.close();
        }

        public void remover(int id){

        }
}
