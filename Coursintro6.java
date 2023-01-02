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

public class Coursintro6 extends JFrame implements ActionListener{
    JPanel Pback, Pfront, Ptop, Pside;
    JLabel AcCourse , lh3, lh4, lh5, lh6, lh7,imgsmall, LMycart, Conodr,   conl, ckl, pp, pc, pct, dd, tt, ttt, ppt, mn, mc, lo, lol, coo1, ckp;
    JButton offrsbutton , studymat, cocont, Profile,bh5, bh6,bh7,  lh2, bh8, bh9,buttab , bh10, bh11,Enrl,  butta1,butta2, butta3, butta4, butta5, butta6, butta7,bbback;
    JComboBox combo;
    ImageIcon ACcour1 ,minicourse, cora ;

    public Coursintro6(){
            super("Course Details-বিদ্যাকোষ");
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

         Pside = new JPanel();
         Pside.setBounds(440,130,240,350);
        // Pside.setOpaque(true);
         Pside.setBackground(Color.decode("#FFE5B4"));
         Pside.setLayout(null);
         //Pfront.add(Pside);

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

     LMycart = new JLabel("OOP1 [JAVA]");
     LMycart.setFont(new Font("Roboto" ,Font.BOLD, 25 ));
     LMycart.setBounds(50, 30,270,30);
     LMycart.setForeground(Color.black);
     LMycart.setBackground(Color.decode("#5478E4"));
      Pfront.add(LMycart);

      
     mn = new JLabel("Course Instructor");
     mn.setFont(new Font("Roboto" ,Font.BOLD, 18 ));
     mn.setBounds(50, 60,150,20);
     mn.setForeground(Color.black);
     mn.setBackground(Color.decode("#5478E4"));
      Pfront.add(mn);

      mc = new JLabel("<html><p>Mbappe Einstain <br>Teacher, Biddakosh</p></html>");
      mc.setFont(new Font("Roboto" ,Font.BOLD, 15 ));
      mc.setBounds(50, 160,150,40);
      mc.setForeground(Color.black);
      mc.setBackground(Color.decode("#5478E4"));
       Pfront.add(mc);

       lo = new JLabel("<html><p><u>Learning Outcome</u></p></html>");
       lo.setFont(new Font("Roboto" ,Font.BOLD, 20 ));
       lo.setBounds(50, 200,180,28);
       lo.setForeground(Color.black);
       lo.setBackground(Color.decode("#5478E4"));
        Pfront.add(lo);

        lol = new JLabel("<html><ul type='disc'><li>You can solve critical Programming problems<li>Justify yourself very easily<li>Earn an Idea about Question Pattern</ul></html> ");
        lol.setFont(new Font("Roboto" ,Font.BOLD, 15 ));
        lol.setBounds(10, 190,340,150);
        lol.setForeground(Color.black);
        lol.setBackground(Color.decode("#5478E4"));
         Pfront.add(lol);

        // Conodr = new JLabel("<html><p align ='center'>Confirm Order</p></html>");
        // Conodr.setFont(new Font("Roboto" ,Font.BOLD, 20 ));
        // Conodr.setOpaque(true);
        // Conodr.setBorder(border);
        // Conodr.setBounds(50, 70,140,25);
        // Conodr.setForeground(Color.black);
        // Conodr.setBackground(Color.YELLOW);
        // Pfront.add(Conodr);

        ImageIcon minicourse = new ImageIcon("D:\\Final_Biddakosh\\Instructor pic.png");
         conl = new JLabel( minicourse);
       conl.setBounds(50, 90,60,60);
        Pfront.add(conl);


     
        ImageIcon cora1 = new ImageIcon("D:\\Final_Biddakosh\\Java Big.png");
         coo1 = new JLabel(cora1);
       coo1.setBounds(30, 20,180,120);
        Pside.add(coo1);

    

        ckl = new JLabel("<html><s>25000/-</s><font face='Tahoma'" + " color=red>  15000/-</font></html>");
        ckl.setFont(new Font("Roboto" ,Font.BOLD, 17 ));
        ckl.setBounds(70, 145,140,20);
        ckl.setForeground(Color.black);
        ckl.setBackground(Color.YELLOW);
        Pside.add(ckl);

        ckp = new JLabel("<html><ul type='disc'><li>Time needed 180 hours<li>50 Videos<li>70 Notes<li>21 Quizzes</ul></html>");
        ckp.setFont(new Font("Roboto" ,Font.BOLD, 13 ));
        ckp.setBounds(0, 150,500,200);
        ckp.setForeground(Color.black);
        ckp.setBackground(Color.YELLOW);
        Pside.add(ckp);


Enrl = new JButton();
Enrl.setText ("Enroll Now");
Enrl.setFont(new Font("Roboto",Font.BOLD,20));
Enrl.setForeground(Color.white);
Enrl.setBackground(Color.black);
Enrl.setBounds(30, 170, 180, 30);
Enrl.setFocusable(true);
Enrl.addActionListener(this);
Enrl.addMouseListener(new MouseAdapter(){

 public void mouseEntered(MouseEvent evt){
     
    Enrl.setBackground(Color.decode( "#808080"));  
       
 }	
 public void mouseExited(MouseEvent evt){
     
     
      Enrl.setBackground(Color.black); 
     
 }
});
Pside.add(Enrl);



  

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


          this.add(Pside);
         this.add(Ptop);
        
         this.add(Pfront);
        
         this.add(Pback);
         
        
        }
        
    public void actionPerformed(ActionEvent ae)
    {        if(ae.getSource()==combo )
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
      if(ae.getSource()==Enrl )
			{  
        CartFC1confirmOrder6 fopp = new CartFC1confirmOrder6();
        fopp.show();
				this.setVisible(false);
				fopp.setVisible(true);
            
         }
         if(ae.getSource()== bbback)
         {  Homepage h = new Homepage();
           h.show();
            this.setVisible(false);
            h.setVisible(true);
         
               
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


