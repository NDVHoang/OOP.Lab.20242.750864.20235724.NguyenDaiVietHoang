package AimsProject.src.hust.soict.dsai.aims.disc;

public class Track implements Playable {
    private String trackTitle;
    private int trackLength;

    public Track(String trackTitle, int trackLength) {
        this.trackTitle = trackTitle;
        this.trackLength = trackLength;
    }

    public String getTitle() {
        return trackTitle;
    }

    public int getLength() {
        return trackLength;
    }

    public boolean equals(Track otherTrack) {
        return this.trackTitle.equals(otherTrack.trackTitle) && this.trackLength == otherTrack.trackLength;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
}
