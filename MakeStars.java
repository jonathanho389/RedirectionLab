import java.util.*;
public class MakeStars{
  public static void main(String[] args) {
    Scanner text = new Scanner(System.in);
    while(text.hasNext()){
      Scanner line = new Scanner(text.nextLine());
      for(int i = 0;i < line.next().length();i++){
        System.out.print("*");
      }
    }
  }
}
