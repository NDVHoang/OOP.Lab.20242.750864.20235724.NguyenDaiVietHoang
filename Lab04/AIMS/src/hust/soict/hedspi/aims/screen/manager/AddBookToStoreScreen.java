package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AddBookToStoreScreen extends AddItemToStoreScreen {

    public AddBookToStoreScreen(Store store) {
        super(store);
        add(buildFormPanel(), BorderLayout.CENTER);
    }

    @Override
    protected JPanel createCenter() {
        return buildFormPanel();
    }

    private JPanel buildFormPanel() {
        JPanel formPanel = new JPanel(new GridLayout(0, 2, 10, 10));

        JTextField idInput = new JTextField();
        JTextField titleInput = new JTextField();
        JTextField categoryInput = new JTextField();
        JTextField costInput = new JTextField();
        JTextField authorsInput = new JTextField();

        formPanel.add(new JLabel("ID:"));
        formPanel.add(idInput);
        formPanel.add(new JLabel("Title:"));
        formPanel.add(titleInput);
        formPanel.add(new JLabel("Category:"));
        formPanel.add(categoryInput);
        formPanel.add(new JLabel("Cost:"));
        formPanel.add(costInput);
        formPanel.add(new JLabel("Authors (comma-separated):"));
        formPanel.add(authorsInput);

        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idInput.getText());
                String title = titleInput.getText();
                String category = categoryInput.getText();
                float cost = Float.parseFloat(costInput.getText());
                String[] authorArray = authorsInput.getText().split(",");

                ArrayList<String> authorList = new ArrayList<>();
                for (String author : authorArray) {
                    authorList.add(author.trim());
                }

                store.addMedia(new Book(id, title, category, cost, authorList));
                JOptionPane.showMessageDialog(this, "Book added successfully!");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid number format. Please check ID and Cost.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        formPanel.add(new JLabel()); // filler for alignment
        formPanel.add(addButton);

        return formPanel;
    }
}
