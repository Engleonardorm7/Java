/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3.pkg3;
import java.util.Scanner;

/**
 *
 * @author techn
 */
public class C33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
float unitprice=0f;
int quantity=0;
float revenue=0f;
float discount_rate=0.1f;
float discount_amount=0f;

Scanner sc=new Scanner(System.in);
System.out.print("Enter unit price:");
unitprice=sc.nextInt();
System.out.print("Enter quantity:");
quantity=sc.nextInt();

if(quantity<100){
    
revenue=unitprice*quantity;

}else if(quantity>=100){
    

revenue=unitprice*quantity;
discount_amount=revenue*discount_rate;
revenue-=discount_amount;
}
System.out.println("The revenue from sale:"+revenue+"$");
    }
    
}
