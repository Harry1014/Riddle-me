public class RiddleQuestion{
  
  private String question;
  private String answer;
  private boolean used = false;
  
  public RiddleQuestion(){
    
  }
  
  public RiddleQuestion(String newQuestion, String newAnswer){
    
    question = newQuestion;
    answer = newAnswer;
  }
  
  public String getQuestion(){
    return question;
  }
  
  public void setQuestion(String newQuestion){
    question = newQuestion;
  }
  
  public String getAnswer(){
    return answer;
  }
  
  public void setAnswer(String newAnswer){
    answer = newAnswer;
  }
  

  public boolean getUsed(){
    return used;
  }
  
  public void setUsed(boolean newUsed){
    used = newUsed;
  }
  
  public String toString(){
    return question + " " + answer + " ";

}
}
