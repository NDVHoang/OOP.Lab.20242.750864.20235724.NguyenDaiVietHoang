package AimsProject.src.hust.soict.dsai.aims.store;

import java.util.ArrayList;

import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> mediaItemsInStore = new ArrayList<Media>();

    public Media getMedia(String mediaTitle) {
        for (Media media : mediaItemsInStore) {
            if (media.getTitle().equals(mediaTitle)) {
                return media;
            }
        }
        return null;
    }

    public void addMedia(Media mediaItem) {
        if (!mediaItemsInStore.contains(mediaItem)) {
            mediaItemsInStore.add(mediaItem);
            System.out.println("The item has been added");
        } else {
            System.out.println("The item already exists");
        }
    }

    public void removeMedia(Media mediaItem) {
        if (!mediaItemsInStore.isEmpty()) {
            if (mediaItemsInStore.contains(mediaItem)) {
                mediaItemsInStore.remove(mediaItem);
                System.out.println("The item has been removed");
            } else {
                System.out.println("The item is not in the store");
            }
        } else {
            System.out.println("The store is empty");
        }
    }

    public void removeMedia(String mediaTitle) {
        mediaItemsInStore.remove(getMedia(mediaTitle));
    }

    public void print() {
        System.out.println("Items in store: ");
        for (Media media : mediaItemsInStore) {
            System.out.println(media.toString());
        }
    }
}
