import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import java.lang.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class PaymentCourse6 extends JFrame implements ActionListener{
    JPanel Pback, Pfront, Ptop;
    JLabel paysec , SecMeth,payhere,EntNum, Entvari,entpassp,entpassco,imgsmall,imgpay, imgpayn, imgpayr,imgpayu;
    JButton offrsbutton , studymat, cocont, Profile,Appnum,Appvar ,bbback;
    JRadioButton R1, R2, R3, R4;
    JTextField entn, entvar, entpass;
    JPasswordField entpal;
    ButtonGroup group;
    JComboBox combo;
    ImageIcon  ima, iman, imar, imau;



    public PaymentCourse6(){
            super("Payment Course 1-বিদ্যাকোষ");
            this.setBounds(new Rectangle(00,00,800,600));
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);

                setIconImage(new ImageIcon("D:\\Final_Biddakosh\\logo.png").getImage());
                Pback = new JPanel();
                Pback.setBounds(0,0,800,600);
                Pback.setBackground(Color.decode("#000000") );
                Pback.setLayout(null);
                Pfront = new JPanel();


         Pfront.setBounds(30,100,725,420);
         Pfront.setBackground(Color.decode("#5478E4") );
         Pfront.setLayout(null);
        
         Ptop = new JPanel();
         Ptop.setBounds(30,30,725,70);
         Ptop.setBackground(Color.decode("#FFE5B4"));
         Ptop.setLayout(null);

            ImageIcon image = new ImageIcon("D:\\Final_Biddakosh\\biddakoshtop.png");
            imgsmall = new JLabel();
            imgsmall.setText(" "); 
            imgsmall.setIcon(image);
            imgsmall.setOpaque(true);
            imgsmall.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
            imgsmall.setForeground(Color.white);
            imgsmall.setBounds(10,10,50,50);
            Ptop.add(imgsmall);

         String items[]={"Select Course Type","Available Courses","Academic","Admission","Skills",};        
        combo = new JComboBox(items);
        combo.setFont(new Font("Roboto", Font.BOLD, 15));
        combo.setForeground(Color.BLACK);
        combo.setBackground(Color.WHITE);
        combo.setBounds(80, 20, 160, 30);
        combo.addActionListener(this);
        Ptop.add(combo); 

      offrsbutton = new JButton("Offers");
      offrsbutton.setFont(new Font("Roboto",Font.BOLD,20));
      offrsbutton.setOpaque(true);
      offrsbutton.setForeground(Color.black);
      offrsbutton.setBackground(Color.decode("#B7C9E2")); 
      offrsbutton.setBounds(250,20,70,30);

     SoftBevelBorder border = new SoftBevelBorder(BevelBorder.RAISED, Color.black.darker(), Color.black.darker(), Color.black.darker(), Color.black.darker());
      offrsbutton.setBorder(border);
      offrsbutton.setFocusable(true);
      offrsbutton.addActionListener(this);
      offrsbutton.addMouseListener(new MouseAdapter(){
       public void mouseEntered(MouseEvent evt){
           
          offrsbutton.setBackground(Color.decode("#9DBCD4"));  
             
       }	
       public void mouseExited(MouseEvent evt){
           
           
            offrsbutton.setBackground(Color.decode("#B7C9E2")); 
           
       }
   });
   Ptop.add(offrsbutton);

   
  studymat = new JButton("Study Materials");
  studymat.setFont(new Font("Roboto",Font.BOLD,20));
  studymat.setOpaque(true);
  studymat.setForeground(Color.black);
  studymat.setBackground(Color.decode("#B7C9E2")); 
  studymat.setBounds(330,20,150,30);
  studymat.setBorder(border);
  studymat.setFocusable(true);
  studymat.addActionListener(this);
  studymat.addMouseListener(new MouseAdapter(){
   
    public void mouseEntered(MouseEvent evt){
        
      studymat.setBackground(Color.decode("#9DBCD4"));  
          
    }	
    public void mouseExited(MouseEvent evt){
        
        
        studymat.setBackground(Color.decode("#B7C9E2")); 
        
    }
});
Ptop.add(studymat);


cocont = new JButton("Hotline:168");
cocont.setFont(new Font("Roboto",Font.BOLD,20));
cocont.setOpaque(true);
cocont.setForeground(Color.black);
cocont.setBackground(Color.decode("#B7C9E2")); 
cocont.setBounds(490,20,120,30);
cocont.setBorder(border);
cocont.setFocusable(true);
cocont.addActionListener(this);
cocont.addMouseListener(new MouseAdapter(){
 
  public void mouseEntered(MouseEvent evt){
      
    cocont.setBackground(Color.decode("#9DBCD4"));  
        
  }	
  public void mouseExited(MouseEvent evt){
      
      
      cocont.setBackground(Color.decode("#B7C9E2")); 
      
  }
});
Ptop.add(cocont);


    Profile = new JButton("Profile");
    Profile.setFont(new Font("Roboto",Font.BOLD,20));
    Profile.setOpaque(true);
    Profile.setForeground(Color.black);
    Profile.setBackground(Color.decode("#B7C9E2")); 
    Profile.setBounds(620,20,95,30);
    Profile.setBorder(border);
    Profile.setFocusable(true);
    Profile.addActionListener(this);
    Profile.addMouseListener(new MouseAdapter(){
 
    public void mouseEntered(MouseEvent evt){
      
    cocont.setBackground(Color.decode("#9DBCD4"));  
        
    }	
    public void mouseExited(MouseEvent evt){
      
      
      cocont.setBackground(Color.decode("#B7C9E2")); 
      
     }
    });

Ptop.add(Profile);

paysec = new JLabel("Make Payment",JLabel.CENTER);
paysec.setFont(new Font("Roboto" ,Font.BOLD, 25 ));
paysec.setBounds(270, 12,220,30);
paysec.setOpaque(true);
paysec.setForeground(Color.black);
paysec.setBackground(Color.WHITE);
paysec.setBorder(border);
Pfront.add(paysec);

SecMeth= new JLabel("Select A Payment Method",JLabel.CENTER);
SecMeth.setFont(new Font("Roboto" ,Font.BOLD, 20 ));
SecMeth.setBounds(80, 60,250,30);
SecMeth.setOpaque(true);
SecMeth.setForeground(Color.black);
SecMeth.setBackground(Color.WHITE);
//SecMeth.setBorder(border);
Pfront.add(SecMeth);

payhere= new JLabel("Payment DashBoard",JLabel.CENTER);
payhere.setFont(new Font("Roboto" ,Font.BOLD, 20 ));
payhere.setBounds(400, 60,250,30);
payhere.setOpaque(true);
payhere.setForeground(Color.black);
payhere.setBackground(Color.WHITE);
//payhere.setBorder(border);
Pfront.add(payhere);


EntNum= new JLabel("Please Enter Your Number");
EntNum.setFont(new Font("Roboto" ,Font.BOLD, 17 ));
EntNum.setBounds(400, 105,250,25);
//EntNum.setOpaque(true);
EntNum.setForeground(Color.black);
//EntNum.setBackground(Color.WHITE);
//EntNum.setBorder(border);
Pfront.add(EntNum);

entn =new JTextField();
entn.setFont(new Font("Roboto" ,Font.BOLD, 17 ));
entn.setBounds(400, 130,140,25);
//entn.setOpaque(true);
entn.setForeground(Color.black);
//entn.setBackground(Color.WHITE);
//entn.setBorder(border);
Pfront.add(entn);

Appnum = new JButton("Apply");
Appnum .setBounds(550, 130, 100,25);
Appnum .setFont(new Font("Roboto",Font.BOLD,20));
Appnum .setOpaque(true);
Appnum .setForeground(Color.black);
Appnum .setBackground(Color.decode("#FFE5B4")); 


 
Appnum.setFocusable(true);
Appnum.addActionListener(this);
Appnum.addMouseListener(new MouseAdapter(){

 public void mouseEntered(MouseEvent evt){
     
  Appnum.setBackground(Color.decode( "#808080"));  
       
 }	
 public void mouseExited(MouseEvent evt){
     
     
  Appnum.setBackground(Color.decode("#FFE5B4")); 
     
 }
});
Pfront.add(Appnum );


entpassco= new JLabel("Enter the Varification Code");
entpassco.setFont(new Font("Roboto" ,Font.BOLD, 17 ));
entpassco.setBounds(400, 165,250,25);
//entpassco.setOpaque(true);
entpassco.setForeground(Color.black);
//entpassco.setBackground(Color.WHITE);
//entpassco.setBorder(border);
Pfront.add(entpassco);

entvar =new JTextField();
entvar.setFont(new Font("Roboto" ,Font.BOLD, 17 ));
entvar.setBounds(400, 190,140,25);
//entvar.setOpaque(true);
entvar.setForeground(Color.black);
//entvar.setBackground(Color.WHITE);
//entvar.setBorder(border);
Pfront.add(entvar);


Appvar = new JButton("Apply");
Appvar .setBounds(550, 190, 100,25);
Appvar .setFont(new Font("Roboto",Font.BOLD,20));
Appvar .setOpaque(true);
Appvar .setForeground(Color.black);
Appvar .setBackground(Color.decode("#FFE5B4")); 

Appvar.setFocusable(true);
Appvar.addActionListener(this);
Appvar.addMouseListener(new MouseAdapter(){

 public void mouseEntered(MouseEvent evt){
     
  Appvar.setBackground(Color.decode( "#808080"));  
       
 }	
 public void mouseExited(MouseEvent evt){
     
     
  Appvar.setBackground(Color.decode("#FFE5B4")); 
     
 }
});
Pfront.add(Appvar );


Entvari= new JLabel("Enter the Varification Code");
Entvari.setFont(new Font("Roboto" ,Font.BOLD, 17 ));
Entvari.setBounds(400, 165,250,25);
//Entvari.setOpaque(true);
Entvari.setForeground(Color.black);
//Entvari.setBackground(Color.WHITE);
//Entvari.setBorder(border);
Pfront.add(Entvari);

entvar =new JTextField();
entvar.setFont(new Font("Roboto" ,Font.BOLD, 17 ));
entvar.setBounds(400, 190,140,25);
//entvar.setOpaque(true);
entvar.setForeground(Color.black);
//entvar.setBackground(Color.WHITE);
//entvar.setBorder(border);
Pfront.add(entvar);


Appvar = new JButton("Apply");
Appvar .setBounds(550, 190, 100,25);
Appvar .setFont(new Font("Roboto",Font.BOLD,20));
Appvar .setOpaque(true);
Appvar .setForeground(Color.black);
Appvar .setBackground(Color.decode("#FFE5B4")); 

Appvar.setFocusable(true);
Appvar.addActionListener(this);
Appvar.addMouseListener(new MouseAdapter(){

 public void mouseEntered(MouseEvent evt){
     
  Appvar.setBackground(Color.decode( "#808080"));  
       
 }	
 public void mouseExited(MouseEvent evt){
     
     
  Appvar.setBackground(Color.decode("#FFE5B4")); 
     
 }
});
Pfront.add(Appvar );


entpassp= new JLabel("Enter Your Password");
entpassp.setFont(new Font("Roboto" ,Font.BOLD, 17 ));
entpassp.setBounds(400, 220,350,25);
//entpass.setOpaque(true);
entpassp.setForeground(Color.black);
//entpass.setBackground(Color.WHITE);
//entpass.setBorder(border);
Pfront.add(entpassp);

entpal =new JPasswordField();
entpal.setFont(new Font("Roboto" ,Font.BOLD, 17 ));
entpal.setBounds(400, 245,250,25);
//entpal.setOpaque(true);
entpal.setForeground(Color.black);
//entpal.setBackground(Color.WHITE);
//entpal.setBorder(border);
Pfront.add(entpal);


Appvar = new JButton("PAY TK. 15000.00");
Appvar .setBounds(400, 280, 250,25);
Appvar .setFont(new Font("Roboto",Font.BOLD,20));
Appvar .setOpaque(true);
Appvar .setForeground(Color.black);
Appvar .setBackground(Color.decode("#FFE5B4")); 

Appvar.setFocusable(true);
Appvar.addActionListener(this);
Appvar.addMouseListener(new MouseAdapter(){

 public void mouseEntered(MouseEvent evt){
     
  Appvar.setBackground(Color.decode( "#808080"));  
       
 }	
 public void mouseExited(MouseEvent evt){
     
     
  Appvar.setBackground(Color.decode("#FFE5B4")); 
     
 }
});
Pfront.add(Appvar );






ImageIcon ima = new ImageIcon("D:\\Final_Biddakosh\\Bkashlogo.png");
imgpay = new JLabel();
imgpay.setText(" "); 
imgpay.setIcon(ima);
// imgsmall.setOpaque(true);
imgpay.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
imgpay.setForeground(Color.white);
imgpay.setBounds(80,100,120,60);
 Pfront.add(imgpay);

R1 = new JRadioButton();
// R1.setMnemonic(KeyEvent.VK_B);

R1.setBounds(50, 120, 20,20);
R1.setFont(new Font("Roboto",Font.BOLD,20));
R1.setOpaque(true);
R1.setForeground(Color.black);
R1.setBackground(Color.decode("#5478E4")); 
Pfront.add(R1);

      
ImageIcon iman = new ImageIcon("D:\\Final_Biddakosh\\Nogod logo.png");
imgpayn = new JLabel();
imgpayn.setText(" "); 
imgpayn.setIcon(iman);
// imgsmall.setOpaque(true);
imgpayn.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
imgpayn.setForeground(Color.white);
imgpayn.setBounds(80,170,120,60);
 Pfront.add(imgpayn);

R2 = new JRadioButton();
//R1.setMnemonic(KeyEvent.VK_B);
R2.setBounds(50, 190, 20, 20);
R2.setFont(new Font("Roboto",Font.BOLD,20));
R2.setOpaque(true);
R2.setForeground(Color.black);
R2.setBackground(Color.decode("#5478E4")); 
Pfront.add(R2);
    
ImageIcon imar = new ImageIcon("D:\\Final_Biddakosh\\Rocket Logo.png");
imgpayr = new JLabel();
imgpayr.setText(" "); 
imgpayr.setIcon(imar);
// imgsmall.setOpaque(true);
imgpayr.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
imgpayr.setForeground(Color.white);
imgpayr.setBounds(80,240,120,60);
 Pfront.add(imgpayr);

 R3 = new JRadioButton();
//R1.setMnemonic(KeyEvent.VK_B);
R3.setBounds(50, 260, 20, 20);
R3.setFont(new Font("Roboto",Font.BOLD,20));
R3.setOpaque(true);
R3.setForeground(Color.black);
R3.setBackground(Color.decode("#5478E4")); 
Pfront.add(R3);

    
ImageIcon imau = new ImageIcon("D:\\Final_Biddakosh\\Upaylogo.png");
imgpayu = new JLabel();
imgpayu.setText(" "); 
imgpayu.setIcon(imau);
// imgsmall.setOpaque(true);
imgpayu.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
imgpayu.setForeground(Color.white);
imgpayu.setBounds(80,310,120,60);
 Pfront.add(imgpayu);

R4 = new JRadioButton();
//R1.setMnemonic(KeyEvent.VK_B);
R4.setBounds(50, 330, 20, 20);
R4.setFont(new Font("Roboto",Font.BOLD,20));
R4.setOpaque(true);
R4.setForeground(Color.black);
R4.setBackground(Color.decode("#5478E4")); 
Pfront.add(R4);

// bh7 = new JRadioButton();
// bh7.setText ("<html><p>Engineering Admission<br><s>18000/-</s><font face='Tahoma'" + " color=yellow>  9500/-</font></p></html>");
// bh7.setFont(new Font("Roboto",Font.BOLD,12));
// bh7.setForeground(Color.black);
// bh7.setBackground(Color.decode("#5478E4"));
// bh7.setBounds(50, 343, 180, 30);
// Pfront.add(bh7);
            

 bbback = new JButton();
 bbback.setText ("Back");
 bbback.setFont(new Font("Roboto",Font.BOLD,20));
 bbback.setForeground(Color.white);
 bbback.setBackground(Color.black);
 bbback.setBounds(50, 382, 100, 30);

 
 bbback.setFocusable(true);
 bbback.addActionListener(this);
 bbback.addMouseListener(new MouseAdapter(){
 
  public void mouseEntered(MouseEvent evt){
      
     bbback.setBackground(Color.decode( "#808080"));  
        
  }	
  public void mouseExited(MouseEvent evt){
      
      
       bbback.setBackground(Color.black); 
      
  }
});
Pfront.add(bbback);


          group = new ButtonGroup();

          group.add(R1);
          group.add(R2);
          group.add(R3);
          group.add(R4);
            
         this.add(Ptop);
         this.add(Pfront);
         this.add(Pback);
        
        }
        
    public void actionPerformed(ActionEvent ae)
    {
      if (ae.getActionCommand().equals("")) {
        System.out.println( group.getSelection().getActionCommand());
                  }
                
                 if (ae.getSource() == Appvar)
                 {
                     // Code To popup an ERROR_MESSAGE Dialog.
                     JOptionPane.showMessageDialog(this, "<html><p align = 'center'>Your Payment is Successful<br>Check Your Profile</p></html>",
                                            "Successful", JOptionPane.INFORMATION_MESSAGE);
                 }
  
                 if(ae.getSource()==Appvar )
                 {  
                   Coursevid6 jjj= new Coursevid6();
                   jjj.show();
                   jjj.setVisible(false);
                   jjj.setVisible(true);
                    }
           
                    if(ae.getSource()==bbback )
                    {  
                      CartFC1confirmOrder6 fopp = new CartFC1confirmOrder6();
                      fopp.show();
                      fopp.setVisible(false);
                      fopp.setVisible(true);}
                      if(ae.getSource()==combo )
                      {  
                           if(combo.getSelectedIndex()==1){
                
                            Homepage h = new Homepage();
                              h.show();
                             this.setVisible(false);
                             h.setVisible(true);
                
                           }}
                
                
                           if(ae.getSource()==combo )
                           {  
                             if(combo.getSelectedIndex()==2){
                  
                              Academic a = new Academic();
                              a .show();
                              this.setVisible(false);
                              a .setVisible(true);
                  
                             }}
                
                             if(ae.getSource()==combo )
                             {  
                               if(combo.getSelectedIndex()==3){
                    
                                  Admission aa = new Admission();
                                  aa .show();
                                this.setVisible(false);
                                aa .setVisible(true);
                               }
                                     }
                
                               if(ae.getSource()==combo )
                               {  
                                 if(combo.getSelectedIndex()==4){
                      
                                  Skills ss = new Skills();
                                  ss.show();
                                  this.setVisible(false);
                                  ss.setVisible(true);
                      
                                 }

                                 }
                          
                       }
                       
  
  


    }




