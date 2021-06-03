package models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class BookstoreItem {
    protected String name;
    protected String genre;
    protected int numOfPages;
}
