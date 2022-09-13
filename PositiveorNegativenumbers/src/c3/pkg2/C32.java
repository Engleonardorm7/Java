/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3.pkg2;
import java.util.Scanner;

/**
 *
 * @author techn
 */
public class C32 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int input;
        String input2;        
        
        System.out.print("Type a number: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        if (input>0){
            
                    System.out.println("Number is positive");

        }else if(input<0){
            
            System.out.println("Number is Negative");
            
            
        }else{
                System.out.println("Number is Zero");
                }
    }
}
