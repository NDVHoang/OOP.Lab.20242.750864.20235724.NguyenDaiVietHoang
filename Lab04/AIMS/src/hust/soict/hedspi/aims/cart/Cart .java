package hust.soict.hedspi.aims.cart;


import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    private static final int MAX_ITEMS = 20;
    private ArrayList<Media> cartItems = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addMedia(Media media) {
        if (cartItems.size() < MAX_ITEMS && !cartItems.contains(media)) {
            cartItems.add(media);
        } else {
            System.out.println("The cart is almost full or the item already exists.");
        }
    }

    public void removeMedia(Media media) {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty");
        } else if (cartItems.contains(media)) {
            cartItems.remove(media);
        } else {
            System.out.println("The item is not in the cart");
        }
    }

    public float getTotalCost() {
        float sum = 0;
        for (Media media : cartItems) {
            sum += media.getCost();
        }
        return sum;
    }

    public void displayCart() {
        System.out.println("****************** CART ******************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println((i + 1) + ". " + cartItems.get(i).toString());
        }
        System.out.println("******************************************");
    }

    public Media searchById(int id) {
        for (Media media : cartItems) {
            if (media.getId() == id) {
                return media;
            }
        }
        System.out.println("No item with matching ID found.");
        return null;
    }

    public Media searchByTitle(String title) {
        for (Media media : cartItems) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        System.out.println("No item with matching title found.");
        return null;
    }

    public void clearCart() {
        cartItems = new ArrayList<>();
    }

    public void sortByTitle() {
        cartItems.sort(Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCost() {
        cartItems.sort(Media.COMPARE_BY_COST_TITLE);
    }
}