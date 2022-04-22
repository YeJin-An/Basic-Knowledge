import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    in.close();

    if(n%4==0){
      if(n%100!=0) System.out.println("1");
      else if(n%400==0) System.out.println("1");
      else System.out.println("0");
    }else{
      System.out.println("0");
    }
  }
}