/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.lang.*;
import java.util.Scanner;

class Area1{
    int b,h;
    float a;
    public void getDetails1()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input breadth");
        b= sc.nextInt();
        System.out.println("Input Height");
        h=sc.nextInt();
        a= 0.5f * b * h;
        System.out.println("area= " + a);
        
    }
            
}
/**
 *
 * @author Dell
 */
public class AreaOfTriangle {
    
    public static void main(String[] args){
        Area1 a= new Area1();
        a.getDetails1();
        
    }
    
    
}
