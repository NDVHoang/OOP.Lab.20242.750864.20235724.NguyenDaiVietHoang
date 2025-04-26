package AimsProject.src.hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media firstMedia, Media secondMedia) {
        return Comparator.comparing(Media::getTitle)
                .thenComparing(Media::getCost)
                .compare(firstMedia, secondMedia);
    }
}
