// declares a member's access as public
public class RiddleQuestion{
  
   //private means it can only be accessed by the sae class
  private String question;
  private String answer;
  private boolean used = false;
  
  // declares a member's access as public
  public RiddleQuestion(){
    
  }
 //creating question or answer
  public RiddleQuestion(String newQuestion, String newAnswer){
    
    question = newQuestion;
    answer = newAnswer;
  }
  //gets a question from the arry 
  public String getQuestion(){
    return question;
  }
  //posts the question
  public void setQuestion(String newQuestion){
    question = newQuestion;
  }
  //gets a answer from the arry
  public String getAnswer(){
    return answer;
  }
  // posts the answer
  public void setAnswer(String newAnswer){
    answer = newAnswer;
  }
  
//marks riddles as used or unused
  public boolean getUsed(){
    return used;
  }
 //marks riddles as used unused
  public void setUsed(boolean newUsed){
    used = newUsed;
  }
  //posts the question and the anwer text
  public String toString(){
    return question + " " + answer + " ";

}
}
