package br.unigran.controledeabastecimento.Banco_dados;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

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
            valores.put("dia", controle.getDia(query.getString(3)));
            valores.put("valor", controle.getValor());
            conexao.insertOrThrow("listagem", null, valores);
            conexao.close();
        }

        public void listar (List dados){

            dados.clear();
            conexao = db.getWritableDatabase();
            String colunas[] = {"id", "km", "quant", "dia", "valor"};

            Cursor query = conexao.query("controle", colunas, null, null, null, null, "km");

            while (query.moveToNext()){
                Controle dado = new Controle();
                dado.setKm(query.getString(1));
                dado.setQuant(query.getString(2));
                dado.setDia(query.getString(3));
                dado.setValor(query.getString(4));

                dado.add(Controle);
            }
            conexao.close();
        }
    public void remover(int id){
        conexao = db.getWritableDatabase();
        conexao.delete("controle", "id=?", new String[]{id+""});
        conexao.close();

    }
}
