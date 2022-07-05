import javax.swing.*;
import java.awt.*;

public class Hello extends JFrame {

    public Hello() throws HeadlessException {
        Container   container=this.getContentPane();
        container.setLayout(new BorderLayout());
        container.add(new JLabel("Hello World"), BorderLayout.CENTER);
        setSize(500,400);
        setLocationRelativeTo(null);
        setTitle("Hello");

        setVisible(true);

    }

    public static void main(String[] args)  {
       new Hello();
    }
}
