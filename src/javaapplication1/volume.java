/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package javaapplication1;

import java.lang.*;
import java.util.Scanner;

class Volume{
    int l,v;
    public void getDetails()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input Length");
        l= sc.nextInt();
        
        v= l*l*l;
        System.out.println("The volume is " + v);
    }
    
}

/**
 *
 * @author Dell
 */
public class volume {
    public static void main(String[] args){
        int l,v;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input Length");
        l= sc.nextInt();
        
        v= l*l*l;
        System.out.println("The volume is " + v);
    }
    
    
}
