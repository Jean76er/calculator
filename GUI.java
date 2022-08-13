import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class GUI implements ActionListener{
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private int num;

    public GUI() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("Coutnter 0");
        JButton button = new JButton("Press");

        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        button.addActionListener(this);

        frame.setTitle("First");
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        num++;
        label.setText("Counter " + num);
    }

    public static void main(String[] args) {
        new GUI();
    }
}