package com.k001.canh;

import java.util.Scanner;

public class InformationOfBooks extends Book {
    Book addABook() {
        Book newBook = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a major (Select a option):\n1. Information Technology\n2. Science - Life\n3. Literature - Art");
        int option = scanner.nextInt();

        switch (option) {
            case 1: {
                newBook.setMajor("Information Technology");
                break;
            }
            case 2: {
                newBook.setMajor("Science - Life");
                break;
            }
            case 3: {
                newBook.setMajor("Literature - Art");
                break;
            }
            default:
                newBook.setMajor("");
        }

        String getSpareCharater = scanner.nextLine();

        System.out.println("ID of book:");
        newBook.setId(scanner.nextLine());

        System.out.println("Name of book:");
        newBook.setName(scanner.nextLine());

        System.out.println("Name of Author:");
        newBook.setAuthor(scanner.nextLine());

        System.out.println("Name of Publisher:");
        newBook.setPublisher(scanner.nextLine());

        System.out.println("Number of Pages:");
        newBook.setNumberOfPages(scanner.nextInt());
        return newBook;
    }

    void displayList(Book[] books, int numberOfBooks) {
        for (int i = 1; i <= numberOfBooks; i++) {
            System.out.println("ID: " + books[i].getId());
            System.out.println("Name: " + books[i].getName());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Publisher: " + books[i].getPublisher());
            System.out.println("Major: " + books[i].getMajor());
            System.out.println("Number of Pages: " + books[i].getNumberOfPages());
        }
    }

    public static void main(String[] args) {

        InformationOfBooks informationOfBooks = new InformationOfBooks();
        Book[] books = new Book[100];
        Scanner scanner = new Scanner(System.in);
        int numberOfBooks = 0, option;

        do {
            System.out.println("Choose an option:\n1. Add a book\n2. Dislay list of books\n0. Get out");
            option = scanner.nextInt();
            if (option == 1) {
                numberOfBooks++;
                books[numberOfBooks] = informationOfBooks.addABook();
            }
            if (option == 2) {
                informationOfBooks.displayList(books, numberOfBooks);
            }
        } while (option != 0);
    }
}
