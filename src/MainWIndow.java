import javax.swing.*;
import java.awt.*;

public class MainWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel("Fantasy Assistant", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        frame.add(title, BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(2, 2));
        grid.add(new JButton("Research players"));
        grid.add(new JButton("Ai Assistant"));
        grid.add(new JButton("Notifications Center"));
        grid.add(new JButton("Weekly Predicted"));
        frame.add(grid, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}