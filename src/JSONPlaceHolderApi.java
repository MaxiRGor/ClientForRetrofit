import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface JSONPlaceHolderApi {
    @GET("/posts/{id}")
    public Call<Post> getPostWithId(@Path("id") int id);

    @GET("/posts")
    Call<List<Post>> getAllPosts();

    @GET("/greeting")
    Call<DemoUser> getUser();

    @GET("/greeting")
    Call<DemoUser> getNamedUser(@Query("name") String name);

    @GET("/all")
    Call<List<Question>> getAllQuestions();

    @GET("/get/{level}")
    Call<List<Question>> getByLevel(@Path("level") int level);
/*
    @PUT("/answer/{id_answer}/{user_answer}")
    Call<Answer> updateAnswer(@Path("id_answer") int id_answer, @Path("user_answer") int user_answer);
    */

    @PUT("/answer/{id_answer}/{user_answer}")
    Call<Void> updateAnswer(@Path("id_answer") int id_answer, @Path("user_answer") int user_answer);

}
