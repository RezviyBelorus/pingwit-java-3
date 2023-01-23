package org.example.lec_16.point_1.comparator;

import org.example.lec_16.point_1.entity.Book;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.author().compareTo(o2.author());
    }

}
