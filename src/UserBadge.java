import javax.swing.*;
import java.awt.*;

public class UserBadge extends JPanel {
    public UserBadge(String username, ImageIcon icon) {
        setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
        setOpaque(false);

        if (icon != null) {
            Image scaled = icon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            JLabel iconLabel = new JLabel(new ImageIcon(scaled));
            add(iconLabel);
        }

        JLabel nameLabel = new JLabel(username);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameLabel);
    }

    public UserBadge(String username, ImageIcon icon, boolean isProfile) {
        if (isProfile) {
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setOpaque(false);

            if (icon != null) {
                Image scaled = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                JLabel iconLabel = new JLabel(new ImageIcon(scaled));
                iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                add(iconLabel);
            }

            JLabel nameLabel = new JLabel(username);
            nameLabel.setFont(new Font("Arial", Font.BOLD, 24));
            nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            add(Box.createRigidArea(new Dimension(0, 10))); // gap
            add(nameLabel);

        }
    }}