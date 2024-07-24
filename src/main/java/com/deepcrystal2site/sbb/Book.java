package com.deepcrystal2site.sbb;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private String title;
    private String author;

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("메밀꽃필무렵");
        book.setAuthor("이준영");

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
    }

}
