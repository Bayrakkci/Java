import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        JOptionPane.showMessageDialog(null,"This is some info","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is some info","title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is some info","title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is some info","title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is some info","title",JOptionPane.ERROR_MESSAGE);

//        int answer = JOptionPane.showConfirmDialog(null,"bro, are you OK?","this is my title", JOptionPane.YES_NO_CANCEL_OPTION);

//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello" + name);

        String[] responses = {"yes","no you aree","thanks","*blushes*"};
        ImageIcon icon = new ImageIcon("thumbs_up.png");
        JOptionPane.showOptionDialog(null,
                "You are great!",
                "Secret Message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,responses,0);

    }
}