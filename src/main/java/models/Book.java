package models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Book extends RegularItem {
    public Book(String name, String author, String genre, int yearOfPublication, int numOfPages) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.yearOfPublication = yearOfPublication;
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nAuthor: " + author +
                "\nGenre: " + genre +
                "\nYear of publication: " +
                "\nNumber of pages: " + numOfPages;
    };
}