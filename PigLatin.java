public class PigLatin{
  public static void main(String[] args) {
    System.out.println(PigLatin.pigLatinSimple("oink"));
    System.out.println(PigLatin.pigLatinSimple("mock"));
    System.out.println(PigLatin.pigLatin("the"));
    System.out.println(PigLatin.pigLatin("oink"));
    System.out.println(PigLatin.pigLatinBest("*emu"));
    System.out.println(PigLatin.pigLatinBest("fish!"));
  }
  public static String pigLatinSimple(String s){
    int length = s.length();
    String piggy = "";
    if(s.substring(0, 1).equals("a") || s.substring(0, 1).equals("e") || s.substring(0, 1).equals("i") || s.substring(0, 1).equals("o") || s.substring(0, 1).equals("u")){
      piggy = s + "hay";
    }
    else{
      piggy = s.substring(1, length) + s.substring(0, 1) + "ay";
    }
    return piggy;
  }

  public static String pigLatin(String s){
    String piggy = "";
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh",
                       "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk",
                       "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    int length = digraphs.length;
    for(int i = 0;i < length;i++){
      if(s.substring(0, 2).equals(digraphs[i])){
        return s.substring(2, s.length()) + digraphs[i] + "ay";
      }
    }
    return pigLatinSimple(s);
    }

  public static String pigLatinBest(String s){
    String special = "";
    int length = s.length();
    for(int i = 0;i < s.length();i++){
      if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))){
        special += s.charAt(i);
      }
    }
    if(!Character.isDigit(s.charAt(0)) && !Character.isLetter(s.charAt(0))){
      return s;
    }
    else if(Character.isLetter(s.charAt(0))){
      return pigLatin(s.substring(0, length - 1)) + special;
    }
    return pigLatin(s);
    }
  }
