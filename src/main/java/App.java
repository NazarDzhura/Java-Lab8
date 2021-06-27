import manager.BookstoreManager;
import manager.SortOrder;
import models.Book;
import models.BookstoreItem;
import java.util.List;


public class App {
    public static void main(String[] args) {
        List<BookstoreItem> listOfItems = List.of(
            new Book("Tropic of Cancer", "Henry Miller", "Autobiographical novel", 1934, 318),
            new Book("1984", "George Orwell", "Novel", 1949, 328),
            new Book("Junkie", "William S. Burroughs", "Autobiographical novel", 1953, 166),
            new Book("Edinburgh", "Alexander Chee", "Autobiographical novel", 2001, 209),
            new Book("Giovanni's Room", "James Baldwin", "Poem", 1956, 159),
            new Book("On the Road", "Jack Kerouac", "Autobiographical novel", 1957, 320)
        );

        BookstoreManager manager = new BookstoreManager(listOfItems);

        System.out.println("Unsorted list of autobiographical novel genre items:");
        manager.printItems(manager.searchBy("Autobiographical novel"));

        System.out.println("\nList of items sorted by number of pages by ascending:");
        manager.printItems(manager.sortByNumOfPages(SortOrder.ASC));
        }
    }

