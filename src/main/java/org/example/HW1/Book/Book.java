package org.example.HW1.Book;

public class Book implements Displayable {

   private String name;
   private String author;
   private int year;

   public String getName(){
       return name;
   }

   public String getAuthor(){
       return author;
   }

   public int year(){
       return year;
   }

   public void setName(String name){
       this.name = name;
   }

   public void setAuthor(String author){
       this.author = author;
   }

   public void setYear(int year){
       this.year = year;
   }

    @Override
    public void display() {
        System.out.println(this.name);
        System.out.println(this.author);
        System.out.println(this.year);
    }
}
