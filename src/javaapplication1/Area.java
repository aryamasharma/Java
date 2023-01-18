/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.lang.*;
import java.util.Scanner;

class Z
{
    public void getZ()
    {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of length");
    int l=sc.nextInt();
        System.out.println("Enter value of breadth");
        int b=sc.nextInt();
        int a=l*b;
        System.out.println("Area is"+a);
    }
}

public class Area {
   public static void main(String[] args) {
       Z z1=new Z();
       z1.getZ();
       
   }
    
}
