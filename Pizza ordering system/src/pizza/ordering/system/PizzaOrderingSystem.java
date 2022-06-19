/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.ordering.system;

import java.util.Scanner;

/**
 *
 * @author nerd
 */
public class PizzaOrderingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        char choose;
        Scanner input=new Scanner(System.in);
        LinkList ll=new LinkList();
        CustomerInfo ci=new CustomerInfo();
        Menu m=new Menu();
        Order o=new Order();
        Drinks d=new Drinks();
        do{
            System.out.println("");
            System.out.println("Press "+"p"+" for print all orders");
            System.out.println("Press "+"o"+" for place order");
            System.out.println("Press "+"d"+" for delete the order"); 
            System.out.println("Press "+"e"+" for exit the program");
            System.out.println("");
            choose=input.next().charAt(0);
        switch(choose){
            case 'p':
                ll.traverse();
                break;
            case 'o':
                ll.operations();
                break;
            case 'd':
                String id=input.next();
                ll.deleteorder(id,ci.name,o.quantity);
                break;
            case 'e':
                System.out.println("======================================================");
                System.out.println("\t\t Thank you...");
                System.out.println("=======================================================");
                break;
            default:
                System.out.println("invalid option!!.Please enter again");
                break;
        }       
}
        while(choose!='e');
            System.out.println("Thank you...");        
}
}
