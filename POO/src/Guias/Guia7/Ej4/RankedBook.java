package Guias.Guia7.Ej4;

import java.util.Objects;
import java.util.TreeSet;

public class RankedBook implements Comparable<RankedBook> {

    private int points;
    final Book book;
    final Genre genre;

    public RankedBook(Book book, Genre genre){
        this.book = book;
        this.genre = genre;
    }

    public RankedBook(Book book){
        this.book = book;
        this.genre = null;
        this.points = 1;
    }

    public RankedBook(RankedBook rBook){
        this.genre = rBook.genre;
        this.book = rBook.book;
        this.points = rBook.points + 1;
    }

    @Override
    public int hashCode(){
        return Objects.hash(book, genre);
    }

    @Override
    public boolean equals(Object o){
        return o instanceof RankedBook rBook &&
                this.book.equals(rBook.book) &&
                this.genre.equals(rBook.genre);
    }

    @Override
    public int compareTo(RankedBook bookObj){
        int cmp = Integer.compare(this.points, bookObj.points);
        if(cmp == 0){
            cmp = this.book.compareTo(bookObj.book);
        }
        return cmp;
    }



}
