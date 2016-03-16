package will.swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        Button button = new Button("click");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource());
                System.out.println("hello Will!");
            }
        });
        frame.setSize(400, 300);
        frame.getContentPane().add(button);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
