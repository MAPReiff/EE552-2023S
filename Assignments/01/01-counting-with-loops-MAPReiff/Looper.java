// I pledge my honor that I have abided by the Stevens Honor System
import java.io.Console;

public class Looper {
  public static void printOdds(){
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }
  }

  public static void printEvens(){
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

  public static void printPowersOfTwo(){

    // for this, I use the math class to get access to the `.pow()` function
    // as this seemed to not return ints, I used type casting to make them ints

    for (int i = 0; Math.pow(2, i) < 4096 + 1; i++) {
      System.out.println((int) Math.pow(2, i));
    }

  }
  
  public static void main(String[] args){
    printOdds();
    printEvens();
    printPowersOfTwo();
  }
}

