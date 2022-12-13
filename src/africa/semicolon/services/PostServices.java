package africa.semicolon.services;

import africa.semicolon.data.models.Post;
import africa.semicolon.requests.request.CreatePostRequest;

import java.util.List;

public interface PostServices {

    void createPost(CreatePostRequest createPostRequest);
    void updatePost(int id, String title, String body);
    void deletePost(int id);
    Post viewPost(int id);



    List<Post> viewAllPost();
}
