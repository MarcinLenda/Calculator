import java.awt.Color;

import javax.swing.JFrame;

public class Main extends JFrame {

    public static void createAndShowGui()
    {
     JFrame frame=new JFrame("KALKULATOR");
     frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
     frame.setSize(400, 400);
     frame.setVisible(true);
     frame.setResizable(false);
     
     MyPanel panel=new MyPanel();
     panel.setBackground(Color.black);
     
     
     panel.setVisible(true);
     frame.setContentPane(panel);
     
        
        
        
    }
    public static void main(String[] args) {
       
        javax.swing.SwingUtilities.invokeLater(
                new Runnable()
                {
                    public void run()
                    {
                        createAndShowGui();
                    }
                }
        );
        
        
        
        
       
    }
}
