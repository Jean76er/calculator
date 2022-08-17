import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    private JLabel label;
    private JFrame frame;
    private JLayeredPane pane;
    private JPanel buttonPanel;
    private JPanel labelPanel;
    private String display = "";
    private int num;
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");

    public GUI() {
        frame = new JFrame();
        buttonPanel = new JPanel();
        labelPanel = new JPanel();
        label = new JLabel("", SwingConstants.CENTER);

        buttonPanel.setLayout(new GridLayout(3, 3, 4, 4));
        
        //Adding buttons to app
        labelPanel.add(label);
        labelPanel.add(buttonPanel);
        buttonPanel.add(buttonOne);
        buttonPanel.add(buttonTwo);
        buttonPanel.add(buttonThree);
        buttonPanel.add(buttonFour);
        buttonPanel.add(buttonFive);
        buttonPanel.add(buttonSix);
        buttonPanel.add(buttonSeven);
        buttonPanel.add(buttonEight);
        buttonPanel.add(buttonNine);

        label.setText(display);
        //label.setVerticalAlignment(JLabel.TOP);

        //Adding action to all buttons


        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);

        frame.setTitle("First");
        frame.add(labelPanel);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) { //Number Pad

        if(e.getSource() == buttonOne) {
            num = 1;
            changeString(String.valueOf(num));
        }
        else if(e.getSource() == buttonTwo) {
            num = 2;
            changeString(String.valueOf(num));
        }
        else if(e.getSource() == buttonThree) {
            num = 3;
            changeString(String.valueOf(num));
        }
        else if(e.getSource() == buttonFour) {
            num = 4;
            changeString(String.valueOf(num));
        }
        else if(e.getSource() == buttonFive) {
            num = 5;
            changeString(String.valueOf(num));
        }
        else if(e.getSource() == buttonSix) {
            num = 6;
            changeString(String.valueOf(num));
        }
        else if(e.getSource() == buttonSeven) {
            num = 7;
            changeString(String.valueOf(num));
        }
        else if(e.getSource() == buttonEight) {
            num = 8;
            changeString(String.valueOf(num));
        }
        else if(e.getSource() == buttonNine) {
            num = 9;
            changeString(String.valueOf(num));
        }

        label.setText(display);

    }

    public void changeString(String a) {
        this.display = this.display.concat(a);
    }

    public static void main(String[] args) {
        new GUI();
    }
}