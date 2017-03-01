import java.util.Scanner;
public class RiddleGamePlayTest{
  
  public static int getRandomNumber(int max, int min){
    int rangeX = (max - min) + 1; 

    return (int)( Math.random() * rangeX) + min;
  }
  
  public static void main(String[] args){
    
    //splash screen
    RiddleSplash riddlesplash = new RiddleSplash();
    riddlesplash.introSplash();
    
    //variables used in this program
    String name;
    String answer;
    int riddleIndex = 0;
    RiddleQuestion activeRiddle;
    int randomNumber = 0;
    boolean riddlesLeft = true;
         
    //put all riddles in array
    RiddleQuestion[] riddles = 
    {
     new RiddleQuestion("What is brown and sticky?", "stick"),
     new RiddleQuestion("What is heavy forward and not backwards?", "ton"),
     new RiddleQuestion("Gianni's father has three sons : Sj, Tyji and", "gianni"),
     new RiddleQuestion("You can't see me, but I'm very strong, and I'm very popular. Answer in one word?", "johncena"),
     new RiddleQuestion("What part of the Turkey has the most feathers ?", "outside"),
     new RiddleQuestion(" What begins with T, ends with T and has T in it", "teapot"),
     new RiddleQuestion("I go in hard. I come out soft. You blow me hard. What am I", "gum"),
     new RiddleQuestion("Alive without breath, As cold as death, Never thirsty, ever drinking, All in mail never clinking.", "fish"),
     new RiddleQuestion("Voiceless it cries, Wingless flutters, Toothless bites, Mouthless mutters.", "wind"),
    };
    
    
    //ask the user for their name
    Scanner input = new Scanner(System.in);
    
    System.out.println("\n What is your name?");
    
    name = input.next();
    
    //create a player instance
    RiddlePlayer player = new RiddlePlayer(name);
    
    //ask player if they want to play
    System.out.println("Would you like to play a game?");
    answer = input.next();
    
    
    //while user says yes to a riddle
    while(answer.equals("yes")){
      
      //check if there are any riddles left to use
      for(int i = 0; i < riddles.length; i++){
        //if there are riddles left,
        //then leave this loop and continue on
        if(!riddles[i].getUsed()){
          break;
        }
        //else there are no riddles left
        //stop game
        else{
          riddlesLeft = false;
        }
      }//end for-loop
      
      //if there are riddles left
      //then continue on with games
      if(riddlesLeft){
        
        //get random number
        randomNumber = getRandomNumber(riddles.length-1, 0);
        //get random riddle
        activeRiddle = riddles[randomNumber];
        
        //if the riddle is NOT used
        if(!activeRiddle.getUsed()){
          //ask riddle 
          System.out.println(activeRiddle.getQuestion());
          //set the riddle to used
          riddles[randomNumber].setUsed(true);
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
      else{
        System.out.println("No more riddles!");
        break;
      }
      
    }

    
  }
}