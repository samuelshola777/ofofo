package africa.semicolon.services;

import africa.semicolon.data.models.Comment;
import africa.semicolon.data.models.Post;
import africa.semicolon.data.repository.CommentRepository;
import africa.semicolon.data.repository.CommentRepositoryImpl;
import africa.semicolon.data.repository.PostRepository;
import africa.semicolon.data.repository.PostRepositoryIml;

import java.util.ArrayList;
import java.util.List;

public class CommentServicesImpl implements CommentService {
    CommentRepository commentRepository = new CommentRepositoryImpl();
    public static int commentCountId = 0;

    List<Comment> commentList = new ArrayList<>();
    @Override
    public void createComment(String commenterName, String comment) {
        Comment commentL = new Comment();
        commentCountId ++;
    commentL.setCommenterName(commenterName);
    commentL.setComment(comment);
    commentL.setId(commentCountId);
    commentList.add(commentL);
    }

    @Override
   public Comment findCommentById(int id){
        if (comment.getId() != 0){
            return commentList.get(id);
        }
        return null;
    }

    @Override
    public List<Comment> viewAll() {
        if (comment != null){
           for (Comment comment : commentList) {
                return commentList;
            }
        }return null;
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
