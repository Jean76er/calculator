import javax.swing.*;

public class GUI {
    private static void createGUI() {
        //Sets up window
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Sets label
        JLabel label = new JLabel("Tesst1");
        frame.getContentPane().add(label);
        //Displays window
        frame.pack(); 
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}