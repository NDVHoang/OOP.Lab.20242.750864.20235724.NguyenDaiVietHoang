package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authorList = new ArrayList<>();

    public Book(int id, String title, String category, float cost, ArrayList<String> authorList) {
        super(id, title, category, cost);
        this.authorList = authorList;
    }

    public void addAuthor(String authorName) {
        if (!authorList.contains(authorName)) {
            authorList.add(authorName);
        } else {
            System.out.println("Author already exists!");
        }
    }

    public void removeAuthor(String authorName) {
        if (authorList.contains(authorName)) {
            authorList.remove(authorName);
        } else {
            System.out.println("Author does not exist!");
        }
    }

    @Override
    public String toString() {
        return "Book: " + getId() + " - " + getTitle() + " - " + getCategory() + " - " + String.join(", ", authorList)
                + " - " + getCost() + "$";
    }
}
