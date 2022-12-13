package africa.semicolon.data.repository;

import africa.semicolon.data.models.Comment;

import java.util.List;

public interface CommentRepository {

    void save(Comment comment);

  Comment findCommentById(int id);
  List <Comment> findAllComment();
  void deleteCommentById(int id);
  void  deleteAllComment();


    int countComment();
}
