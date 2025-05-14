package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;

import javax.swing.*;
import java.awt.*;

public class MediaStore extends JPanel {
    private Media item;

    public MediaStore(Media item) {
        this.item = item;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel(item.getTitle());
        titleLabel.setFont(new Font(titleLabel.getFont().getName(), Font.PLAIN, 15));
        titleLabel.setAlignmentX(CENTER_ALIGNMENT);

        JLabel costLabel = new JLabel(item.getCost() + " $");
        costLabel.setAlignmentX(CENTER_ALIGNMENT);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        if (item instanceof Playable) {
            JButton playButton = new JButton("Play");
            playButton.addActionListener(e -> {
                JDialog playDialog = new JDialog();
                playDialog.setTitle("Playing Media");
                playDialog.add(new JLabel("Playing: " + item.getTitle()));
                playDialog.setSize(300, 100);
                playDialog.setLocationRelativeTo(null);
                playDialog.setVisible(true);
            });
            add(playButton);
        }

        add(Box.createVerticalGlue());
        add(titleLabel);
        add(costLabel);
        add(Box.createVerticalGlue());
        add(buttonPanel);

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
