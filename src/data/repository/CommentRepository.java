package data.repository;

import data.models.Comment;
import data.models.Post;

import java.util.List;

public interface CommentRepository {

    void save(Comment comment, Post post);

    Comment findComment(int id);
  List <Comment> findAllComment();
  void deleteComment(int id);
  void  deleteAllComment();


    int countComment();
}
