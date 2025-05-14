package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> mediaList = new ArrayList<>();

    public Media findMediaByTitle(String title) {
        for (Media media : mediaList) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }

    public void addMedia(Media item) {
        if (!mediaList.contains(item)) {
            mediaList.add(item);
            System.out.println("Item successfully added to the store.");
        } else {
            System.out.println("Item already exists in the store.");
        }
    }

    public void removeMediaByTitle(String title) {
        Media media = findMediaByTitle(title);
        if (media != null) {
            mediaList.remove(media);
            System.out.println("Item successfully removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void displayStoreItems() {
        System.out.println("Available items in the store:");
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }

    public ArrayList<Media> getMediaList() {
        return mediaList;
    }
}
