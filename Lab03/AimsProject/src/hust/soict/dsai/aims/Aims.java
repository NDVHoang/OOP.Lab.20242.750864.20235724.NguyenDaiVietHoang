package AimsProject.src.hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.Scanner;

import AimsProject.src.hust.soict.dsai.aims.book.Book;
import AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.disc.CompactDisc;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.disc.Track;
import AimsProject.src.hust.soict.dsai.aims.media.Media;
import AimsProject.src.hust.soict.dsai.aims.store.Store;

public class Aims {
    static Scanner inp = new Scanner(System.in);
    static Store store = new Store();
    static Cart cart = new Cart();

    public static void main(String[] args) {
        loadNewExample();
        mainMenu();
    }

    public static void loadNewExample() {
        store.addMedia(new DigitalVideoDisc(101, "Inception", "Sci-Fi", 15.5f, 148, "Christopher Nolan"));
        store.addMedia(new DigitalVideoDisc(102, "Interstellar", "Sci-Fi", 17.0f, 169, "Christopher Nolan"));
        store.addMedia(new CompactDisc(103, "Future Nostalgia", "Pop", 14.5f, 38, "The Monsters", "Dua Lipa"));
        store.addMedia(new Book(104, "Atomic Habits", "Self-help", 13.0f, new ArrayList<>()));
        store.addMedia(new Book(105, "Deep Work", "Productivity", 12.0f, new ArrayList<>()));
        store.addMedia(new Book(106, "The Game Changer", "Business", 20.0f, new ArrayList<>()));

        store.addMedia(new Media(107, "Cyberpunk 2077", "Game", 59.99f));
        store.addMedia(new Media(108, "The Witcher 3", "Game", 39.99f));
        store.addMedia(new Media(109, "National Geographic", "Magazine", 6.99f));
        store.addMedia(new Media(110, "99% Invisible", "Podcast", 0.00f));
    }

    public static void mainMenu() {
        while (true) {
            System.out.println("\n===== WELCOME TO MEDIA STORE =====");
            System.out.println("| 1. Browse Store                |");
            System.out.println("| 2. Your Cart                  |");
            System.out.println("| 3. Update Store               |");
            System.out.println("| 0. Exit                       |");
            System.out.println("==================================");
            System.out.print("Select: ");

            int choice = inp.nextInt(); inp.nextLine();
            switch (choice) {
                case 0: return;
                case 1: browseStore(); break;
                case 2: cartMenu(); break;
                case 3: updateStore(); break;
                default: System.out.println("Invalid option.");
            }
        }
    }

    public static void browseStore() {
        store.print();
        while (true) {
            System.out.println("\n===== BROWSE MENU =====");
            System.out.println("| 1. Media Details           |");
            System.out.println("| 2. Add to Cart             |");
            System.out.println("| 3. Play Media              |");
            System.out.println("| 0. Back                    |");
            System.out.println("===========================");
            System.out.print("Choose: ");

            int choice = inp.nextInt(); inp.nextLine();
            switch (choice) {
                case 0: return;
                case 1: mediaDetails(); break;
                case 2: addMediaToCart(); break;
                case 3: playMedia(); break;
                default: System.out.println("Try again.");
            }
        }
    }

    public static void mediaDetails() {
        System.out.print("Enter media title: ");
        String title = inp.nextLine();
        Media media = store.getMedia(title);
        if (media != null) {
            System.out.println("Info: " + media.toString());
        } else {
            System.out.println("Not found.");
        }
    }

    public static void addMediaToCart() {
        System.out.print("Enter media title to add: ");
        String title = inp.nextLine();
        Media media = store.getMedia(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Added to cart.");
        } else {
            System.out.println("Not found.");
        }
    }

    public static void playMedia() {
        System.out.print("Enter title to play: ");
        String title = inp.nextLine();
        Media media = store.getMedia(title);
        if (media instanceof DigitalVideoDisc dvd) {
            dvd.play();
        } else if (media instanceof CompactDisc cd) {
            cd.play();
        } else {
            System.out.println("This media is not playable.");
        }
    }

    public static void cartMenu() {
        cart.displayCart();
        while (true) {
            System.out.println("\n===== CART MENU =====");
            System.out.println("| 1. Remove Media            |");
            System.out.println("| 2. Sort by Title           |");
            System.out.println("| 3. Sort by Price           |");
            System.out.println("| 4. Checkout                |");
            System.out.println("| 0. Back                    |");
            System.out.println("===========================");
            System.out.print("Select: ");

            int choice = inp.nextInt(); inp.nextLine();
            switch (choice) {
                case 0: return;
                case 1: removeMedia(); break;
                case 2: cart.sortByTitle(); break;
                case 3: cart.sortByPrice(); break;
                case 4:
                    System.out.println("Checkout complete!");
                    cart.empty(); return;
                default: System.out.println("Invalid.");
            }
        }
    }

    public static void removeMedia() {
        System.out.print("Enter title to remove: ");
        String title = inp.nextLine();
        Media media = cart.titleSearch(title);
        if (media != null) {
            cart.removeMedia(media);
            System.out.println("Removed from cart.");
        } else {
            System.out.println("Not in cart.");
        }
    }

    public static void updateStore() {
        System.out.println("\n===== UPDATE STORE =====");
        System.out.print("1. Add | 2. Remove | 0. Back: ");
        int opt = inp.nextInt(); inp.nextLine();

        if (opt == 1) {
            System.out.print("Enter new media (ID Title Category Cost): ");
            int id = inp.nextInt(); inp.nextLine();
            String title = inp.nextLine();
            String category = inp.nextLine();
            float cost = inp.nextFloat(); inp.nextLine();
            store.addMedia(new Media(id, title, category, cost));
            System.out.println("Added.");
        } else if (opt == 2) {
            System.out.print("Enter title to remove: ");
            String title = inp.nextLine();
            store.removeMedia(title);
            System.out.println("Removed.");
        }
    }
}
