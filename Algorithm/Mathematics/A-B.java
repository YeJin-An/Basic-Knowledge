import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int num = in.nextInt();
    int Num = in.nextInt();

    System.out.println(num-Num);

    in.close();
  }
}