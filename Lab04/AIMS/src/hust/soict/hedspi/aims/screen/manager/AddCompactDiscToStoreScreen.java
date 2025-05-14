package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        add(buildInputPanel(), BorderLayout.CENTER);
    }

    @Override
    protected JPanel buildInputPanel() {
        JPanel inputPanel = new JPanel(new GridLayout(0, 2, 10, 10));

        JTextField idInput = new JTextField();
        JTextField titleInput = new JTextField();
        JTextField categoryInput = new JTextField();
        JTextField costInput = new JTextField();
        JTextField lengthInput = new JTextField();
        JTextField directorInput = new JTextField();
        JTextField artistInput = new JTextField();

        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idInput);
        inputPanel.add(new JLabel("Title:"));
        inputPanel.add(titleInput);
        inputPanel.add(new JLabel("Category:"));
        inputPanel.add(categoryInput);
        inputPanel.add(new JLabel("Cost:"));
        inputPanel.add(costInput);
        inputPanel.add(new JLabel("Length:"));
        inputPanel.add(lengthInput);
        inputPanel.add(new JLabel("Director:"));
        inputPanel.add(directorInput);
        inputPanel.add(new JLabel("Artist:"));
        inputPanel.add(artistInput);

        JButton addCdButton = new JButton("Add CD");
        addCdButton.addActionListener(e -> {
            int id = Integer.parseInt(idInput.getText());
            String title = titleInput.getText();
            String category = categoryInput.getText();
            float cost = Float.parseFloat(costInput.getText());
            int length = Integer.parseInt(lengthInput.getText());
            String director = directorInput.getText();
            String artist = artistInput.getText();

            store.addMedia(new CompactDisc(id, title, category, cost, length, director, artist));
            JOptionPane.showMessageDialog(this, "CD added successfully!");
        });

        inputPanel.add(new JLabel());
        inputPanel.add(addCdButton);

        return inputPanel;
    }
}
