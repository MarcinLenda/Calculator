import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.naming.BinaryRefAddr;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyPanel extends JPanel implements ActionListener  {
    
  
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
    private JButton bPlus;
    private JButton bMinus;
    private JButton bMultiplication;
    private JButton bShare;
    private JButton bSum;
    private JButton bCancel;
    private JButton bBack;
    private JTextField jText;
    
    //button convert
    private JButton bBinary;
    private JButton bOctal;
    private JButton bHEx;
    private JTextArea Tarea1;
    private JTextArea Tarea2;
    private JTextArea Tarea3;
    
    //color button
    private JButton Bcolor1;
    private JButton Bcolor2;
    private JButton Bcolor3;
    private JButton Bcolor4;
    
 
  
    
    //enum variable
    private Operations operations=Operations.NOTHING;
    private Operations oLast=Operations.NOTHING;
   
    //helping variable 
    private static double sumFinal=0;
    private static double boxFornumber=0;
    private static boolean action=false;
    private boolean onAction=true;
    private boolean onBinary=false, onOct=false, onHex=false;
    
    
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
        
        
        //***************************************************************************************************************************
        //button to convert numbers
        bBinary=new JButton();
        Image imgOK=new ImageIcon(this.getClass().getResource("/green2.png")).getImage();
        bBinary.setIcon(new ImageIcon(imgOK));
        bBinary.setBounds(05, 300, 20, 20);
        bBinary.addActionListener(this);
        add(bBinary);
        
        Tarea1=new JTextArea("System dwójkowy");
        Tarea1.setBounds(26, 300, 140, 20);
        Tarea1.setBackground(Color.gray);
        add(Tarea1);
        
        bOctal=new JButton();
        bOctal.setIcon(new ImageIcon(imgOK));
        bOctal.setBounds(05, 325, 20, 20);
        bOctal.addActionListener(this);
        add(bOctal);
        
        Tarea2=new JTextArea("System ósemkowy");
        Tarea2.setBounds(26, 325, 140, 20);
        Tarea2.setBackground(Color.gray);
        add(Tarea2);
        
        bHEx=new JButton();
        bHEx.setIcon(new ImageIcon(imgOK));
        bHEx.setBounds(05, 350, 20, 20);
        bHEx.addActionListener(this);
        add(bHEx);
        
        Tarea3=new JTextArea("System szesnatkowy");
        Tarea3.setBounds(26, 350, 140, 20);
        Tarea3.setBackground(Color.gray);
        add(Tarea3);
        
        //***************************************************************************************************************************
        //Button for change color
        Bcolor1=new JButton();
        Bcolor1.setBounds(358, 335, 35, 35);
        Bcolor1.setBackground(Color.blue);
        Bcolor1.addActionListener(this);
        add(Bcolor1);
        
        Bcolor2=new JButton();
        Bcolor2.setBounds(320, 335, 35, 35);
        Bcolor2.setBackground(Color.black);
        Bcolor2.addActionListener(this);
        add(Bcolor2);
        
        Bcolor3=new JButton();
        Bcolor3.setBounds(320,298, 35, 35);
        Bcolor3.setBackground(Color.red);
        Bcolor3.addActionListener(this);
        add(Bcolor3);
        
        Bcolor4=new JButton();
        Bcolor4.setBounds(358,298, 35, 35);
        Bcolor4.setBackground(Color.orange);
        Bcolor4.addActionListener(this);
        add(Bcolor4);
        
        //Main display
        //**************************************************************************************************************************
        jText =new JTextField("0");
        jText.setBounds(05, 05, 385, 90);
        jText.setFont(new Font("TimesNewRoman",Font.BOLD,40));
        jText.setBackground(Color.gray);
        add(jText);
        
    }
    
    
    
    
   

    @Override
    public void actionPerformed(ActionEvent e)throws ArithmeticException {
       
        Object source=e.getSource();
        
        JButton[] tab= {button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
                bBack,bCancel,bMinus,bMultiplication,bShare,bSum,bPlus,buttonComma};
        
        //option change color
        
        if(source.equals(Bcolor1)) {
            
            for(int i=0; i<tab.length; i++) {
                
                tab[i].setBackground(Color.blue);
            }
            jText.setBackground(Color.yellow);
            
        }else if(source.equals(Bcolor2)) {
            
            for(int i=0; i<tab.length; i++) {
                
                tab[i].setBackground(Color.black);
            }
            jText.setBackground(Color.green);
            
            
        }else if(source.equals(Bcolor3)) {
            
            for(int i=0; i<tab.length; i++) {
                
                tab[i].setBackground(Color.red);
            }
            jText.setBackground(Color.pink);
            
            
        }else  if(source.equals(Bcolor4)) {
            
            for(int i=0; i<tab.length; i++) {
                
                tab[i].setBackground(Color.orange);
            }
            jText.setBackground(Color.gray);
            
            
        }
        
        //initzialization boxForNumber 
        //**************************************************************************************************************************
       
      
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
            if(sBulider.length()==0) {
                jText.setText("0");
            }
            sumFinal=0;
            }
            
            //Convert numbers to Bin,Oct,Hex system
            //********************************************************************************************************************
            
        }else if(source.equals(bBinary)) {
            
            MyPanel panel=new MyPanel();
            
           
           if(onHex==false && onOct==false) { 
               
            onBinary=true;   
            
            
           if(onAction==true) {
            
               onAction=false;
           if(action==true) {
               
               
           jText.setText(panel.toBinarySystem(sumFinal));
           Image imgOK2=new ImageIcon(this.getClass().getResource("/green.png")).getImage();
           bBinary.setIcon(new ImageIcon(imgOK2));
          
           }else {
               
               Image imgOK=new ImageIcon(this.getClass().getResource("/green.png")).getImage();
               bBinary.setIcon(new ImageIcon(imgOK));
               
               boxFornumber=Double.parseDouble(sBulider.toString());
               jText.setText(panel.toBinarySystem(boxFornumber));
           }
           
           }else {
               
               onAction=true;
               Image imgOK=new ImageIcon(this.getClass().getResource("/green2.png")).getImage();
               bBinary.setIcon(new ImageIcon(imgOK));
               onBinary=false;
               
               if(action==true) {
                   
                   jText.setText(String.valueOf(sumFinal));
               }else {
                   
                   jText.setText(String.valueOf(boxFornumber));
               }
               
               
           }
           
           
         } 
           }else if(source.equals(bOctal)) {
               
               MyPanel panel=new MyPanel();
               
              
               if(onHex==false && onBinary==false) { 
                   
                   onOct=true;   
               
              if(onAction==true) {
               
                  onAction=false;
              if(action==true) {    
              jText.setText(panel.toOctalSystem(sumFinal));
              Image imgOK2=new ImageIcon(this.getClass().getResource("/green.png")).getImage();
              bOctal.setIcon(new ImageIcon(imgOK2));
              }else {
                  
                  Image imgOK=new ImageIcon(this.getClass().getResource("/green.png")).getImage();
                  bOctal.setIcon(new ImageIcon(imgOK));
                  boxFornumber=Double.parseDouble(sBulider.toString());
                  jText.setText(panel.toOctalSystem(boxFornumber));
              }
              
              }else {
                  
                  onAction=true;
                  Image imgOK=new ImageIcon(this.getClass().getResource("/green2.png")).getImage();
                  bOctal.setIcon(new ImageIcon(imgOK));
                  onOct=false;
                  
                  if(action==true) {
                      
                      jText.setText(String.valueOf(sumFinal));
                  }else {
                      
                      jText.setText(String.valueOf(boxFornumber));
                  }
                  
 
              }
            }
           }else if(source.equals(bHEx)) {
               
               MyPanel panel=new MyPanel();
              
               if(onBinary==false && onOct==false) { 
                   
                   onHex=true; 
              
              if(onAction==true) {
               
                  onAction=false;
              if(action==true) {    
              jText.setText(panel.toHexDecimal(sumFinal));
              Image imgOK2=new ImageIcon(this.getClass().getResource("/green.png")).getImage();
              bHEx.setIcon(new ImageIcon(imgOK2));
              }else {
                  
                  Image imgOK=new ImageIcon(this.getClass().getResource("/green.png")).getImage();
                  bHEx.setIcon(new ImageIcon(imgOK));
                  boxFornumber=Double.parseDouble(sBulider.toString());
                  jText.setText(panel.toHexDecimal(boxFornumber));
              }
              
              }else {
                  
                  onAction=true;
                  Image imgOK=new ImageIcon(this.getClass().getResource("/green2.png")).getImage();
                  bHEx.setIcon(new ImageIcon(imgOK));
                  onHex=false;
                  
                  if(action==true) {
                      
                      jText.setText(String.valueOf(sumFinal));
                  }else {
                      
                      jText.setText(String.valueOf(boxFornumber));
                  }
                  
                
              }
            }
        }
      
      //initzialization enum variable
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
     
     
     //Operations maths
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


    
    
  //Methods to convert numbers    
 //***********************************************************************************************************************************

  

  
    private  String toBinarySystem(double number){
        List<Integer> list=new ArrayList<>();
        String finishSum="";
        
        int box=(int)number;
        
        StringBuffer sb=new StringBuffer();
        
      
        
        while(box>0){
            
           if(box%2==0){
                list.add( 0);
            }else{
                list.add(1);
            }
            box=box/2;
            
        }
        
        
    for(int i=list.size()-1; i>=0 ; i--){
        
        
        sb.append(list.get(i).toString());
    
    }
        return sb.toString();
      
    }



    private  String toOctalSystem(double number){
        List<Integer> list=new ArrayList<>();
        String finishSum="";
        
        int box=(int)number;
        
        StringBuffer sb=new StringBuffer();
        
      
        
        while(box>0){
            
            list.add(box%8);
            
            
            box=box/8;
            
        }
        
       for(int i=list.size()-1; i>=0 ; i--){
        
        
        sb.append(list.get(i).toString());
    
    }
        return sb.toString();
      
    }
    
    private String toHexDecimal (double number) {
        
        int box=(int)number;
        String fNumber=Integer.toHexString(box);
        
        return fNumber;
        
    }



    //**********************************************************************************************************************************
    
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Bcolor1 == null) ? 0 : Bcolor1.hashCode());
        result = prime * result + ((Bcolor2 == null) ? 0 : Bcolor2.hashCode());
        result = prime * result + ((Bcolor3 == null) ? 0 : Bcolor3.hashCode());
        result = prime * result + ((Bcolor4 == null) ? 0 : Bcolor4.hashCode());
        result = prime * result + ((Tarea1 == null) ? 0 : Tarea1.hashCode());
        result = prime * result + ((Tarea2 == null) ? 0 : Tarea2.hashCode());
        result = prime * result + ((Tarea3 == null) ? 0 : Tarea3.hashCode());
        result = prime * result + ((bBack == null) ? 0 : bBack.hashCode());
        result = prime * result + ((bBinary == null) ? 0 : bBinary.hashCode());
        result = prime * result + ((bCancel == null) ? 0 : bCancel.hashCode());
        result = prime * result + ((bHEx == null) ? 0 : bHEx.hashCode());
        result = prime * result + ((bMinus == null) ? 0 : bMinus.hashCode());
        result = prime * result
                + ((bMultiplication == null) ? 0 : bMultiplication.hashCode());
        result = prime * result + ((bOctal == null) ? 0 : bOctal.hashCode());
        result = prime * result + ((bPlus == null) ? 0 : bPlus.hashCode());
        result = prime * result + ((bShare == null) ? 0 : bShare.hashCode());
        result = prime * result + ((bSum == null) ? 0 : bSum.hashCode());
        result = prime * result + ((button0 == null) ? 0 : button0.hashCode());
        result = prime * result + ((button1 == null) ? 0 : button1.hashCode());
        result = prime * result + ((button2 == null) ? 0 : button2.hashCode());
        result = prime * result + ((button3 == null) ? 0 : button3.hashCode());
        result = prime * result + ((button4 == null) ? 0 : button4.hashCode());
        result = prime * result + ((button5 == null) ? 0 : button5.hashCode());
        result = prime * result + ((button6 == null) ? 0 : button6.hashCode());
        result = prime * result + ((button7 == null) ? 0 : button7.hashCode());
        result = prime * result + ((button8 == null) ? 0 : button8.hashCode());
        result = prime * result + ((button9 == null) ? 0 : button9.hashCode());
        result = prime * result
                + ((buttonComma == null) ? 0 : buttonComma.hashCode());
        result = prime * result + ((jText == null) ? 0 : jText.hashCode());
        result = prime * result + ((oLast == null) ? 0 : oLast.hashCode());
        result = prime * result + (onAction ? 1231 : 1237);
        result = prime * result + (onBinary ? 1231 : 1237);
        result = prime * result + (onHex ? 1231 : 1237);
        result = prime * result + (onOct ? 1231 : 1237);
        result = prime * result
                + ((operations == null) ? 0 : operations.hashCode());
        result = prime * result
                + ((sBulider == null) ? 0 : sBulider.hashCode());
        return result;
    }






    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyPanel other = (MyPanel) obj;
        if (Bcolor1 == null) {
            if (other.Bcolor1 != null)
                return false;
        } else if (!Bcolor1.equals(other.Bcolor1))
            return false;
        if (Bcolor2 == null) {
            if (other.Bcolor2 != null)
                return false;
        } else if (!Bcolor2.equals(other.Bcolor2))
            return false;
        if (Bcolor3 == null) {
            if (other.Bcolor3 != null)
                return false;
        } else if (!Bcolor3.equals(other.Bcolor3))
            return false;
        if (Bcolor4 == null) {
            if (other.Bcolor4 != null)
                return false;
        } else if (!Bcolor4.equals(other.Bcolor4))
            return false;
        if (Tarea1 == null) {
            if (other.Tarea1 != null)
                return false;
        } else if (!Tarea1.equals(other.Tarea1))
            return false;
        if (Tarea2 == null) {
            if (other.Tarea2 != null)
                return false;
        } else if (!Tarea2.equals(other.Tarea2))
            return false;
        if (Tarea3 == null) {
            if (other.Tarea3 != null)
                return false;
        } else if (!Tarea3.equals(other.Tarea3))
            return false;
        if (bBack == null) {
            if (other.bBack != null)
                return false;
        } else if (!bBack.equals(other.bBack))
            return false;
        if (bBinary == null) {
            if (other.bBinary != null)
                return false;
        } else if (!bBinary.equals(other.bBinary))
            return false;
        if (bCancel == null) {
            if (other.bCancel != null)
                return false;
        } else if (!bCancel.equals(other.bCancel))
            return false;
        if (bHEx == null) {
            if (other.bHEx != null)
                return false;
        } else if (!bHEx.equals(other.bHEx))
            return false;
        if (bMinus == null) {
            if (other.bMinus != null)
                return false;
        } else if (!bMinus.equals(other.bMinus))
            return false;
        if (bMultiplication == null) {
            if (other.bMultiplication != null)
                return false;
        } else if (!bMultiplication.equals(other.bMultiplication))
            return false;
        if (bOctal == null) {
            if (other.bOctal != null)
                return false;
        } else if (!bOctal.equals(other.bOctal))
            return false;
        if (bPlus == null) {
            if (other.bPlus != null)
                return false;
        } else if (!bPlus.equals(other.bPlus))
            return false;
        if (bShare == null) {
            if (other.bShare != null)
                return false;
        } else if (!bShare.equals(other.bShare))
            return false;
        if (bSum == null) {
            if (other.bSum != null)
                return false;
        } else if (!bSum.equals(other.bSum))
            return false;
        if (button0 == null) {
            if (other.button0 != null)
                return false;
        } else if (!button0.equals(other.button0))
            return false;
        if (button1 == null) {
            if (other.button1 != null)
                return false;
        } else if (!button1.equals(other.button1))
            return false;
        if (button2 == null) {
            if (other.button2 != null)
                return false;
        } else if (!button2.equals(other.button2))
            return false;
        if (button3 == null) {
            if (other.button3 != null)
                return false;
        } else if (!button3.equals(other.button3))
            return false;
        if (button4 == null) {
            if (other.button4 != null)
                return false;
        } else if (!button4.equals(other.button4))
            return false;
        if (button5 == null) {
            if (other.button5 != null)
                return false;
        } else if (!button5.equals(other.button5))
            return false;
        if (button6 == null) {
            if (other.button6 != null)
                return false;
        } else if (!button6.equals(other.button6))
            return false;
        if (button7 == null) {
            if (other.button7 != null)
                return false;
        } else if (!button7.equals(other.button7))
            return false;
        if (button8 == null) {
            if (other.button8 != null)
                return false;
        } else if (!button8.equals(other.button8))
            return false;
        if (button9 == null) {
            if (other.button9 != null)
                return false;
        } else if (!button9.equals(other.button9))
            return false;
        if (buttonComma == null) {
            if (other.buttonComma != null)
                return false;
        } else if (!buttonComma.equals(other.buttonComma))
            return false;
        if (jText == null) {
            if (other.jText != null)
                return false;
        } else if (!jText.equals(other.jText))
            return false;
        if (oLast != other.oLast)
            return false;
        if (onAction != other.onAction)
            return false;
        if (onBinary != other.onBinary)
            return false;
        if (onHex != other.onHex)
            return false;
        if (onOct != other.onOct)
            return false;
        if (operations != other.operations)
            return false;
        if (sBulider == null) {
            if (other.sBulider != null)
                return false;
        } else if (!sBulider.equals(other.sBulider))
            return false;
        return true;
    }












    




    




    
}
