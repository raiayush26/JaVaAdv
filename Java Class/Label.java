import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Label extends JPanel{
    private JLabel label;
    private JTextField textFied;
    private JButton button;

public static void main(String[] args) {
    JFrame frame = new JFrame("my frame");
    JLabel lbl  = new  JLabel();
    JTextField txt =  new JTextField(20);
    JButton  btn = new JButton("Click");
    frame.setLayout(new FlowLayout());
    frame.add(lbl);
    frame.add(txt);
    frame.add(btn);
    frame.pack();
    frame.setVisible(true);
    btn.addActionListener(new ButtonListener());
    
}

public void setText(String string) {
}


}
