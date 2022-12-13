package data.repository;

import data.models.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PostRepositoryImlTest {
PostRepository postRepository;
    @BeforeEach
    void setUp() {
        postRepository = new PostRepositoryIml();
    }
    @Test
    public void  saveNewPost_CountShouldBeOne_Test(){
        Post post = new Post();
        post.setBody("our post body");
        post.setTitle("our post title ");
        postRepository.save(post);
        assertEquals(1L, postRepository.count());

    }
    @Test
    public  void saveNewPost_FIndById_ShouldReturnSavedPostTest(){
        Post post = new Post();
        post.setBody("our post body");
        post.setTitle("our post title ");
        postRepository.save(post);
        assertEquals(1L, postRepository.count());
Post savedPost = postRepository.findById(1);
assertEquals(post, savedPost);
Post post2 = new Post();
postRepository.save(post2);
assertEquals(post2, postRepository.findById(2));
    }
    @Test
    public void  saveNewPost_UpdatePost_countIsOneTest(){
        Post post = new Post();
        post.setTitle("our post title ");
        post.setBody("our post body ");
        postRepository.save(post);


        Post updatedPost = new Post();
     updatedPost.setId(1);
        updatedPost.setBody("updated body");
        updatedPost.setTitle("updated title ");
        postRepository.save(updatedPost);
        assertEquals(1L, postRepository.count());
        assertEquals(post, postRepository.findById(1));
//       assertEquals("updated body ", post.getBody());
//        assertEquals("updated title ", post.getTitle());
    }
    @Test
    public void deleteItem(){
        Post post = new Post();
        post.setBody("our post body");
        post.setTitle("our post title ");
        postRepository.save(post);
        assertEquals(1L, postRepository.count());
        postRepository.delete(1);



    }
}