package br.com.wpappgenerator.controllers;

import android.content.Context;
import android.net.ConnectivityManager;

import br.com.wpappgenerator.models.PostModel;
import br.com.wpappgenerator.tools.restapi.HTTPRequest;
import br.com.wpappgenerator.views.activities.MainActivity;

public class Controller {

    HTTPRequest http;
    Context ctx;

    // Models
    protected PostModel postModel;

    public Controller(Context ctx_){
        http = new HTTPRequest(MainActivity.clienteWP);
        ctx = ctx_;

        postModel = new PostModel(ctx);
    }

    public boolean testConnection(){

        ConnectivityManager cm = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);

        if(cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected()){
            return true;
        }

        return false;
    }

}
