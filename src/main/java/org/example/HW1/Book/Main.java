package org.example.HW1.Book;

public class Main {
    public static void main(String[] args) {

        Book bookOne = new Book();
        bookOne.setName("Первая книга");
        bookOne.setYear(1883);
        bookOne.setAuthor("Гоголь");

        bookOne.display();
    }
}