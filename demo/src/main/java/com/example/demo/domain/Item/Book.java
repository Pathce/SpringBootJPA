package com.example.demo.domain.Item;

import com.example.demo.controller.BookForm;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("B")
@Getter @Setter
public class Book extends Item {

    private String author;
    private String isbn;

    public void createBook(BookForm form) {
        setName(form.getName());
        setPrice(form.getPrice());
        setStockQuantity(form.getStockQuantity());
        setAuthor(form.getAuthor());
        setIsbn(form.getIsbn());
    }
}
