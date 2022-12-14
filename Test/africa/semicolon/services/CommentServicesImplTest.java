package africa.semicolon.services;

import africa.semicolon.data.models.Comment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentServicesImplTest {
    CommentService commentService;
    Comment comment;
    @BeforeEach
    @Test
    void setUp() {
         commentService = new CommentServicesImpl();
    }
    @Test
    void TestThatCreateCommentWorksAndAddOneToCounter(){
        Comment comment = new Comment();
        comment.setCommenterName("samuel shola");
        comment.setComment("what a nice post");
        comment.setId(CommentServicesImpl.commentCountId);
        commentService.createComment(comment.getCommenterName(),comment.getComment());
        assertEquals(1, CommentServicesImpl.commentCountId);
    }
}