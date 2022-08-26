import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JLabel label;
    private JFrame frame;
    private JPanel buttonPanel;
    private JPanel labelPanel;
    private String display = "";
    private String operator = "";
    private int num;
    private double numA;
    private double numB;

    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonAdd = new JButton("+");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSubtract = new JButton("-");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonMultiply = new JButton("x");
    JButton buttonZero = new JButton("0");
    JButton buttonDeciamal = new JButton(".");
    JButton buttonNegative = new JButton("+/-");
    JButton buttonDivide = new JButton("/");
    JButton buttonFill = new JButton("F");
    JButton buttonPercent = new JButton("%");
    JButton buttonClear = new JButton("C");
    JButton buttonEquals = new JButton("=");

    public GUI() {
        frame = new JFrame();
        buttonPanel = new JPanel();
        labelPanel = new JPanel();
        label = new JLabel("");

        labelPanel.setBackground(Color.black); //Label size
        labelPanel.setBounds(0, 0, 300, 100);
        
        labelPanel.add(label); //Label colors
        labelPanel.setLayout(new GridBagLayout());
        label.setFont(new Font("serif", Font.PLAIN, 35));
        label.setForeground(Color.WHITE);

        buttonPanel.setLayout(new GridLayout(5, 4, 0, 0));

        buttonPanel.setBackground(Color.black);
        buttonPanel.setBounds(0, 100, 300, 300);

        buttonPanel.add(buttonOne);
        buttonPanel.add(buttonTwo);
        buttonPanel.add(buttonThree);
        buttonPanel.add(buttonAdd);
        buttonPanel.add(buttonFour);
        buttonPanel.add(buttonFive);
        buttonPanel.add(buttonSix);
        buttonPanel.add(buttonSubtract);
        buttonPanel.add(buttonSeven);
        buttonPanel.add(buttonEight);
        buttonPanel.add(buttonNine);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(buttonZero);
        buttonPanel.add(buttonDeciamal);
        buttonPanel.add(buttonNegative);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(buttonFill);
        buttonPanel.add(buttonPercent);
        buttonPanel.add(buttonClear);
        buttonPanel.add(buttonEquals);

        buttonOne.setBackground(Color.GRAY);
        buttonOne.setForeground(Color.WHITE);
        buttonOne.setFont(new Font("serif", Font.PLAIN, 35));

        buttonTwo.setBackground(Color.GRAY);
        buttonTwo.setForeground(Color.WHITE);
        buttonTwo.setFont(new Font("serif", Font.PLAIN, 35));

        buttonThree.setBackground(Color.GRAY);
        buttonThree.setForeground(Color.WHITE);
        buttonThree.setFont(new Font("serif", Font.PLAIN, 35));

        buttonAdd.setBackground(Color.ORANGE);
        buttonAdd.setForeground(Color.WHITE);
        buttonAdd.setFont(new Font("serif", Font.PLAIN, 35));

        buttonFour.setBackground(Color.GRAY);
        buttonFour.setForeground(Color.WHITE);
        buttonFour.setFont(new Font("serif", Font.PLAIN, 35));

        buttonFive.setBackground(Color.GRAY);
        buttonFive.setForeground(Color.WHITE);
        buttonFive.setFont(new Font("serif", Font.PLAIN, 35));

        buttonSix.setBackground(Color.GRAY);
        buttonSix.setForeground(Color.WHITE);
        buttonSix.setFont(new Font("serif", Font.PLAIN, 35));

        buttonSubtract.setBackground(Color.ORANGE);
        buttonSubtract.setForeground(Color.WHITE);
        buttonSubtract.setFont(new Font("serif", Font.PLAIN, 35));

        buttonSeven.setBackground(Color.GRAY);
        buttonSeven.setForeground(Color.WHITE);
        buttonSeven.setFont(new Font("serif", Font.PLAIN, 35));

        buttonEight.setBackground(Color.GRAY);
        buttonEight.setForeground(Color.WHITE);
        buttonEight.setFont(new Font("serif", Font.PLAIN, 35));

        buttonNine.setBackground(Color.GRAY);
        buttonNine.setForeground(Color.WHITE);
        buttonNine.setFont(new Font("serif", Font.PLAIN, 35));

        buttonMultiply.setBackground(Color.ORANGE);
        buttonMultiply.setForeground(Color.WHITE);
        buttonMultiply.setFont(new Font("serif", Font.PLAIN, 35));

        buttonZero.setBackground(Color.GRAY);
        buttonZero.setForeground(Color.WHITE);
        buttonZero.setFont(new Font("serif", Font.PLAIN, 35));

        buttonDeciamal.setBackground(Color.GRAY);
        buttonDeciamal.setForeground(Color.WHITE);
        buttonDeciamal.setFont(new Font("serif", Font.PLAIN, 35));

        buttonNegative.setBackground(Color.LIGHT_GRAY);
        buttonNegative.setForeground(Color.BLACK);
        buttonNegative.setFont(new Font("serif", Font.PLAIN, 35));

        buttonDivide.setBackground(Color.ORANGE);
        buttonDivide.setForeground(Color.WHITE);
        buttonDivide.setFont(new Font("serif", Font.PLAIN, 35));

        buttonFill.setBackground(Color.ORANGE);
        buttonFill.setForeground(Color.WHITE);
        buttonFill.setFont(new Font("serif", Font.PLAIN, 35));

        buttonPercent.setBackground(Color.LIGHT_GRAY);
        buttonPercent.setForeground(Color.BLACK);
        buttonPercent.setFont(new Font("serif", Font.PLAIN, 35));

        buttonClear.setBackground(Color.LIGHT_GRAY);
        buttonClear.setForeground(Color.BLACK);
        buttonClear.setFont(new Font("serif", Font.PLAIN, 35));

        buttonEquals.setBackground(Color.ORANGE);
        buttonEquals.setForeground(Color.WHITE);
        buttonEquals.setFont(new Font("serif", Font.PLAIN, 35));

        label.setText(display);

        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonDeciamal.addActionListener(this);
        buttonNegative.addActionListener(this);
        buttonPercent.addActionListener(this);

        frame.add(buttonPanel);
        frame.add(labelPanel);
        frame.setTitle("Jean's Calculator");
        frame.setSize(315,440);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        else if(e.getSource() == buttonZero) {
            num = 0;
            changeString(String.valueOf(num));
        }
        else if(e.getSource() == buttonClear) {
            this.display = "";
        }
        else if(e.getSource() == buttonMultiply) {
            numA = Double.valueOf(display);
            this.display = "";
            operator = "m";
        }
        else if(e.getSource() == buttonDivide) {
            numA = Double.valueOf(display);
            this.display = "";
            operator = "d";
        }
        else if(e.getSource() == buttonAdd) {
            numA = Double.valueOf(display);
            this.display = "";
            operator = "a";
        }
        else if(e.getSource() == buttonSubtract) {
            numA = Double.valueOf(display);
            this.display = "";
            operator = "s";
        }
        else if(e.getSource() == buttonEquals) {
            numB = Double.valueOf(display);
            this.display = "";
            changeString(String.valueOf(Checker.checker(numA, numB, operator))); 
        }
        else if(e.getSource() == buttonDeciamal) {
            if(display.contains(".")) { //This checks if the value already contains a deciamal
                this.display = "";
            }
            changeString(".");
        }
        else if(e.getSource() == buttonNegative) {
            if(display.length() > 0) { //Makes sure that the negative is always at the start of a number
                this.display = "";
            }
            changeString("-");
        }
        else if(e.getSource() == buttonPercent) {
            this.display = String.valueOf(Double.valueOf(display) / 100);
        }

        label.setText(display);

    }

    public void changeString(String a) { //Adds on to string.
        this.display = this.display.concat(a);
    }
}