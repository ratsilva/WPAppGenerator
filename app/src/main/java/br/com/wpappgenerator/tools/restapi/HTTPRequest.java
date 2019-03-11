package br.com.wpappgenerator.tools.restapi;

import java.util.concurrent.TimeUnit;

import br.com.wpappgenerator.objects.ClientWP;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HTTPRequest {

    protected static String URL_CLIENTHOST = "https://quatrorodas.abril.com.br/wp-json/wp/v2/";
    protected static String URL_WPHOST = "https://public-api.wordpress.com/wp/v2/sites/ricardoatsilva.wordpress.com/";

    protected static String BASE_URL;

    private final Retrofit retrofit;

    public HTTPRequest(ClientWP clienteWP){

        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();

        BASE_URL = URL_CLIENTHOST;
        if(clienteWP.isWPHost()) BASE_URL = URL_WPHOST;

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
