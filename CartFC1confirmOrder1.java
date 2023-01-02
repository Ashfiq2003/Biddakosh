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

public class CartFC1confirmOrder1 extends JFrame implements ActionListener{
    JPanel Pback, Pfront, Ptop;
    JLabel AcCourse , lh3, lh4, lh5, lh6, lh7,imgsmall, LMycart, Conodr,   conl, cl1, pp, pc, pct, dd, tt, ttt, ppt, lpayment;
    JButton offrsbutton , studymat, cocont, Profile,bh5, bh6,bh7,  lh2, bh8, bh9,buttab , bh10, bh11,pay,  butta1,butta2, butta3, butta4, butta5, butta6, butta7,bbback;
    JComboBox combo;
    ImageIcon ACcour1 ,minicourse ;

    public CartFC1confirmOrder1(){
            super("Course Payment-বিদ্যাকোষ");
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
       // imgsmall.setOpaque(true);
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

     LMycart = new JLabel("My Cart");
     LMycart.setFont(new Font("Roboto" ,Font.BOLD, 25 ));
     LMycart.setBounds(50, 30,150,30);
     LMycart.setForeground(Color.black);
     LMycart.setBackground(Color.decode("#5478E4"));
      Pfront.add(LMycart);

        Conodr = new JLabel("Confirm Order", JLabel.CENTER);
        Conodr.setFont(new Font("Roboto" ,Font.BOLD, 20 ));
        Conodr.setOpaque(true);
        Conodr.setBorder(border);
        Conodr.setBounds(50, 70,140,25);
        Conodr.setForeground(Color.black);
        Conodr.setBackground(Color.YELLOW);
        Pfront.add(Conodr);

        lpayment = new JLabel("Payment",JLabel.CENTER);
        // lpayment.setHorizontalTextPosition(SwingConstants.CENTER);
        lpayment.setFont(new Font("Roboto" ,Font.BOLD, 20 ));
        lpayment.setOpaque(true);
        lpayment.setBorder(border);
        lpayment.setBounds(350, 70,300,25);
        lpayment.setForeground(Color.black);
        lpayment.setBackground(Color.YELLOW);
        Pfront.add(lpayment);

        ImageIcon minicourse = new ImageIcon("D:\\Final_Biddakosh\\HSC biddakosh small.png");
         conl = new JLabel( minicourse);
       conl.setBounds(50, 110,120,70);
        Pfront.add(conl);

        cl1 = new JLabel("<html><p>HSC Physics<br>Tk. 800</p></html>");
        cl1.setFont(new Font("Roboto" ,Font.BOLD, 15 ));
        cl1.setBounds(180, 110,140,60);
        cl1.setForeground(Color.BLACK);
        cl1.setBackground(Color.YELLOW);
        Pfront.add(cl1);


        
        pp = new JLabel("Product Price");
        pp.setFont(new Font("Roboto" ,Font.BOLD, 15 ));
        pp.setBounds(350, 110,140,20);
        pp.setForeground(Color.black);
        pp.setBackground(Color.YELLOW);
        Pfront.add(pp);


        ppt = new JLabel("1500/-");
        ppt.setFont(new Font("Roboto" ,Font.BOLD, 15 ));
        ppt.setBounds(600, 110,80,20);
        ppt.setForeground(Color.black);
        ppt.setBackground(Color.YELLOW);
        Pfront.add(ppt);
 
        pc = new JLabel("Discount");
        pc.setFont(new Font("Roboto" ,Font.BOLD, 15 ));
        pc.setBounds(350, 130,80,20);
        pc.setForeground(Color.black);
        pc.setBackground(Color.YELLOW);
        Pfront.add(pc);

        pct = new JLabel("-700/-");
        pct.setFont(new Font("Roboto" ,Font.BOLD, 15 ));
        pct.setBounds(600, 130,140,20);
        pct.setForeground(Color.black);
        pct.setBackground(Color.YELLOW);
        Pfront.add(pct);

         dd = new JLabel("<html><p align='left'>__________________________________________</p></html>");
         dd.setFont(new Font("Roboto" ,Font.BOLD, 20 ));
        // dd.setOpaque(true);
        // dd.setBorder(border);
         dd.setBounds(350, 140,300,25);
         dd.setForeground(Color.black);
         dd.setBackground(Color.YELLOW);
        Pfront.add( dd);
 
          tt = new JLabel("<html><p align='left'><b>Total(Inc. VAT)</b></html>");
          tt.setFont(new Font("Roboto" ,Font.BOLD, 16 ));
          tt.setBounds(350, 163,140,18);
          tt.setForeground(Color.black);
          tt.setBackground(Color.YELLOW);
       Pfront.add(tt);

       
       ttt = new JLabel("<html><p align='left'><b>800/-</b></html>");
       ttt.setFont(new Font("Roboto" ,Font.BOLD, 16 ));
       ttt.setBounds(600, 163,140,18);
       ttt.setForeground(Color.black);
       ttt.setBackground(Color.YELLOW);
    Pfront.add(ttt);


        

pay = new JButton();
pay.setText ("Pay Now");
pay.setFont(new Font("Roboto",Font.BOLD,20));
pay.setForeground(Color.white);
pay.setBackground(Color.black);
pay.setBounds(350, 195, 300, 30);


pay.setFocusable(true);
pay.addActionListener(this);
pay.addMouseListener(new MouseAdapter(){

 public void mouseEntered(MouseEvent evt){
     
    pay.setBackground(Color.decode( "#808080"));  
       
 }	
 public void mouseExited(MouseEvent evt){
     
     
      pay.setBackground(Color.black); 
     
 }
});
Pfront.add(pay);



  

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

         this.add(Ptop);
         this.add(Pfront);
         this.add(Pback);
        
        }
        
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==bbback )
			{  
       
        Coursintro1  cll = new  Coursintro1();
        cll.show();
        cll .setVisible(false);
        cll .setVisible(true);
         }

         if(ae.getSource()==pay )
         {  
           PaymentCourse1 cf = new PaymentCourse1();
           cf.show();
           cf.setVisible(false);
           cf.setVisible(true);
               
            }

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

                       if(ae.getSource()==studymat )
                       {  
                             StudyMaterials sm = new StudyMaterials();
                             sm.show();
                         this.setVisible(false);
                             sm.setVisible(true);
                          }
                 
                          
                          if(ae.getSource()==offrsbutton )
                       {  
                             AvailableOffer ao= new AvailableOffer();
                             ao.show();
                         this.setVisible(false);
                             ao.setVisible(true);
                          }
                          


    }

}

