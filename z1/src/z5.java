
import static java.lang.Math.sqrt;
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
public class z5 {
    public static void main(String[] args){
    System.out.println("Katet: ");
        int a;
    Scanner s = new Scanner(System.in);
    a = s.nextInt();
    System.out.println("Gipotenuza: ");
    int c;
    Scanner q = new Scanner(System.in);
    c = q.nextInt();
     System.out.println("Katet2 = " + sqrt((c*c) - (a*a)));
    }
}
