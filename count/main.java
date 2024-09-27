package count;


public class main {
  public static void main(String[] args) {
    String words = "One Two Three Four";
    int countWords = words.split("\\s").length;
    System.out.println(countWords);
  }
}
​
