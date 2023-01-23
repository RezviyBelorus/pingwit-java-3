package org.example.lec_16.point_1.entity;

public record Book (
    String name,
    String author,
    Integer year
) implements Comparable<Book>
{

    @Override
    public int compareTo(Book o) {
        int nameResult = this.name.compareTo(o.name());

        if (nameResult != 0) {
            return nameResult;
        }

        int authorResult = this.author.compareTo(o.author());

        if (authorResult != 0) {
            return authorResult;
        }

//        return this.year - o.year;
        return this.year.compareTo(o.year);
    }

}
