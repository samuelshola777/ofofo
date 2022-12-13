package africa.semicolon.services;

import africa.semicolon.data.models.Post;
import africa.semicolon.data.repository.PostRepository;
import africa.semicolon.data.repository.PostRepositoryIml;
import africa.semicolon.requests.request.CreatePostRequest;

import java.util.List;

public class PostServicesImpl implements PostServices {
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
