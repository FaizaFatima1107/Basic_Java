package com.example.conditionals;

/*public class HelloApplication { extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }*/
import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        /*Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Type + - * / % for relevant operation");
        String operation= sc.next();
        int ans=0;
        switch(operation){
            case "+":
                ans=a+b;
                System.out.println(ans);
                break;
            case "-":
                ans=a-b;
                System.out.println(ans);
                break;
            case "*":
                ans=a*b;
                System.out.println(ans);
                break;
            case "/":
                if (b==0) {
                    System.out.println("Invalid Division");
                }
                else{
                    ans=a/b;
                        System.out.println(ans);
                    }
                break;
            case "%":
                if (b==0) {
                    System.out.println("Invalid Division");
                }
                else{
                    ans=a%b;
                        System.out.println(ans);
                    }
            default:
                System.out.println("Invalid Operation");

                }*/
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Select relevant symbol of operation:");
        String operation= sc.next();
        int ans=0;
        switch (operation){
            case "+" -> System.out.println(ans=a+b);
            case "-" -> System.out.println(ans=a-b);
            case "*" -> System.out.println(ans=a*b);
            case "/" -> {
                if (b==0)
                    System.out.println("Invalid Division");
                else
                    System.out.println(ans=a/b);
            }
            case "%" ->{
                if (b==0){
                    System.out.println("Invalid Modulus");
                }else {
                    System.out.println(ans=a%b);
                }
            }
            default -> System.out.println("invalid operation");
        }



    }
}