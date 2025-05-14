package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> trackList = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, List<Track> trackList) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.trackList = trackList;
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title, category, cost);
        this.artist = artist;
    }

    public CompactDisc(int id, String title, String category, float cost, String artist, List<Track> trackList) {
        super(id, title, category, cost);
        this.artist = artist;
        this.trackList = trackList;
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    public CompactDisc(int id, String title, String category, float cost, int length) {
        super(id, title, category, cost, length);
    }

    public void addTrack(Track track) {
        if (!trackList.contains(track)) {
            trackList.add(track);
            System.out.println("Track added.");
        } else {
            System.out.println("Track already exists.");
        }
    }

    public void removeTrack(Track track) {
        if (trackList.contains(track)) {
            trackList.remove(track);
            System.out.println("Track removed.");
        } else {
            System.out.println("Track does not exist.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : trackList) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CD: ").append(getId())
          .append(" - Title: ").append(getTitle())
          .append(" - Category: ").append(getCategory())
          .append(" - Director: ").append(getDirector())
          .append(" - Artist: ").append(artist)
          .append(" - Length: ").append(getLength()).append(" mins")
          .append(" - Cost: $").append(getCost());

        if (!trackList.isEmpty()) {
            sb.append("\nTracks:");
            for (Track track : trackList) {
                sb.append("\n  - ").append(track.getTitle()).append(" (").append(track.getLength()).append(" mins)");
            }
        }

        return sb.toString();
    }

    @Override
    public void play() {
        // Intentionally left blank
    }
}
