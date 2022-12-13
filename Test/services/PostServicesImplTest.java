package services;

import dtos.requests.request.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}