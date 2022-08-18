import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    private JLabel label;
    private JFrame frame;
    private JPanel buttonPanel;
    private JPanel labelPanel;
    private String display = "";
    private String operator = "";
    private int num;
    private int numA;
    private int numB;

    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonDivide = new JButton("/");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonMultiply = new JButton("*");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonSubtract = new JButton("-");
    JButton buttonZero = new JButton("0");
    JButton buttonDeciamal = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonEquals = new JButton("=");

    public GUI() {
        frame = new JFrame();
        buttonPanel = new JPanel();
        labelPanel = new JPanel();
        label = new JLabel("");

        labelPanel.setBackground(Color.black); //Label size
        labelPanel.setBounds(150, 0, 300, 100);
        
        labelPanel.add(label); //Label colors
        labelPanel.setLayout(new GridBagLayout());
        label.setFont(new Font("serif", Font.PLAIN, 35));
        label.setForeground(Color.yellow);

        buttonPanel.setLayout(new GridLayout(4, 4, 0, 0));

        buttonPanel.setBackground(Color.black);
        buttonPanel.setBounds(150, 100, 300, 300);

        buttonPanel.add(buttonOne);
        buttonPanel.add(buttonTwo);
        buttonPanel.add(buttonThree);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(buttonFour);
        buttonPanel.add(buttonFive);
        buttonPanel.add(buttonSix);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(buttonSeven);
        buttonPanel.add(buttonEight);
        buttonPanel.add(buttonNine);
        buttonPanel.add(buttonSubtract);
        buttonPanel.add(buttonZero);
        buttonPanel.add(buttonDeciamal);
        buttonPanel.add(buttonClear);
        buttonPanel.add(buttonEquals);

        buttonOne.setBackground(Color.orange);
        buttonOne.setForeground(Color.black);
        buttonOne.setFont(new Font("serif", Font.PLAIN, 35));

        buttonTwo.setBackground(Color.orange);
        buttonTwo.setForeground(Color.black);
        buttonTwo.setFont(new Font("serif", Font.PLAIN, 35));

        buttonThree.setBackground(Color.orange);
        buttonThree.setForeground(Color.black);
        buttonThree.setFont(new Font("serif", Font.PLAIN, 35));

        buttonDivide.setBackground(Color.orange);
        buttonDivide.setForeground(Color.black);
        buttonDivide.setFont(new Font("serif", Font.PLAIN, 35));

        buttonFour.setBackground(Color.orange);
        buttonFour.setForeground(Color.black);
        buttonFour.setFont(new Font("serif", Font.PLAIN, 35));

        buttonFive.setBackground(Color.orange);
        buttonFive.setForeground(Color.black);
        buttonFive.setFont(new Font("serif", Font.PLAIN, 35));

        buttonSix.setBackground(Color.orange);
        buttonSix.setForeground(Color.black);
        buttonSix.setFont(new Font("serif", Font.PLAIN, 35));

        buttonMultiply.setBackground(Color.orange);
        buttonMultiply.setForeground(Color.black);
        buttonMultiply.setFont(new Font("serif", Font.PLAIN, 35));

        buttonSeven.setBackground(Color.orange);
        buttonSeven.setForeground(Color.black);
        buttonSeven.setFont(new Font("serif", Font.PLAIN, 35));

        buttonEight.setBackground(Color.orange);
        buttonEight.setForeground(Color.black);
        buttonEight.setFont(new Font("serif", Font.PLAIN, 35));

        buttonNine.setBackground(Color.orange);
        buttonNine.setForeground(Color.black);
        buttonNine.setFont(new Font("serif", Font.PLAIN, 35));

        buttonSubtract.setBackground(Color.orange);
        buttonSubtract.setForeground(Color.black);
        buttonSubtract.setFont(new Font("serif", Font.PLAIN, 35));

        buttonZero.setBackground(Color.orange);
        buttonZero.setForeground(Color.black);
        buttonZero.setFont(new Font("serif", Font.PLAIN, 35));

        buttonDeciamal.setBackground(Color.orange);
        buttonDeciamal.setForeground(Color.black);
        buttonDeciamal.setFont(new Font("serif", Font.PLAIN, 35));

        buttonClear.setBackground(Color.orange);
        buttonClear.setForeground(Color.black);
        buttonClear.setFont(new Font("serif", Font.PLAIN, 35));

        buttonEquals.setBackground(Color.orange);
        buttonEquals.setForeground(Color.black);
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

        frame.add(buttonPanel);
        frame.add(labelPanel);
        frame.setTitle("First");
        frame.setSize(600,600);
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
            numA = Integer.parseInt(display);
            this.display = "";
        }
        else if(e.getSource() == buttonEquals) {
            numB = Integer.parseInt(display);
            this.display = "";
            changeString(String.valueOf(Multiply.multiply(numA, numB)));
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