/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.lang.*;
import java.util.Scanner;

class SI{
    int p,r,t,si;
    public void getDetails()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input Principle");
        p= sc.nextInt();
        System.out.println("Input rate");
        r=sc.nextInt();
        System.out.println("input time");
        t=sc.nextInt();
        
        si=(p*t*r)/100;
        System.out.println("Simple Interest= "+ si);
    }
}

/**
 *
 * @author Dell
 */
public class SimpleInterest {
    public static void main(String[] args)
    {
        SI si= new SI();
        si.getDetails();
    }
}
