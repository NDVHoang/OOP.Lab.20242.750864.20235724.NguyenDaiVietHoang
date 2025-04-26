package AimsProject.src.hust.soict.dsai.test.cart;

import AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.book.Book;
import AimsProject.src.hust.soict.dsai.aims.disc.CompactDisc;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Add media items to cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(101, "Inception", "Sci-Fi", 15.5f, 148, "Christopher Nolan");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(102, "Interstellar", "Sci-Fi", 17.0f, 169, "Christopher Nolan");
        CompactDisc cd = new CompactDisc(103, "Future Nostalgia", "Pop", 14.5f, 38, "The Monsters", "Dua Lipa");
        Book book1 = new Book(104, "Atomic Habits", "Self-help", 13.0f, new ArrayList<>());
        Book book2 = new Book(105, "Deep Work", "Productivity", 12.0f, new ArrayList<>());
        Media game = new Media(107, "Cyberpunk 2077", "Game", 59.99f);
        Media podcast = new Media(110, "99% Invisible", "Podcast", 0.00f);

        // Add to cart
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(cd);
        cart.addMedia(book1);
        cart.addMedia(book2);
        cart.addMedia(game);
        cart.addMedia(podcast);

        // Display cart contents
        cart.displayCart();

        // Test search methods
        System.out.println("\n--- Search by ID (104) ---");
        var resultById = cart.idSearch(104);
        System.out.println(resultById != null ? resultById : "Not found.");

        System.out.println("\n--- Search by Title (Interstellar) ---");
        var resultByTitle = cart.titleSearch("Interstellar");
        System.out.println(resultByTitle != null ? resultByTitle : "Not found.");
    }
}
