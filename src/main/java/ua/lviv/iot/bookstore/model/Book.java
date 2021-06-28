package ua.lviv.iot.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    protected String name;
    protected String author;
    protected String genre;
    protected int yearOfPublication;
    protected int numOfPages;
}
