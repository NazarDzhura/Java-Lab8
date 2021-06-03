package models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Magazine extends PeriodicalPublishingItem {
    public Magazine(String name, String publisher, String genre, String dateOfPublication, int numOfPages) {
        this.name = name;
        this.publisher = publisher;
        this.genre = genre;
        this.dateOfPublication = dateOfPublication;
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nPublisher: " + publisher +
                "\nGenre: " + genre +
                "\nDate of publication: " + dateOfPublication +
                "\nNumber of pages: " + numOfPages;
    };
}