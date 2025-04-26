package AimsProject.src.hust.soict.dsai.aims.disc;

import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class Disc extends Media {
    private int mediaLength;
    private String mediaDirector;

    public Disc(String mediaTitle) {
        super(mediaTitle);
    }

    public Disc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost);
    }

    public Disc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, String mediaDirector) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost);
        this.mediaDirector = mediaDirector;
    }

    public Disc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, int mediaLength) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost);
        this.mediaLength = mediaLength;
    }

    public Disc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, int mediaLength, String mediaDirector) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost);
        this.mediaLength = mediaLength;
        this.mediaDirector = mediaDirector;
    }

    public int getLength() {
        return mediaLength;
    }

    public String getDirector() {
        return mediaDirector;
    }
}
