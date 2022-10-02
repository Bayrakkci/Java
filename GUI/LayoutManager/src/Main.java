import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {
        // something like responsive

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // default is center

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout()); // default is already FLow

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
    }
}