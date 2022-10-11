
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */

public class z2 {
    public static int getFactorial(int f) {
  int result = 1;
  for (int i = 1; i <= f; i++) {
     result = result * i;
  }
  return result;
}
    public static void main(String[] args){
  int n;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    if (n<10){
    System.out.println("factorial:" + getFactorial(n));
 }
    }
}
