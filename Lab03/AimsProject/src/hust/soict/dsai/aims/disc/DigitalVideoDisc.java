package AimsProject.src.hust.soict.dsai.aims.disc;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int dvdCount = 0;

    public DigitalVideoDisc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost);
        dvdCount++;
    }

    public DigitalVideoDisc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, String mediaDirector) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost, mediaDirector);
        dvdCount++;
    }

    public DigitalVideoDisc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, int mediaLength) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost, mediaLength);
        dvdCount++;
    }

    public DigitalVideoDisc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, int mediaLength, String mediaDirector) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost, mediaLength, mediaDirector);
        dvdCount++;
    }

    public DigitalVideoDisc(String mediaTitle) {
        super(mediaTitle);
        dvdCount++;
    }

    public static int getDvdCount() {
        return dvdCount;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - "
                + getLength() + ": " + getCost() + "$";
    }
}
