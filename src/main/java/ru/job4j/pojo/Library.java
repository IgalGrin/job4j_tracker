package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book bookOne = new Book("The Adventures of Tom Sawer", 160);
        Book bookTwo = new Book("Lord Of TheRings", 1200);
        Book bookThree = new Book("Myth Adventyres", 980);
        Book bookFourth = new Book("Clean code", 460);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFourth;
        for (Book book : books) {
            String s = book.getName() + " - " + book.getPages();
            System.out.println(s);
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            String s = book.getName() + " - " + book.getPages();
            System.out.println(s);
        }
        System.out.println();
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
