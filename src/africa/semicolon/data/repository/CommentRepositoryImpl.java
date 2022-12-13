package africa.semicolon.data.repository;

import africa.semicolon.data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository{
    List< Comment> commentList = new ArrayList<>();
private static  int commentId ;

    @Override
    public void save(Comment comment) {
        commentId++;
        comment.setId(commentId);
      commentList.add(comment);
    }

    @Override
    public Comment findCommentById(int id) {
        return commentList.get(id);
    }

    @Override
    public List<Comment> findAllComment() {
        return commentList;
    }

    @Override
    public void deleteCommentById(int id) {
    commentList.remove(id);
    }

    @Override
    public void deleteAllComment() {
          commentList.removeAll(findAllComment());

    }

    @Override
    public int countComment() {
    return  commentList.size();
    }
}
