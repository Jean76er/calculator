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
        label = new JLabel("Counter 0");
        JButton buttonOne = new JButton("1");
        JButton buttonTwo = new JButton("2");

        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(buttonOne);
        panel.add(buttonTwo);
        panel.add(label);

        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);

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