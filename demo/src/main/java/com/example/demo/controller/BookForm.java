package com.example.demo.controller;

import com.example.demo.domain.Item.Book;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {

    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    private String author;
    private String isbn;

    public void createBookForm(Book item) {
        setId(item.getId());
        setName(item.getName());
        setPrice(item.getPrice());
        setStockQuantity(item.getStockQuantity());
        setAuthor(item.getAuthor());
        setIsbn(item.getIsbn());
    }
}
