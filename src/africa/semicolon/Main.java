package africa.semicolon;

import africa.semicolon.controller.PostController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {


//        displayMainMenu();
SpringApplication.run(Main.class,args);

    }
    private static PostController postController = new PostController();
//    @PostMapping("/post/{postId}")

    private static Scanner keyboardInput = new Scanner(System.in);
    private static void displayMainMenu(){
        String mainMenu = """
                press 1 for create post
                press 2 for view post
                press 3 to exit the app
                """;
        String userInput = input(mainMenu);
        switch (Integer.parseInt(String.valueOf(userInput.charAt(0)))){
            case  1 -> createPost();
            case  2 -> viewPost();
            case  3 -> exitFromApp();
        }

    }
    private  static  void createPost(){
        String title = input("enter post title ");
        String body = input("enter post body");


    }
    private static void viewPost(){
        String userInput = input("enter post id ");
        print(postController.viewPost(Integer.parseInt(String.valueOf(userInput))).toString());
        displayMainMenu();


    }
    private static void exitFromApp(){
        print("Thank you for using our app");
        System.exit(0);
    }
    private static  String input(String prompt){
        return  prompt;
    }
    private static  void  print(String prompt){

    }

}
