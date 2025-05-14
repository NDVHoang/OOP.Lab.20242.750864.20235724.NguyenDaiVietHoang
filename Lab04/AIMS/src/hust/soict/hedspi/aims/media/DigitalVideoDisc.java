package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    public DigitalVideoDisc(int id, String title, String category, float cost, int length) {
        super(id, title, category, cost, length);
    }

    public DigitalVideoDisc(int id, String title, String category, float cost, String director) {
        super(id, title, category, cost, director);
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    @Override
    public String toString() {
        return "DVD: " + getId() +
               " - Title: " + getTitle() +
               " - Category: " + getCategory() +
               " - Cost: " + getCost() +
               " - Length: " + getLength() +
               " - Director: " + getDirector();
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength());
    }
}
