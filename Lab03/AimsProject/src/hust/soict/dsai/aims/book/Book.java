package AimsProject.src.hust.soict.dsai.aims.book;

import java.util.ArrayList;
import java.util.List;

import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class Book extends Media {
    private ArrayList<String> writerList = new ArrayList<String>();

    public Book(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, ArrayList<String> writerList) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost);
        this.writerList = writerList;
    }

    public void addWriter(String writerName) {
        if (!writerList.contains(writerName)) {
            writerList.add(writerName);
        } else {
            System.out.println("Writer already added!");
        }
    }

    public void removeWriter(String writerName) {
        if (writerList.contains(writerName)) {
            writerList.remove(writerName);
        } else {
            System.out.println("Writer not found!");
        }
    }

    @Override
    public String toString() {
        return "Book: " + getId() + " - " + getTitle() + " - " + getCategory() + " - " + String.join(", ", writerList)
                + " - " + getCost() + "$";
    }
}
