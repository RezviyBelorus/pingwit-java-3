package org.example.lec_16.point_1.comparator;

import org.example.lec_16.point_1.entity.Book;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.name().compareTo(o2.name());
    }

}
