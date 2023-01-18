/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.lang.*;
import java.util.Scanner;

class circum{
    int r;
    float pi,c;
    public void getDetails()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("input radius");
        r= sc.nextInt();
        pi= 3.14f;
        
        c= 2*r*pi;
        System.out.println("Circumference of circle= "+ c);
        
    }
}
        

/**
 *
 * @author Dell
 */
public class Circumference {
    public static void main(String[] args)
    {
        circum c= new circum();
        c.getDetails();
    }
    
    
}
