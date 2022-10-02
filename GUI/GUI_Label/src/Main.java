import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("hello.png");

        Border border = BorderFactory.createLineBorder(Color.MAGENTA,3);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.MAGENTA);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(-50);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(225,225,550,550); // easy?

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(null); // Overrides alignments and only leaves setBounds valid.
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // adjusts auto
    }
}