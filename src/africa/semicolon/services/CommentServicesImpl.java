package africa.semicolon.services;

import africa.semicolon.data.models.Post;
import africa.semicolon.data.repository.PostRepository;
import africa.semicolon.data.repository.PostRepositoryIml;

import java.util.List;

public class CommentServicesImpl implements CommentService {
    PostRepository postRepository = new PostRepositoryIml();
    @Override
    public void createPost() {

    }

    @Override
    public Post viewPost(int id) {
        return postRepository.findById(id);
    }

    @Override
    public List<Post> viewAll() {
        return postRepository.findAll();
    }


//    @Override
//    public Comment save(Comment comment) {
//        return null;
//    }
//
//    @Override
//    public Comment findById(int id) {
//        return null;
//    }
//
////    @Override
//    public List<Comment> findAll() {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void delete(Comment comment) {
//
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
}
