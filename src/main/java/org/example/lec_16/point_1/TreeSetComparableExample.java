package org.example.lec_16.point_1;

import org.example.lec_16.point_1.entity.Book;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparableExample {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(4);
        integers.add(5);
        integers.add(1);

        System.out.println(integers);

        Set<Book> books = new TreeSet<>();
        books.add(new Book("Polski od Wolskich", "Centr slavyanskich technologiy", 2015));
        books.add(new Book("Polski od Wolskich", "A", 2015));
        books.add(new Book("Polski od Wolskich", "A", 2016));
        books.add(new Book("Mumu", "Turgenev", 1854));
        books.add(new Book("H.Potter", "J.Rolling", 2001));

        for (Book book : books) {
            System.out.println(book);
        }
    }

}
