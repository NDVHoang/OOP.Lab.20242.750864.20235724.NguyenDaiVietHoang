package AimsProject.src.hust.soict.dsai.aims.disc;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String performer;
    private List<Track> trackList = new ArrayList<>();

    public CompactDisc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost);
    }

    public CompactDisc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, int mediaLength, String mediaDirector) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost, mediaLength, mediaDirector);
    }

    public CompactDisc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, String performer) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost);
        this.performer = performer;
    }

    public CompactDisc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, String performer, List<Track> trackList) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost);
        this.performer = performer;
        this.trackList = trackList;
    }

    public CompactDisc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, int mediaLength, String mediaDirector, String performer) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost, mediaLength, mediaDirector);
        this.performer = performer;
    }

    public CompactDisc(int mediaId, String mediaTitle, String mediaCategory, float mediaCost, int mediaLength, String mediaDirector, String performer, List<Track> trackList) {
        super(mediaId, mediaTitle, mediaCategory, mediaCost, mediaLength, mediaDirector);
        this.performer = performer;
        this.trackList = trackList;
    }

    public void addTrack(Track newTrack) {
        if (!trackList.contains(newTrack)) {
            trackList.add(newTrack);
            System.out.println("Track added successfully!");
        } else {
            System.out.println("Track already exists!");
        }
    }

    public void removeTrack(Track trackToRemove) {
        if (trackList.contains(trackToRemove)) {
            trackList.remove(trackToRemove);
            System.out.println("Track removed successfully!");
        } else {
            System.out.println("Track not found!");
        }
    }

    public int getTotalLength() {
        int totalLength = 0;
        for (Track t : trackList) {
            totalLength += t.getLength();
        }
        return totalLength;
    }

    public String getPerformer() {
        return performer;
    }

    @Override
    public void play() {
        // Optional: Implement play logic
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append("CD: ").append(getId()).append(" - Title: ").append(getTitle())
                .append(" - Category: ").append(getCategory()).append(" - Director: ")
                .append(getDirector()).append(" - Performer: ").append(performer)
                .append(" - Length: ").append(getTotalLength()).append(" mins")
                .append(" - Cost: $").append(getCost());

        if (!trackList.isEmpty()) {
            details.append("\nTracks:");
            for (Track t : trackList) {
                details.append("\n  - ").append(t.getTitle()).append(" (").append(t.getLength()).append(" mins)");
            }
        }

        return details.toString();
    }
}
