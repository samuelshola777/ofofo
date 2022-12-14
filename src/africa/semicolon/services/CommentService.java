package africa.semicolon.services;

import africa.semicolon.data.models.Comment;
import africa.semicolon.data.models.Post;

import java.util.List;

public interface CommentService {
Comment comment = new Comment();
void createComment(String commenterName, String comment);
Comment  findCommentById(int id);
List<Comment> viewAll();

































//List<Comment> commentList = new ArrayList<>();
//    Comment save(Comment comment);
//    Comment findById(int id);
//    List<Comment> findAll();
//    long count();
//    void delete(Comment comment);
//    void delete(int id);
//    void deleteAll();


}
