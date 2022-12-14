package africa.semicolon.services;

import africa.semicolon.data.models.Post;
import africa.semicolon.data.repository.PostRepository;
import africa.semicolon.data.repository.PostRepositoryIml;
import africa.semicolon.requests.request.CreatePostRequest;

import java.util.ArrayList;
import java.util.List;

public class PostServicesImpl implements PostServices {
    private List <Post> postList = new ArrayList<>();
private PostRepository postRepository = new PostRepositoryIml();
    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());

        post.setTitle(createPostRequest.getTitle());
        postRepository.save(post);

    }

    @Override
    public void updatePost(int id, String title, String body) {
        Post post = new Post();
        post.setTitle(title);
        post.setBody(body);
        if (id == post.getId()){
            postList.add(id,post);
        }else {
            postRepository.save(post);
        }
    }

    @Override
    public void deletePost(int id) {

    }

    @Override
    public Post viewPost(int id) {
        return null;
    }

    @Override
    public List<Post> viewAllPost() {
        return postRepository.findAll();
    }
}
