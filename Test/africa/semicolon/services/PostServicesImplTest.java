package africa.semicolon.services;

import africa.semicolon.data.models.Post;
import africa.semicolon.requests.request.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PostServicesImplTest {
private PostServices postService;
    @BeforeEach
    void setUp() {
        postService = new PostServicesImpl() ;
        }
        @Test
        public void createPostTest(){
            CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("Egusi is my best soup ");
        createPostRequest.setTitle("New post ");
        postService.createPost(createPostRequest);
        assertEquals(1, postService.viewAllPost().size());

    }
    @Test
    public void viewPostTest(){

        CreatePostRequest createPostRequest = new CreatePostRequest();
createPostRequest.setBody("egusi is weird ");
createPostRequest.setTitle("new post");
postService.createPost(createPostRequest);
assertEquals(1, postService.viewAllPost().size());
        Post post = postService.viewPost(1);
        assertEquals("New post", post.getTitle());
        assertEquals("egusi is weird ", post.getBody());
        assertNotNull(post.getCreationTime());
    }
}