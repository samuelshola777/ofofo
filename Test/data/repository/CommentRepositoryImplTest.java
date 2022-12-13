package data.repository;

import data.models.Comment;
import data.models.Post;
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
    void saveNewPostTest(){
       Post post = new Post();
       post.setTitle("the day that never comes");
       post.setBody("now i think i understand how this word can over come a man");
       PostRepository postRepositoryIml = new PostRepositoryIml();
       postRepositoryIml.save(post);
       assertEquals(1L, postRepositoryIml.count());
       Comment comment = new Comment();
       comment.setCommenterName("samuel shola");
       comment.setComment("what a greate post ");
       comment.setId(1);
       commentRepository.save(comment,post);

    }

}