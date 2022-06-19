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
public class LinkList {
    Node head, tail = null;    
    void addorder(String cid,String cname,int price,int corder){
        Node nn=new Node(cid,price,cname,corder);
        if(head == null) {
            head = tail = nn; 
            head.previous = null;
            tail.next = null;
            }
            else {
            tail.next = nn;
            nn.previous = tail; 
            tail = nn;
            tail.next = null;
        }
    }
    void traverse(){
        Node element=this.head;
        if(element==null){
            System.out.println("there is no order");
        }
        else{
            while(element!=null){
                System.out.println("customer name:"+element.Customer_name);
                System.out.println("customer order:"+element.Customer_order);
                System.out.println("customer id:"+element.Customer_id);
                System.out.println("customer bill:"+element.bill);
                System.out.println("");
                element=element.next;
            }
        }
    }   
    void deleteorder(String cid,String cname,int corder){
        Node temp = head, prev = null;
        if (head.Customer_id == cid) {
            head = head.next;
        } 
        else {
            while (temp.next != null) {
                if (temp.next.Customer_id.equals(cid)) {
                    temp.next = temp.next.next;
                    break;
        } 
                else {
            temp = temp.next;
        }
    }   
}
    }
    void operations(){
        LinkList ll=new LinkList();
        CustomerInfo cf=new CustomerInfo();
        Menu m=new Menu();
        Order o=new Order();
        Drinks d=new Drinks();
        m.showMenu();
        cf.showCutomerInfo();
        o.Quantity();
        o.Flavour();
        o.Size();
        d.Drink();
        int totalprice=o.price1+o.price2+o.price3+d.price;
        addorder(cf.id,cf.name,totalprice, o.quantity);
        System.out.println("\n\t\t\t\t*****************************");
        System.out.println("\t\t\t\t    *****Total bill*****");
        System.out.println("\t\t\t\t*****************************");
        System.out.println("\t\t\t\tToken number is:    "+cf.id);
        System.out.println("\t\t\t\tCustomer name is:   "+cf.name);
        System.out.println("\t\t\t\tC.phone number is:  "+cf.phonenumber);
        System.out.println("\t\t\t\tQuantity :          "+o.quantity);
        System.out.println("\t\t\t\tTotal Amount is:    "+totalprice+"Rs");
        System.out.println("\n\t\t\t\t*****************************"); 
        System.out.println("\t\t\t\t     *****Thankyou*****");
        System.out.println("\t\t\t\t*****************************"); 
        }
    }
    
    
    
          
    

        
    





