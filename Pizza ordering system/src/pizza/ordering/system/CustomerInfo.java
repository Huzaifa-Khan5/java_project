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
public class CustomerInfo { 
    String id,name,phonenumber;
    void showCutomerInfo(){
        Scanner input=new Scanner (System.in);
        LinkList ll=new LinkList();
        System.out.print("Enter Customer id:");
        id=input.next();
        System.out.print("Enter Customer name:");
        name=input.next();
        System.out.print("Enter Customer phone number:");
        phonenumber=input.next();
    }
    }

