package africa.semicolon.controller;

import africa.semicolon.services.PostServices;
import africa.semicolon.services.PostServicesImpl;
import org.springframework.web.bind.annotation.*;
import africa.semicolon.data.models.Post;
import africa.semicolon.requests.request.CreatePostRequest;

@RestController
public class PostController {

    private PostServices postServices = new PostServicesImpl();
    @PostMapping("/post")
    public String createPost(@RequestBody CreatePostRequest createPostRequest){
        postServices.createPost(createPostRequest);
        return "successful";
    }
    @GetMapping("/post/{postId}")
    public Post viewPost(@PathVariable int postId){
        return postServices.viewPost(postId);
    }
}
