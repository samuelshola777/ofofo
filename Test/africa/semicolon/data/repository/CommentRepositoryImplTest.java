package africa.semicolon.data.repository;

import africa.semicolon.data.models.Comment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryImplTest {
    CommentRepository commentRepository;

    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }

    @Test
    void saveNewPostTest() {

        Comment comment = new Comment();
        comment.setCommenterName("samuel shola");
        comment.setComment("what a greate post ");
        commentRepository.save(comment);
        assertEquals(1, commentRepository.countComment());

    }

    @Test
    void findCommentById() {
        Comment comment = new Comment();
        comment.setCommenterName("samuel shola");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        assertEquals(1, commentRepository.countComment());
        assertEquals(comment, commentRepository.findCommentById(0));
    }

    @Test
    void countNumberOfComment() {
        Comment comment = new Comment();
        comment.setCommenterName("samuel shola");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        comment.setCommenterName("ogunaike wunmi");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        comment.setCommenterName("kehinde adifashe");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        comment.setCommenterName("smile okuta");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        assertEquals(4, commentRepository.countComment());
    }

    @Test
    void deleteCommentById() {
        Comment comment = new Comment();
        comment.setCommenterName("samuel shola");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        comment.setCommenterName("ogunaike wunmi");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        comment.setCommenterName("kehinde adifashe");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        comment.setCommenterName("smile okuta");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        assertEquals(4, commentRepository.countComment());
        commentRepository.deleteCommentById(3);
        commentRepository.deleteCommentById(2);
        assertEquals(2, commentRepository.countComment());
    }

    @Test
    void deleteAllComment() {
        Comment comment = new Comment();
        comment.setCommenterName("samuel shola");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        comment.setCommenterName("ogunaike wunmi");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        comment.setCommenterName("kehinde adifashe");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        comment.setCommenterName("smile okuta");
        comment.setComment("what a great post ");
        commentRepository.save(comment);
        assertEquals(4, commentRepository.countComment());
        commentRepository.deleteAllComment();
        assertEquals(0, commentRepository.countComment());


    }
}