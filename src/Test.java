
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Test {
    
    public static void main(String[] args) {
        int a,b,operation,result;
        Scanner sc= new Scanner(System.in);
        System.out.println("select operation:");
        operation=sc.next().charAt(0);
        System.out.println("enter first number:");
        a= sc.nextInt();
         System.out.println("enter second number:");
        b= sc.nextInt();
    
     switch(operation){
         case '+':
                 result=a+b;
             System.out.println("addition of 2 no is :"+result);
             break;
             case '*':
                 result=a*b;
                 System.out.println("multiplication of 2 no is :"+result);
                 break;
                 case '-':
                 result=a-b;
                 System.out.println("subtraction of 2 no is :"+result);
                 break;
                     case '/':
                 result=a/b;
                 System.out.println("division of 2 no is :"+result);
                 break;
                     
                 default:
               System.err.println("invalid operation!");
                     break;
     }
  
    }
}
