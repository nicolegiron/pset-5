/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {

    public static void main(String[] args) {
      ProblemSet5 ps = new ProblemSet5();
      String in;
      String out;
      String text;
      int n;
      String target;
      char suffix;

      // System.out.println("\nExercise 1: " + ps.surroundMe("nicole", "boat"));
      // System.out.println("\nExercise 2: " + ps.endsMeet("UCVTS", 2));
      // System.out.println("\nExercise 3: " + ps.middleMan("NICOLEGIRON"));
      // System.out.println("\nExercise 4: " + ps.isCentered("NICOLEGIRON", "LEG"));
      // System.out.println("\nExercise 5: " + ps.countMe("ucvts is a school that strips away your happiness", 's'));
      // System.out.println("\nExercise 6: " + ps.triplets(null));
      System.out.println("\nExercise 7: " + ps.addMe("123 abc 123"));
    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
      if(in == null || out == null || out.length() != 4){
        return in;
      }else{
        String outFirstHalf = out.substring(0, 2);
        String outSecondHalf = out.substring(2, 4);
        String newString = outFirstHalf + in + outSecondHalf;
        return newString;
      }

    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
      if(text == null || text.length() > 10 || text.length() < 1 || n < 1 || n > text.length()){
        return text;
      }else{
        String firstN = text.substring(0, n);
        String lastN = text.substring(text.length()-n, text.length());
        String newString = firstN + lastN;
        return newString;
      }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {
      if(text == null || text.length() < 3 || text.length() % 2 == 0) {
        return text;
      }else{
        int middleNum = text.length() / 2;
        char first = text.charAt(middleNum - 1);
        char second = text.charAt(middleNum);
        char third = text.charAt(middleNum + 1);
        String threeChar = String.valueOf(first) + String.valueOf(second) + String.valueOf(third);
        return threeChar;
      }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {
      if(text == null || text.length() < 3 || text.length() % 2 == 0 || target == null || target.length() < 3 || target.length() > 3){
        return false;
      }else{
        int middleNum = text.length() / 2;
        char first = text.charAt(middleNum - 1);
        char second = text.charAt(middleNum);
        char third = text.charAt(middleNum + 1);
        String threeChar = String.valueOf(first) + String.valueOf(second) + String.valueOf(third);
        if(threeChar.equals(threeChar)){
          return true;
        }else{
          return false;
        }
      }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
      text = text.toLowerCase();
      suffix = Character.toLowerCase(suffix);
      String suffixString = String.valueOf(suffix);
      int count = 0;
      String words[] = text.split(" ");
      if(suffix <= 'a' || suffix >= 'z' || text == null){
        return -1;
      }else{
        for(int i = 0; i < words.length; i++){
          if(words[i].endsWith(suffixString)){
            count++;
          }
        }
        return count;
      }
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {
      char a;
      char b;
      char c;
      int count = 0;
      if(text==null){
        return -1;
      }else{
        for(int i = 2; i < text.length(); i++){
          a = text.charAt(i-2);
          b = text.charAt(i-1);
          c = text.charAt(i);
          String sA = String.valueOf(a);
          String sB = String.valueOf(b);
          String sC = String.valueOf(c);
          if(sA.equals(sB) && sB.equals(sC)){
            count++;
          }
        }
        return count;
      }
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {
      char a;
      int sum = 0;
      if(text==null){
        return -1;
      }else{
        for(int i = 0; i < text.length(); i++){
          a = text.charAt(i);
          if(!Character.isAlphabetic(a)){
            int aInt = Character.getNumericValue(a);
            sum += aInt;
            System.out.println(sum);
          }
        }
        return sum;
      }
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

    // public long sequence(String text) {
    //
    // }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    // public String intertwine(String a, String b) {
    //
    // }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    // public boolean isPalindrome(String text) {
    //
    // }
}
