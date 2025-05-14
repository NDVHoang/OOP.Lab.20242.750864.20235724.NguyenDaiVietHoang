package hust.soict.hedspi.aims.media;

public class Disc extends Media {
    private int duration;
    private String directorName;

    public Disc(int id, String title, String category, float cost, int duration, String directorName) {
        super(id, title, category, cost);
        this.duration = duration;
        this.directorName = directorName;
    }

    public Disc(int id, String title, String category, float cost, int duration) {
        super(id, title, category, cost);
        this.duration = duration;
    }

    public Disc(int id, String title, String category, float cost, String directorName) {
        super(id, title, category, cost);
        this.directorName = directorName;
    }

    public Disc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public String getDirector() {
        return directorName;
    }

    public int getLength() {
        return duration;
    }
}
