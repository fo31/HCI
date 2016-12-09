import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
 
public class GUIButton extends JPanel 
                    implements ActionListener {
    JButton button;
    JButton button1;
    JButton button2;
    JLabel emptyLabel;
 
    public GUIButton() {
    	 setLayout(new BorderLayout());
      
        button = new JButton("Sequential");
        button1 = new JButton("Parallel");
        button2 = new JButton("Submit");
        button.setPreferredSize(new Dimension(100, 60));
        button1.setPreferredSize(new Dimension(100, 60));
        button2.setPreferredSize(new Dimension(100, 60));
        add(button, BorderLayout.WEST);
        add(button1, BorderLayout.EAST);
        add(button2, BorderLayout.CENTER);
        button.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent e) {
        Toolkit.getDefaultToolkit().beep();
    }
 
    
    private static void createAndShowGUI() {
    
        JFrame frame = new JFrame("Hangman Word Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel emptyLabel = new JLabel("Please choose which mode you wish to choose words from.");
        emptyLabel.setPreferredSize(new Dimension(560, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.SOUTH);
        
        JComponent newContentPane = new GUIButton();
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);
        
        
       
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        
        FileHandling.serialing("binary.bin",FileHandling.list1 );
    }
}



	






















    
    