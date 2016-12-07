import java.util.Scanner;
public class Riddleme{  
  public static void main(String[] args){
    System.out.println("What to play a game?");
    Scanner input = new Scanner(System.in);
    System.out.println("What to play a game?");
    System.out.println("Enter Y or N");
     String answer = input.next();
     if(answer.equalsIgnoreCase("Y")) 
          System.out.println("Fantastic! Here's a riddle. What is brown and sticky. one word");
     else
          System.out.println("Awwww...");
     answer = input.next();
       if(answer.equalsIgnoreCase("Stick"))
        System.out.println("Correct!!!");
     else
         System.out.println("You're a failure");
  
}
}