/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.lang.*;
import java.util.Scanner;
class Area
{
    int l,b,a;
    public void getDetails ()
    {
        //l=4;
        //b=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of Length");
        l=sc .nextInt();
        System.out.println("Enter value of breadth");
        b= sc .nextInt();
        
        
        a=l*b;
        System.out.println("Area is " +a);
    }
}
public class JavaApplication1 {

    public static void main(String[] args) {
        Area a= new Area ();
        a.getDetails();
                
    }
    
}
