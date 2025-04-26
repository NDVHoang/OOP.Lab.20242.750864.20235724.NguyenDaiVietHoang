package AimsProject.src.hust.soict.dsai.test.disc;

import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {

        DigitalVideoDisc inceptionDVD = new DigitalVideoDisc("Inception");
        DigitalVideoDisc interstellarDVD = new DigitalVideoDisc("Interstellar");

        swap(inceptionDVD, interstellarDVD);

        System.out.println("inceptionDVD title: " + inceptionDVD.getTitle());
        System.out.println("interstellarDVD title: " + interstellarDVD.getTitle());

        changeTitle(inceptionDVD, interstellarDVD.getTitle());

        System.out.println("inceptionDVD updated title: " + inceptionDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc disc, String newTitle) {
        String originalTitle = disc.getTitle();
        disc.setTitle(newTitle);
        disc = new DigitalVideoDisc(originalTitle); 
    }
}
