/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.ordering.system;

/**
 *
 * @author nerd
 */
class Node {
    Node next,previous;
    int bill,Customer_order;
    String Customer_name,Customer_id;
    public Node(String cid,int bill,String cname,int corder){
        this.Customer_id=cid;
        this.bill=bill;
        this.Customer_name=cname;
        this.Customer_order=corder;
    }
}

    

