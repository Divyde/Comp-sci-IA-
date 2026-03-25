import javax.swing.*;
import java.awt.*;

public class MainWIndow {
    public MainWIndow() {
        JFrame frame = new JFrame("Main Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel("Fantasy Assistant", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        frame.add(title, BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(2, 2));
        grid.add(new RoundButton("Research players"));
        grid.add(new RoundButton("Ai Assistant"));
        grid.add(new RoundButton("Notifications Center"));
        grid.add(new RoundButton("Weekly Predicted"));
        frame.add(grid, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}