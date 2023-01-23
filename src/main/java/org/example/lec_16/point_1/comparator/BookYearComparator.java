package org.example.lec_16.point_1.comparator;

import org.example.lec_16.point_1.entity.Book;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.year().compareTo(o2.year());
    }

}
