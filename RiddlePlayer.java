public class RiddlePlayer {
  
private String name;
 

public RiddlePlayer(){
}

public RiddlePlayer(String newName){
  name = newName;
}
  public String getName(){
    return name;
 }
  
  
  public void setPlayer(String newName){
    name = newName;
  }
  public String toString(){
    return name + " ";
  }
}
