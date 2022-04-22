import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    in A = in.nextInt();
    string B = in.next();

    in.close();

    System.out.println(A*(B.charAt(2)-'0'));
    System.out.println(A*(B.charAt(1)-'0'));
    System.out.println(A*(B.charAt(0)-'0'));
    system.out.println(A*Integer.parseInt(B));
  }
}