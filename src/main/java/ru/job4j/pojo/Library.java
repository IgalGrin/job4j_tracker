package ru.job4j.pojo;

public class Library {
    public static Book[] swapBorder(Book[] array) {
        Book temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static Book findBook(Book[] array) {
        Book reply = array[0];
        Book request = new Book("Clean code", 460);
        for (Book exemplar : array) {
            if (exemplar.equals(request)) {
                reply = exemplar;
            }
        }
        return reply;
        }

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
        Book[] change = swapBorder(books);
        for (int index = 0; index < books.length; index++) {
            Book exemplar = change[index];
            System.out.println(exemplar.getName() + " - " + exemplar.getPages());
        }
        System.out.println();
        Book find = Library.findBook(books);
        System.out.println(find.getName() + " - " + find.getPages());
}
}
