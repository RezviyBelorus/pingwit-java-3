package org.example.lec_16.point_1;

import org.example.lec_16.point_1.entity.Book;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetComparatorExample {
    public static void main(String[] args) {
        BookAuthorNameComparator comparator = new BookAuthorNameComparator();
        Comparator<Book> reversed = comparator.reversed();

        Set<Book> books = new TreeSet<>(reversed);

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
