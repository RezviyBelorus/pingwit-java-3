package org.example.lec_16.point_1;

import org.example.lec_16.point_1.entity.Book;

import java.util.Comparator;

public class BookAuthorNameComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int authorResult = o1.author().compareTo(o2.author());

        if (authorResult != 0) {
            return authorResult;
        }

        int nameResult = o1.name().compareTo(o2.name());

        if (nameResult != 0) {
            return nameResult;
        }

        return o1.year().compareTo(o2.year());
    }

}
