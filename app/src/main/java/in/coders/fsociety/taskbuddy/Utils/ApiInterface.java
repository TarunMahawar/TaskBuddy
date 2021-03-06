package in.coders.fsociety.taskbuddy.Utils;

import in.coders.fsociety.taskbuddy.Models.ProfilePostModel;
import in.coders.fsociety.taskbuddy.Models.UserModel;
import in.coders.fsociety.taskbuddy.Activities.UploadPost;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface ApiInterface {

    @GET("/profile/{id}")
    Call<UserModel> getProfile(@Path("id") String id);

    @POST("/post")
    @FormUrlEncoded
    Call<UploadPost.Response1> sendPostData(@Field("title") String title, @Field("description") String description,
            @Field("credit") int credit, @Field("tags") String tag, @Field("picPostUrl") String picPostUrl,
            @Field("isPublic") String isPublic  , @Field("authorId") String authorid, @Field("circlesId") String circlesId);

    @POST("/user")
    @FormUrlEncoded
    Call<in.coders.fsociety.taskbuddy.Fragments.LoginFragment.UserSentResponse> sendUserData(
            @Field("name")String name,
            @Field("id")String id,
            @Field("picUrl")String picUrl,
            @Field("email")String email);

    @GET("/profile/post/{id}")
    Call<ProfilePostModel> getProfilePosts(@Path("id") String id);

}
