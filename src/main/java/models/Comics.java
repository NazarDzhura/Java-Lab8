package models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Comics extends RegularItem {
    public Comics(String name, String author, String genre, int yearOfPublication, int numOfPages) {
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
                "\nYear of publication: " + yearOfPublication +
                "\nNumber of pages: " + numOfPages;
    };
}