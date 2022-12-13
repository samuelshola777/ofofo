package data.repository;

import data.models.Post;

import java.util.List;

public interface PostRepository {
    Post save(Post post);
    Post findById(int id);
    List<Post> findAll();
    long count();
    void delete(Post post);
    void  delete(int id);

}
