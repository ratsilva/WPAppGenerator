package br.com.wpappgenerator.tools.restapi;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HTTPRequest {

    protected static String BASE_URL = "https://quatrorodas.abril.com.br/";

    private final Retrofit retrofit;

    public HTTPRequest(){

        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();

        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

    }

    public HTTPRequest_Post getPostService() {
        return this.retrofit.create(HTTPRequest_Post.class);
    }


}
