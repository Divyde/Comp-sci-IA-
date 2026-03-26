import javax.swing.*;
import java.awt.*;

public class ProfileScreen {
    public ProfileScreen(String user){    //Insert icon parameter when implemented
        JFrame frame = new JFrame(user + "'s Profile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());


        frame.add(new UserBadge(user, null, true), BorderLayout.NORTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
