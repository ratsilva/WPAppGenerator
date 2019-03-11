package br.com.wpappgenerator.models.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.com.wpappgenerator.models.contracts.PostContract;

public class SQLiteRepository{

    private static final String[] SCRIPT_DATABASE_CREATE = new String[] {

            "DROP TABLE IF EXISTS " + PostContract.TABLE_NAME            + ";" 	,

            "	CREATE TABLE '" + PostContract.TABLE_NAME + "' (	"	+
            "	    '" + PostContract.ID_POST                     + "'  integer 	,	"	+
            "	    '" + PostContract.DATE                        + "'  text 	    ,	"	+
            "	    '" + PostContract.LINK                        + "'  text 	    ,	"	+
            "	    '" + PostContract.TITLE                       + "'  text 	    ,	"	+
            "	    '" + PostContract.CONTENT                     + "'  text 	    ,	"	+
            "	    '" + PostContract.EXCERPT                     + "'  text 	    ,	"	+
            "	    PRIMARY KEY (" + PostContract.ID_POST + ")"	+
            "	);	"

    };

    private static String NOME_BANCO = "wp_app_generator";

    private static final int VERSAO_BANCO = 1;

    protected static SQLiteDatabase db;

    private static SQLiteHelper dbHelper;

    public SQLiteDatabase open(Context ctx) {

        if(dbHelper==null){

            dbHelper = new SQLiteHelper(ctx,
                    SQLiteRepository.NOME_BANCO,
                    SQLiteRepository.VERSAO_BANCO,
                    SQLiteRepository.SCRIPT_DATABASE_CREATE);

            db = dbHelper.getWritableDatabase();

        }

        return db;

    }

    public void close() {

        if(dbHelper != null) {
            dbHelper.close();
            dbHelper = null;
        }

    }

}
