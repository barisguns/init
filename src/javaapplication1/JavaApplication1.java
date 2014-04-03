/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Bar
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JavaApplication1 myApp =new JavaApplication1();
        String name = myApp.readName();
        
        System.out.println("bar" + name);
    }
    private String readName(){
        Scanner sc = new Scanner(System.in);
        String name;
        
        System.out.println("wassup");
        name = sc.nextLine();
        
        return name;
    }
}
