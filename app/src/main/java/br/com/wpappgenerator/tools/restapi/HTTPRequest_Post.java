package br.com.wpappgenerator.tools.restapi;

import java.util.List;

import br.com.wpappgenerator.objects.Post;
import retrofit2.Call;
import retrofit2.http.GET;

public interface HTTPRequest_Post {

    @GET("wp-json/wp/v2/posts")
    Call<List<Post>> getPosts();

}
