public class Cart {

    public static final int MAX_ITEMS = 20;

    private DigitalVideoDisc[] items = new DigitalVideoDisc[MAX_ITEMS];

    private int itemCount = 0;

    public void addDisc(DigitalVideoDisc disc) {
        if (itemCount < MAX_ITEMS) {
            items[itemCount] = disc;
            itemCount++;
            System.out.println("The disc has been added!");
        } else {
            System.out.println("The cart is almost full!");
        }
    }

    public void addDisc(DigitalVideoDisc... discs) {
        for (DigitalVideoDisc disc : discs) {
            addDisc(disc);
        }
    }

    public void addDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        addDisc(disc1);
        addDisc(disc2);
    }

    public void removeDisc(DigitalVideoDisc disc) {
        boolean isFound = false;
        for (int i = 0; i < itemCount; i++) {
            if (items[i] == disc) {
                isFound = true;
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[itemCount - 1] = null;
                itemCount--;
                System.out.println("The disc has been removed!");
                break;
            }
        }

        if (!isFound) {
            System.out.println("The disc was not found!");
        }
    }

    public float getTotalCost() {
        float total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getCost();
        }
        return total;
    }
}
