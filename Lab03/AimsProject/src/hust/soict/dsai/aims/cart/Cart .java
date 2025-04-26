package AimsProject.src.hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Scanner;

import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class Cart {
    private Scanner scanner = new Scanner(System.in);
    public static final int MAX_ITEMS = 20;
    private ArrayList<Media> mediaList = new ArrayList<Media>();

    public void addItem(Media media) {
        if (mediaList.size() < MAX_ITEMS && !mediaList.contains(media)) {
            mediaList.add(media);
        } else {
            System.out.println("The cart is almost full or item already exists");
        }
    }

    public void removeItem(Media media) {
        if (!mediaList.isEmpty()) {
            if (mediaList.contains(media)) {
                mediaList.remove(media);
            } else {
                System.out.println("Item not found in cart");
            }
        } else {
            System.out.println("Cart is empty");
        }
    }

    public void showCart() {
        System.out.println("******************CART******************");
        System.out.println("Ordered Items: ");
        for (int i = 0; i < mediaList.size(); i++) {
            System.out.println((i + 1) + ". " + mediaList.get(i).toString());
        }
        System.out.println("****************************************");
    }

    public float calculateTotal() {
        float total = 0;
        for (Media m : mediaList) {
            total += m.getCost();
        }
        return total;
    }

    public Media findById(int mediaId) {
        for (Media m : mediaList) {
            if (m.getId() == mediaId) {
                return m;
            }
        }
        System.out.println("No matching ID found");
        return null;
    }

    public Media findByTitle(String mediaTitle) {
        for (Media m : mediaList) {
            if (m.getTitle().equals(mediaTitle)) {
                return m;
            }
        }
        System.out.println("No matching title found");
        return null;
    }

    public void clearCart() {
        mediaList = new ArrayList<>();
    }

    public void sortByTitleThenCost() {
        mediaList.sort(Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostThenTitle() {
        mediaList.sort(Media.COMPARE_BY_COST_TITLE);
    }
}
