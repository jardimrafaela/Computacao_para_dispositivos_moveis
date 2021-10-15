<<<<<<< HEAD
package com.rafaelajardim.appproject;public class Banco {
=======
package com.rafaelajardim.appproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "BancoProjeto";
    private static final int VERSAO = 1;

    public Banco(Context context){
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS produtos (  " +
                    "  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT ,  " +
                    "  nome TEXT NOT NULL , " +
                    "  categoria TEXT," +
                    "  tipo TEXT) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
>>>>>>> 30477554f318bd459ac466053ffb02262922034c
}
