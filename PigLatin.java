public class PigLatin{
  public static String pigLatinSimple(String s){
    int length = s.length();
    String piggy = "";
    if(s.substring(0, 1).equals("a") || s.substring(0, 1).equals("e") || s.substring(0, 1).equals("i") || s.substring(0, 1).equals("o") || s.substring(0, 1).equals("u")){
      piggy = s + "hay";
    }
    return piggy;
  }
}
