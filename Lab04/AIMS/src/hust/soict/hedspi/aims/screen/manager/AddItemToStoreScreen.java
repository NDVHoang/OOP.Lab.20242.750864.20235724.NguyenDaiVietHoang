package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.store.Store;
import javax.swing.*;
import java.awt.*;

public abstract class AddItemToStoreScreen extends JFrame {
    protected Store store;

    public AddItemToStoreScreen(Store store) {
        this.store = store;
        setLayout(new BorderLayout());
        add(buildTopPanel(), BorderLayout.NORTH);
        setTitle("Add Item");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    protected JPanel buildTopPanel() {
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.add(new StoreManagerScreen(store).createMenuBar());
        return topPanel;
    }

    protected abstract JPanel createCenter();
}
