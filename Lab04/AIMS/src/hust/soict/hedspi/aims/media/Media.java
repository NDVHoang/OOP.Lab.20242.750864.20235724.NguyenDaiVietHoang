package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Media {
    private int mediaId;
    private String mediaTitle;
    private String mediaCategory;
    private float mediaCost;
    private ArrayList<Media> relatedMediaList = new ArrayList<>();

    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();

    public Media(int mediaId, String mediaTitle, String mediaCategory, float mediaCost) {
        this.mediaId = mediaId;
        this.mediaTitle = mediaTitle;
        this.mediaCategory = mediaCategory;
        this.mediaCost = mediaCost;
    }

    public void setTitle(String mediaTitle) {
        this.mediaTitle = mediaTitle;
    }

    public boolean equals(Media otherMedia) {
        return this.mediaTitle.equals(otherMedia.mediaTitle);
    }

    public int getId() {
        return mediaId;
    }

    public String getTitle() {
        return mediaTitle;
    }

    public String getCategory() {
        return mediaCategory;
    }

    public float getCost() {
        return mediaCost;
    }

    public boolean isMatch(String title) {
        return mediaTitle.equalsIgnoreCase(title);
    }
}
