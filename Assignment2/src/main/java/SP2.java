/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * HARDIK HAJELA 
 * 105070182
 * 
 */
import java.util.*;
        
public class SP2 {
   // create a list object to store the items
   static LinkedList<Item> items = new LinkedList<Item>();
  
   public static void main(String[] args) {
      
      
       Scanner sc=new Scanner(System.in);
       int bllsize=0, shllsize=0,gfllsize=0;
       
       System.out.print("Enter the number of items you want to Enter.");
       int x= sc.nextInt();
       
       for(int i=0; i<x; i++){
            System.out.println("What kind of item'd you wanna Add?");
            System.out.println("Enter 1 for Book");
            System.out.println("Enter 2 for Giftcard");
            System.out.println("Enter 3 for Shoe");
            
            int y = sc.nextInt();
            
            if(y==1){
                System.out.print("Price:");
                double price=sc.nextDouble();
                System.out.print("Quantity:");
                int quan=sc.nextInt();
                System.out.print("Author:");
                String auth=sc.next();
                System.out.print("Title:");
                String title=sc.next();
                System.out.print("Year:");
                int year=sc.nextInt();
                   
                Item ib = new Book("Book",price,quan,title,auth, year);
                items.add(ib);
                bllsize++;
            }
            
            else if(y==2){
                System.out.print("Price:");
                double price=sc.nextDouble();
                System.out.print("Quantity:");
                int quan=sc.nextInt();
                System.out.print("Title:");
                String title=sc.next();
                System.out.print("Label:");
                String label=sc.next();
                System.out.print("Manufacturer:");
                String manf=sc.next();
                   
                Item ig = new GiftCard("GiftCard",price,quan,title,label,manf);
                items.add(ig);
                gfllsize++;
            }
            else if(y==3){
                System.out.print("Price:");
                double price=sc.nextDouble();
                System.out.print("Quantity:");
                int quan=sc.nextInt();
                System.out.print("Colour:");
                String col=sc.next();
                System.out.print("Size:");
                double size=sc.nextDouble();
                   
                Item is = new Shoe("Shoe",price,quan,col,size);
                items.add(is);
                shllsize++;
            }
           
       }
       //add items in the list
       
       Book[] arrayOfBooks = items.toArray(new Book[bllsize]);
        Arrays.sort(arrayOfBooks);
        
       GiftCard[] arrayOfGiftCards = items.toArray(new GiftCard[gfllsize]);
        Arrays.sort(arrayOfGiftCards);
                
       Shoe[] arrayOfShoes = items.toArray(new Shoe[shllsize]);
        Arrays.sort(arrayOfShoes);
      
       //display all items
       System.out.println("All items in the store: ");
       for (Item item : items) {
       item.display();
       }
      
       //display books
       System.out.println("\nBooks in the store: ");
       for(Item item : items) {
           if(item.title == "Book") {
               item.display();
           }
       }
      
       //display gifts
       System.out.println("\nGifts in the store: ");
       for(Item item : items) {
           if(item.title == "GiftCard") {
               item.display();
           }
       }
      
       //display shoes
       System.out.println("\nShoes in the store: ");
       for(Item item : items) {
           if(item.title == "Shoe") {
               item.display();
           }
       }

   }

}