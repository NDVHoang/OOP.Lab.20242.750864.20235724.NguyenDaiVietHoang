package AimsProject.src.hust.soict.dsai.test.store;

import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        store.addMedia(new DigitalVideoDisc(101, "Inception", "Sci-Fi", 15.5f, 148, "Christopher Nolan"));
        store.addMedia(new DigitalVideoDisc(102, "Interstellar", "Sci-Fi", 17.0f, 169, "Christopher Nolan"));
        store.addMedia(new DigitalVideoDisc(111, "The Matrix", "Sci-Fi", 16.5f, 136, "The Wachowskis"));
        store.addMedia(new DigitalVideoDisc(112, "Blade Runner 2049", "Sci-Fi", 18.0f, 164, "Denis Villeneuve"));
        store.addMedia(new DigitalVideoDisc(113, "Arrival", "Sci-Fi", 14.0f, 116, "Denis Villeneuve"));

        store.print();

        store.removeMedia(store.getMedia("Inception"));
        store.print();
    }
}
