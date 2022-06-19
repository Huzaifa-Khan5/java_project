package pizza.ordering.system;


import java.util.Scanner;


public class Order {
    int quantity,price1,price2,price3;
    String size,flavour,meat,cheese,extratopping,topping,again;
    Scanner input=new Scanner(System.in);
    void Quantity(){
        System.out.println("");
        System.out.print("How many pizza you want to buy:");
        quantity=input.nextInt();
}
    void Size(){
        for(int i=1;i<=quantity;i++){
            System.out.println("Which size you want to buy for pizza "+i);
            System.out.println("Small=s, Medium=m, Large=l");
            size=input.next();
        if(size.equals("s")){
                price1=1*180;
                System.out.println("Price of Small pizza:"+price1);
                System.out.println();
                System.out.println("You want topping or not");
                System.out.println("Yes or No");
                extratopping=input.next();
                if(extratopping.equals("yes")){
                    System.out.println();
                    System.out.println("Which topping you want Meat,Cheese or both");
                    topping=input.next();
                    if(topping.equals("meat")){
                            System.out.println("for small pizza meat extra topping price is 40");
                            price1=price1+40;
                            System.out.println("The price with meat topping is: "+price1);                      
                    }            
                    else if(topping.equals("cheese")){                     
                            System.out.println("for small pizza cheese extra topping price is 50");
                            price1=price1+50;
                            System.out.println("The price with cheese topping is: "+price1);
            }
                    else if(topping.equals("both")){
                        System.out.println("For small pizza both meat and cheese extratopping price is 100");
                        price1=price1+100;
                        System.out.println("The price with meat and cheese topping is: "+price1);
                    }
            }
                else if(extratopping.equals("no")){
                    System.out.println("price is:"+price1);
                }
        }
        else if(size.equals("m")){
                price2=1*350;
                System.out.println("Price of Medium Pizza:"+price2);
                System.out.println();
                System.out.println("You want topping or not");
                System.out.println("Yes or No");
                extratopping=input.next();
                if(extratopping.equals("yes")){
                    System.out.println();
                    System.out.println("Which topping you want Meat,Cheese or both");
                    topping=input.next();
                    if(topping.equals("meat")){        
                            System.out.println("for medium pizza meat extra topping price is 70");   
                            price2=price2+70;
                            System.out.println("The price with topping is "+price2);
                    }            
                    else if(topping.equals("cheese")){
                            System.out.println("for medium pizza cheese extra topping price is 90");
                            price2=price2+90;
                            System.out.println("The price with topping is "+price2);
            }
                    else if(topping.equals("both")){
                        System.out.println("For mesium pizza both meat and cheese extratopping price is 150");
                        price2=price2+150;
                        System.out.println("The price with meat and cheese topping is: "+price2);
                    }
            }
                else if(extratopping.equals("no")){
                    System.out.println("price is:"+price2);
                }
        }
        else if(size.equals("l")){
                price3=1*450;
                System.out.println("Price of Large Pizza:"+price3);
                System.out.println();
                System.out.println("You want topping or not");
                System.out.println("Yes or No");
                extratopping=input.next();
                if(extratopping.equals("yes")){
                    System.out.println();
                    System.out.println("Which topping you want Meat,Cheese or both");
                    topping=input.next();
                    if(topping.equals("meat")){                     
                            System.out.println("for large pizza meat extra topping price is 100");  
                            price3=price3+100;
                            System.out.println("The price with topping is "+price3);
                    }            
                    else if(topping.equals("cheese")){
                        System.out.println("for large pizza cheese extra topping price is 120");
                        price3=price3+120;
                        System.out.println("The price with topping is "+price3);           
            }
                    else if(topping.equals("both")){
                        System.out.println("For large pizza both meat and cheese extratopping price is 200");
                        price3=price3+200;
                        System.out.println("The price with meat and cheese topping is: "+price3);
                    }
            }
                else if(extratopping.equals("no")){
                    System.out.println("original price is:"+price3);
                }
        }
        else{
            System.out.println("invalid size");
        }
            System.out.println();
        }        
        }
    
    void Flavour(){
        for(int j=1;j<=quantity;j++){
            System.out.println("");
            System.out.println("tikka,fajita,afghani,bihari,malai,cheese,tandori,sicilian");
            System.out.println();
            System.out.println("Which flavour you want to buy for pizza "+j);
            flavour=input.next();
            if(flavour.equals("tikka")){
                
                System.out.println("You select Chicken Tikka for pizza "+j);               
            }
            else if(flavour.equals("fajita")){
                
                System.out.println("You select Chiken Fajita for pizza "+j);
        }
           else if(flavour.equals("afghani")){
                
                System.out.println("You select Afghani Tikka for pizza "+j);
    }
           else if(flavour.equals("bihari")){
                
                System.out.println("You select Bihari Tikka for pizza "+j);
    }
            else if(flavour.equals("malai")){
                
                System.out.println("You select malai Tikka for pizza "+j);
    }
            else if(flavour.equals("cheese")){
                
                System.out.println("You select cheese lover for pizza "+j);
                
}
            else if(flavour.equals("tandori")){
                
                System.out.println("You select chicken tandoori for pizza "+j);               
}
            else if(flavour.equals("sicilian")){
                
                System.out.println("You select fajita sicilian for pizza "+j);                
        }
            else{
                System.out.println("we donot serve this flavour");
                System.out.println("please enter again");
                again=input.next();
                if(again.equals("tikka")){
                    
                System.out.println("You select Chicken Tikka for pizza "+j);               
            }
            else if(again.equals("fajita")){
                    
                System.out.println("You select Chiken Fajita for pizza "+j);
        }
           else if(again.equals("afghani")){
                    
                System.out.println("You select Afghani Tikka for pizza "+j);
    }
           else if(again.equals("bihari")){
                    
                System.out.println("You select Bihari Tikka for pizza "+j);
    }
            else if(again.equals("malai")){
                    
                System.out.println("You select malai Tikka for pizza "+j);
    }
            else if(again.equals("cheese")){
                   
                System.out.println("You select cheese lover for pizza "+j);
                
}
            else if(again.equals("tandori")){
                    
                System.out.println("You select chicken tandoori for pizza "+j);               
}
            else if(again.equals("sicilian")){
                    
                System.out.println("You select fajita sicilian for pizza "+j);                
        }
                
            }
             System.out.println();
        }      
    }
} 