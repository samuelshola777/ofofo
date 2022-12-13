package data.repository;

import data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryIml implements PostRepository{

private List<Post> postDb = new ArrayList<>();

    @Override
    public Post save(Post post) {
        if (post.getId() != 0){
            update(post);
        }else {
            post.setId(postDb.size() + 1);
            postDb.add(post);

        }
        return post;
    }

    private void update(Post post) {
        // find the original
        // set with new details
        Post savedPost = findById(post.getId());
        savedPost.setTitle(post.getTitle());
        savedPost.setBody(post.getBody());
    }

    @Override
    public Post findById(int id) {
        for (Post post: postDb ) {
            if (post.getId() == id){
                return post;
            }
        }
        return null;
    }

    @Override
    public List<Post> findAll() {
        return postDb;
    }

    @Override
    public long count() {
        return postDb.size();
    }

    @Override
    public void delete(Post post) {
// setter's should not set and getters should not get

    }

    @Override
    public void delete(int id) {
     postDb.remove(id-1);

        }


}
