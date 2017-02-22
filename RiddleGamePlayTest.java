import java.util.Scanner;
public class RiddleGamePlayTest{
  
  public static int getRandomNumber(int max, int min){
    int rangeX = (max - min) + 1; 

    return (int)( Math.random() * rangeX) + min;
  }
  
  public static void main(String[] args){
    
    RiddleSplash riddlesplash = new RiddleSplash();
      riddlesplash.introSplash();
    
    String name;
    String answer;
    int riddleIndex = 0;
    RiddleQuestion activeRiddle;
    

       
    //put all riddles in array
    RiddleQuestion[] riddles = 
    {
     new RiddleQuestion("What is brown and sticky?", "stick"),
     new RiddleQuestion("What is heavy forward and not backwards?", "ton"),
     new RiddleQuestion("Gianni's father has three sons : Sj, Tyji and", "Gianni"),
     new RiddleQuestion("You can't see me, but I'm very strong, and I'm very popular. Answer in one word?", "John Cena"),
     new RiddleQuestion("What part of the Turkey has the most feathers ?", "outside"),
     new RiddleQuestion(" What begins with T, ends with T and has T in it", "teapot"),
     new RiddleQuestion("I go in hard. I come out soft. You blow me hard. What am I", "gum")
    };
    
    
    //ask the user for their name
    Scanner input = new Scanner(System.in);

    
    System.out.println("What is your name?");
    
    name = input.next();
    
    //create a player instance
    RiddlePlayer player = new RiddlePlayer(name);
    
    System.out.println("Would you like to play a game?");
    answer = input.next();
    
    
    //while user says yes to 
    while(answer.equals("yes")){
      
      activeRiddle = riddles[getRandomNumber(riddles.length-1, 0)];
    
      //ask riddle 
      System.out.println(activeRiddle.getQuestion());
    
      //get answer user
      answer = input.next();
    
      //respond with correct/incorrect - riddle answer
      if(activeRiddle.getAnswer().equals(answer)){
        System.out.println("Correct!");
      }
      else{
        System.out.println("Wrong!");
      }
      
      //ask if player wants to play again
      System.out.println("Another riddle?");
      answer = input.next();
      System.out.println("Okay!");
      //riddleIndex++; //update riddle index
      
    }

    
  }
}