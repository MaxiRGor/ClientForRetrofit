import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface JSONPlaceHolderApi {
    @GET("/posts/{id}")
    public Call<Post> getPostWithId(@Path("id") int id);

    @GET("/posts")
    Call<List<Post>> getAllPosts();
}
