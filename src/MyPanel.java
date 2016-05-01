import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyPanel extends JPanel implements ActionListener  {
    
    private static final Exception ArithmeticException = null;
    //component
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonComma;
    private JButton calculate;
    private JButton bPlus;
    private JButton bMinus;
    private JButton bMultiplication;
    private JButton bShare;
    private JButton bSum;
    private JButton bCancel;
    private JButton bBack;
    private JTextField jText;
    private JTextArea jTextF;
    
    
    //enum variable
    private Operations operations=Operations.NOTHING;
    private Operations oLast=Operations.NOTHING;
   
    //helping variable 
    private static double sumFinal=0;
    private static double boxFornumber=0;
    private static double boxFornumber2=0;
    private static double help=0;
    private static boolean action=false;
    
    StringBuilder sBulider=new StringBuilder();
    
  
    
    public MyPanel() {
        
        setLayout(null);
        
  
        button1=new JButton();
        button1.setBounds(05,100,80,40);
        button1.addActionListener(this);
        button1.setBackground(Color.orange);
        Image img1=new ImageIcon(this.getClass().getResource("/1.png")).getImage();
        button1.setIcon(new ImageIcon(img1));
        add(button1);
        
        button2=new JButton();
        button2.setBounds(90,100,80,40);
        button2.addActionListener(this);
        button2.setBackground(Color.orange);
        Image img2=new ImageIcon(this.getClass().getResource("/2.png")).getImage();
        button2.setIcon(new ImageIcon(img2));
        add(button2);
        
        button3=new JButton();
        button3.setBounds(175,100,80,40);
        button3.addActionListener(this);
        button3.setBackground(Color.orange);
        Image img3=new ImageIcon(this.getClass().getResource("/3.png")).getImage();
        button3.setIcon(new ImageIcon(img3));
        add(button3);
        
        button4=new JButton();
        button4.setBounds(05,150,80,40);
        button4.addActionListener(this);
        button4.setBackground(Color.orange);
        Image img4=new ImageIcon(this.getClass().getResource("/4.png")).getImage();
        button4.setIcon(new ImageIcon(img4));
        add(button4);
        
        button5=new JButton();
        button5.setBounds(90,150,80,40);
        button5.addActionListener(this);
        button5.setBackground(Color.orange);
        Image img5=new ImageIcon(this.getClass().getResource("/5.png")).getImage();
        button5.setIcon(new ImageIcon(img5));
        add(button5);
        
        button6=new JButton();
        button6.setBounds(175,150,80,40);
        button6.addActionListener(this);
        button6.setBackground(Color.orange);
        Image img6=new ImageIcon(this.getClass().getResource("/6.png")).getImage();
        button6.setIcon(new ImageIcon(img6));
        add(button6);
        
        button7=new JButton();
        button7.setBounds(05,200,80, 40);
        button7.addActionListener(this);
        button7.setBackground(Color.orange);
        Image img7=new ImageIcon(this.getClass().getResource("/7.png")).getImage();
        button7.setIcon(new ImageIcon(img7));
        add(button7);
        
        button8=new JButton();
        button8.setBounds(90,200, 80, 40);
        button8.addActionListener(this);
        button8.setBackground(Color.orange);
        Image img8=new ImageIcon(this.getClass().getResource("/8.png")).getImage();
        button8.setIcon(new ImageIcon(img8));
        add(button8);
        
        button9=new JButton();
        button9.setBounds(175,200, 80, 40);
        button9.addActionListener(this);
        button9.setBackground(Color.orange);
        Image img9=new ImageIcon(this.getClass().getResource("/9.png")).getImage();
        button9.setIcon(new ImageIcon(img9));
        add(button9);
        
        button0=new JButton();
        button0.setBounds(05, 250, 165, 40);
        button0.addActionListener(this);
        button0.setBackground(Color.orange);
        Image img0=new ImageIcon(this.getClass().getResource("/0.png")).getImage();
        button0.setIcon(new ImageIcon(img0));
        add(button0);
        
        
        buttonComma=new JButton();
        buttonComma.setBounds(175, 250, 80, 40);
        buttonComma.addActionListener(this);
        buttonComma.setBackground(Color.orange);
        Image imgKropka=new ImageIcon(this.getClass().getResource("/kropka.png")).getImage();
        buttonComma.setIcon(new ImageIcon(imgKropka));
        add(buttonComma);
        
        bPlus=new JButton();
        bPlus.setBounds(260, 200,65,40);
        bPlus.addActionListener(this);
        bPlus.setBackground(Color.orange);
        Image imgPlus=new ImageIcon(this.getClass().getResource("/+.png")).getImage();
        bPlus.setIcon(new ImageIcon(imgPlus));
        add(bPlus);
        
        bMinus=new JButton();
        bMinus.setBounds(328, 200,65,40);
        bMinus.addActionListener(this);
        bMinus.setBackground(Color.orange);
        Image imgMinus=new ImageIcon(this.getClass().getResource("/-.png")).getImage();
        bMinus.setIcon(new ImageIcon(imgMinus));
        add(bMinus);
        
        bMultiplication=new JButton();
        bMultiplication.setBounds(260, 150, 65, 40);
        bMultiplication.addActionListener(this);
        bMultiplication.setBackground(Color.orange);
        Image imgMulti=new ImageIcon(this.getClass().getResource("/multi.png")).getImage();
        bMultiplication.setIcon(new ImageIcon(imgMulti));
        add(bMultiplication);
        
        bShare=new JButton();
        bShare.setBounds(328, 150, 65, 40);
        bShare.addActionListener(this);
        bShare.setBackground(Color.orange);
        Image imgShare=new ImageIcon(this.getClass().getResource("/share.png")).getImage();
        bShare.setIcon(new ImageIcon(imgShare));
        add(bShare);
        
        bSum=new JButton();
        bSum.setBounds(260, 250, 133, 40);
        bSum.addActionListener(this);
        bSum.setBackground(Color.orange);
        Image imgE=new ImageIcon(this.getClass().getResource("/equal.png")).getImage();
        bSum.setIcon(new ImageIcon(imgE));
        add(bSum);
        
        bCancel=new JButton();
        bCancel.setBounds(328, 100, 65, 40);
        bCancel.addActionListener(this);
        bCancel.setBackground(Color.orange);
        Image imgC=new ImageIcon(this.getClass().getResource("/c.png")).getImage();
        bCancel.setIcon(new ImageIcon(imgC));
        add(bCancel);
        
        bBack=new JButton();
        Image img=new ImageIcon(this.getClass().getResource("/arrow.png")).getImage();
        bBack.setIcon(new ImageIcon(img));
        bBack.setBounds(260, 100, 65, 40);
        bBack.addActionListener(this);
        bBack.setBackground(Color.orange);
        add(bBack);
        
        
        
        
        
        jText =new JTextField("0");
        jText.setBounds(05, 05, 385, 90);
        jText.setFont(new Font("TimesNewRoman",Font.BOLD,40));
        jText.setBackground(Color.gray);
        add(jText);
        
    }
    
    private class ActionListenerAdapter implements  ActionListener
    {

        private JComponent component;
        
        public ActionListenerAdapter(JComponent component) {
            this.component = component;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == component)
            {
                System.out.println("MOJ ACTION LISTENER");
            }
            
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e)throws ArithmeticException {
       
        Object source=e.getSource();
       
      
       
        
        
        
          
       if(source.equals(button0)) {
    
                sBulider.append("0");
                jText.setText(sBulider.toString());
    
     }
       else if(source.equals(button1)) {
            
            sBulider.append("1");
            jText.setText(sBulider.toString());
         
    }
        
       else if(source.equals(button2)) {
            
            sBulider.append("2");
            jText.setText(sBulider.toString());
          
        }
       else if(source.equals(button3)) {
            
            sBulider.append("3");
            jText.setText(sBulider.toString());
      
        }
       else if(source.equals(button4)) {
            
            sBulider.append("4");
            jText.setText(sBulider.toString());
        
        }
       else if(source.equals(button5)) {
            
            sBulider.append("5");
            jText.setText(sBulider.toString());
           
        }
       else if(source.equals(button6)) {
            
            sBulider.append("6");
            jText.setText(sBulider.toString());
          
        }
       else if(source.equals(button7)) {
            
            sBulider.append("7");
            jText.setText(sBulider.toString());
           
        }
       else if(source.equals(button8)) {
            
            sBulider.append("8");
            jText.setText(sBulider.toString());
           
        }
       else if(source.equals(button9)) {
            
            sBulider.append("9");
            jText.setText(sBulider.toString());
           
        }else if(source.equals(buttonComma)) {
           
            sBulider.append(".");
            jText.setText(sBulider.toString());
            
        }else if(source.equals(bBack)) {
            
            if(sBulider.length()>0 && action==false) {
            sBulider.deleteCharAt(sBulider.length()-1);
            jText.setText(sBulider.toString());
            sumFinal=0;
            }
        }
     //*****************************************************************************************************************************
       
     if(source.equals(bPlus)) {
         
         operations=operations.PLUS;
     
     }else if (source.equals(bMinus)){
         
         operations=operations.MINUS;
     
     }else if(source.equals(bMultiplication)) {
         
         operations=operations.MULTIPLICATION;
     
     }else if(source.equals(bShare)) {
         
         operations=operations.DIVISION;
     }else if(source.equals(bSum)) {
         
         operations=operations.SUM;
     }else if(source.equals(bCancel)) {
         
         operations=operations.CANCEL;
     }
     
     //*****************************************************************************************************************************
    
     switch(operations) {
     
     case PLUS: 
         
         //the number of initialization and sum
         jText.setText("+");
         boxFornumber=Double.parseDouble(sBulider.toString());
         sumFinal+=boxFornumber;
        
         //reset values
         boxFornumber=0;
         sBulider.delete(0, sBulider.length());
         oLast=operations.PLUS;
         action=true;
     
     break;
     
     case MINUS: 
         
         //the number of initialization and sum
         jText.setText("-");
         boxFornumber=Double.parseDouble(sBulider.toString());
         sumFinal+=boxFornumber;
        
         //reset values
         boxFornumber=0;
         sBulider.delete(0, sBulider.length());
         oLast=operations.MINUS;
         action=true;
     
     break;
     
     case MULTIPLICATION: 
         
         //the number of initialization and sum
         jText.setText("*");
         boxFornumber=Double.parseDouble(sBulider.toString());
         sumFinal+=boxFornumber;
         help++;
         
         //reste values
         sBulider.delete(0, sBulider.length());
         oLast=operations.MULTIPLICATION;
         action=true;
         
         break;
     
     case DIVISION: 
         
         //the number of initialization and sum
         jText.setText("/");
         boxFornumber=Double.parseDouble(sBulider.toString());
         sumFinal+=boxFornumber;
         
         //reset values
         sBulider.delete(0, sBulider.length());
         oLast=operations.DIVISION;
         action=true;
     
     break;
     
     case SUM: 
         
         if(oLast==Operations.PLUS) {
             
             //the number of initialization and sum
             boxFornumber=Double.parseDouble(sBulider.toString());
             sumFinal+=boxFornumber;
             
             //reste values
             boxFornumber=0;
             sBulider.delete(0, sBulider.length());
             sBulider.append("0");
             oLast=operations.NOTHING;
             action=true;
             
         }else if(oLast==Operations.MINUS) {
             
             //the number of initialization and sum
             boxFornumber=Double.parseDouble(sBulider.toString());
             sumFinal-=boxFornumber;
             
             //reset values
             boxFornumber=0;
             sBulider.delete(0, sBulider.length());
             sBulider.append("0");
             oLast=operations.NOTHING;
             action=true;
             
         }else if(oLast==Operations.MULTIPLICATION) {
             
             //the number of initialization and sum
             boxFornumber=Double.parseDouble(sBulider.toString());
             sumFinal*=boxFornumber;
             
             //reset values
             boxFornumber=0;
             sBulider.delete(0, sBulider.length());
             sBulider.append("0");
             oLast=operations.NOTHING;
             action=true;
         
         }else if(oLast==Operations.DIVISION){
             
             //the number of initialization and sum
             //if boxFornumber is 0,catch exception
                boxFornumber=Double.parseDouble(sBulider.toString());  
                sumFinal/=boxFornumber;
         
             //reset values
             boxFornumber=0;
             sBulider.delete(0, sBulider.length());
             sBulider.append("0");
             oLast=operations.NOTHING;
             action=true;
             
         }
         
         System.out.println(sBulider.toString());
         jText.setText(String.valueOf(sumFinal));
     
         break;
         
     case CANCEL:
         
         //reset values
         boxFornumber=0;
         sBulider.delete(0, sBulider.length());
         sumFinal=0;
         oLast=operations.NOTHING;
         jText.setText(String.valueOf(sumFinal));
         action=false;
         
         break;
         
 }
     
    operations=operations.NOTHING;
  
        
    }


    
        
        
    


//***********************************************************************************************************************************

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }

    public JButton getButton4() {
        return button4;
    }
    
    public void setButton4(JButton button4) {
        this.button4 = button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public void setButton5(JButton button5) {
        this.button5 = button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public void setButton6(JButton button6) {
        this.button6 = button6;
    }

    public JButton getButton7() {
        return button7;
    }

    public void setButton7(JButton button7) {
        this.button7 = button7;
    }

    public JButton getButton8() {
        return button8;
    }

    public void setButton8(JButton button8) {
        this.button8 = button8;
    }

    public JButton getButton9() {
        return button9;
    }

    public void setButton9(JButton button9) {
        this.button9 = button9;
    }


    public JButton getButton0() {
        return button0;
    }

    public void setButton0(JButton button0) {
        this.button0 = button0;
    }

    public JButton getButtonComma() {
        return buttonComma;
    }

    public void setButtonComma(JButton buttonComma) {
        this.buttonComma = buttonComma;
    }

    public JButton getCalculate() {
        return calculate;
    }
    
    public void setCalculate(JButton calculate) {
        this.calculate = calculate;
    }

    public JTextField getjText() {
        return jText;
    }

    public void setjText(JTextField jText) {
        this.jText = jText;
    }

    public JTextArea getjTextF() {
        return jTextF;
    }

    public void setjTextF(JTextArea jTextF) {
        this.jTextF = jTextF;
    }

    public JButton getbPlus() {
        return bPlus;
    }

    public void setbPlus(JButton bPlus) {
        this.bPlus = bPlus;
    }

    public JButton getbMinus() {
        return bMinus;
    }

    public void setbMinus(JButton bMinus) {
        this.bMinus = bMinus;
    }

    public JButton getbMultiplication() {
        return bMultiplication;
    }

    public void setbMultiplication(JButton bMultiplication) {
        this.bMultiplication = bMultiplication;
    }

    public JButton getbShare() {
        return bShare;
    }

    public void setbShare(JButton bShare) {
        this.bShare = bShare;
    }

    public JButton getbSum() {
        return bSum;
    }

    public void setbSum(JButton bSum) {
        this.bSum = bSum;
    }

    public StringBuilder getsBu() {
        return sBulider;
    }

    public void setsBu(StringBuilder sBu) {
        this.sBulider = sBu;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    public Operations getoLast() {
        return oLast;
    }

    public void setoLast(Operations oLast) {
        this.oLast = oLast;
    }

    public static double getSumFinal() {
        return sumFinal;
    }

    public static void setSumFinal(double sumFinal) {
        MyPanel.sumFinal = sumFinal;
    }

    public static double getBoxFornumber() {
        return boxFornumber;
    }

    public static void setBoxFornumber(double boxFornumber) {
        MyPanel.boxFornumber = boxFornumber;
    }

    public static double getBoxFornumber2() {
        return boxFornumber2;
    }

    public static void setBoxFornumber2(double boxFornumber2) {
        MyPanel.boxFornumber2 = boxFornumber2;
    }

    public StringBuilder getsBulider() {
        return sBulider;
    }

    public void setsBulider(StringBuilder sBulider) {
        this.sBulider = sBulider;
    }

  



















    




    




    
}
