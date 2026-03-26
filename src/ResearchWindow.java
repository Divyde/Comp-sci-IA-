import javax.swing.*;
import java.awt.*;

public class ResearchWindow {
    public ResearchWindow(){
        JFrame frame = new JFrame("Research Players");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());


        JPanel topBar = new JPanel(new BorderLayout());
        topBar.add(new UserBadge("Divide", new ImageIcon("path/to/icon.png")), BorderLayout.EAST);
        frame.add(topBar, BorderLayout.NORTH);
    }
}
