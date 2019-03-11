package br.com.wpappgenerator.controllers;

import android.content.Context;

import br.com.wpappgenerator.objects.Post;

public class PostController extends Controller {

    public PostController(Context ctx_){
        super(ctx_);
    }

    public int save(Post post){

        int idpost;

        if(postModel.select(post) != null){
            idpost = postModel.update(post);
        }
        else{
            idpost = postModel.insert(post);
        }

        return idpost;

    }
}
