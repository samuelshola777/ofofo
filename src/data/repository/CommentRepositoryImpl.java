package data.repository;

import data.models.Comment;
import data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository{
    List< Comment> commentList = new ArrayList<>();


    @Override
    public void save(Comment comment, Post post) {

    }

    @Override
    public Comment findComment(int id) {
        return null;
    }

    @Override
    public List<Comment> findAllComment() {
        return null;
    }

    @Override
    public void deleteComment(int id) {

    }

    @Override
    public void deleteAllComment() {

    }

    @Override
    public int countComment() {
    List< Comment> comment = new ArrayList<>();
        return  comment.size();
    }
}
