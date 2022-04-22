import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    int Num = scanner.nextInt();
    int yes = num + Num;

    System.out,println(yes);

    scanner.close();
  }
}