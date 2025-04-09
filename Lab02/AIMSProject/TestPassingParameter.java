public class TestPassingParameter {

    public static void main(String[] args) {
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella");

        swap(dvd1, dvd2);

        System.out.println("dvd1 title: " + dvd1.getTitle());
        System.out.println("dvd2 title: " + dvd2.getTitle());

        changeTitle(dvd1, dvd2.getTitle());

        System.out.println("dvd1 title after title change: " + dvd1.getTitle());
    }

    public static void swap(Object a, Object b) {
        Object temp = a;
        a = b;
        b = temp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String newTitle) {
        String originalTitle = dvd.getTitle();
        dvd.setTitle(newTitle); 
        dvd = new DigitalVideoDisc(originalTitle); 
    }
}
