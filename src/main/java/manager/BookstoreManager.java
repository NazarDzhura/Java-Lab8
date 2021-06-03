package manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import models.BookstoreItem;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class BookstoreManager {
    private List<BookstoreItem> items;

    public List<BookstoreItem> searchBy(String genre) {
        return items.stream()
                .filter(item -> item.getGenre().equals(genre))
                .collect(Collectors.toList());
    }

    public List<BookstoreItem> sortByNumOfPages(SortOrder sortOrder) {
        return getItems(sortOrder, Comparator.comparing(BookstoreItem::getNumOfPages));
    }

    public List<BookstoreItem> sortByGenre(SortOrder sortOrder) {
        return getItems(sortOrder, Comparator.comparing(BookstoreItem::getGenre));
    }

    private List<BookstoreItem> getItems(SortOrder sortOrder, Comparator<BookstoreItem> comparing) {
        if (sortOrder.equals(SortOrder.ASC)) {
            return items.stream()
                    .sorted(comparing)
                    .collect(Collectors.toList());
        }
        return items.stream()
                .sorted(comparing.reversed())
                .collect(Collectors.toList());
    }

    public void printItems(List<BookstoreItem> items) {
        items.forEach(System.out::println);
    }
}
