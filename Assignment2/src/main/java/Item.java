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
 */
import java.util.*;

abstract class Item{
   private static int count = 0;
   protected int itemID;
   protected double price;
   protected int quantity;
   protected String title;
  
   public abstract void display();
   public abstract void purchase();
  
   public Item()
   {
       itemID = ++count;
   }
}

class Book extends Item{
  
   private String author;
   private int year;
   public Book(String title, double price, int quantity, String author,String bookTitle, int year)
   {
       this.price = price;
       this.quantity = quantity;
       this.title = title;
       this.author = author;
       this.year = year;
   }
  
   @Override
   public void display() {
       System.out.println("Book id: " + itemID + ", Price: " + price + ", Quantity: " + quantity + ", Author: " + author + ", year: " + year);
   }

   @Override
   public void purchase() {
       quantity = quantity - 1;
   }
   
   public int compareTo(Book b) {
	  return ((int)this.author.charAt(0) - (int)b.author.charAt(0));
	}
  
}

class GiftCard extends Item{

   private String label;
   private String manufacturer;
  
   public GiftCard(String title, double price, int quantity, String label, String manufacturer)
   {
       this.price = price;
       this.quantity = quantity;
       this.title = title;
       this.label = label;
       this.manufacturer = manufacturer;
   }

    GiftCard(String giftCard, double price, int quan, String title, String label, String manf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
   @Override
   public void display() {
       System.out.println("GiftCard id: " + itemID + ", Price: " + price + ", Quantity: " + quantity + ", Label: " + label + ", Manufacturer: " + manufacturer);
   }

   @Override
   public void purchase() {
       quantity = quantity - 1;
   }
   
   
    public int compareTo(GiftCard g) {
	  return ((int)this.label.charAt(0) - (int)g.label.charAt(0));
	}
}

class Shoe extends Item{

   private String color;
   private double size;
  
   public Shoe(String title, double price, int quantity, String color, double size)
   {
       this.price = price;
       this.quantity = quantity;
       this.title = title;
       this.color = color;
       this.size = size;
   }
  
   @Override
   public void display() {
       System.out.println("Shoe id: " + itemID + ", Price: " + price + ", Quantity: " + quantity + ", Color: " + color + ", Size: " + size);
      
   }

   @Override
   public void purchase() {
       quantity = quantity - 1;
   }
   
   public int compareTo(Shoe s) {
	  return ((int)this.size - (int)s.size);
	}
  
}

