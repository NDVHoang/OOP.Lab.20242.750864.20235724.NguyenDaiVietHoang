package AimsProject.src.hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media firstMedia, Media secondMedia) {
        return Comparator.comparing(Media::getCost)
                .thenComparing(Media::getTitle)
                .compare(firstMedia, secondMedia);
    }
}
