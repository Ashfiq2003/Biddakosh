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

public class Academic extends JFrame implements ActionListener{
    JPanel Pback, Pfront, Ptop;
    JLabel AcCourse , lh3, lh4, lh5, lh6, lh7,imgsmall;
    JButton offrsbutton , studymat, cocont, Profile,bh5, bh6,bh7,  lh2, bh8, bh9, bh10, bh11, butta1,butta2, butta3, butta4, butta5, butta6, butta7,bbback;
    JComboBox combo;
    ImageIcon ACcour1  ;

    public Academic(){
            super("Academic Course-বিদ্যাকোষ");
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
        combo.setSelectedIndex(2);
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


   AcCourse = new JLabel("<html><b><u>Academic Courses</u></b></html>");
   AcCourse.setFont(new Font("Roboto" ,Font.BOLD, 25 ));
   AcCourse.setBounds(270, 8,220,30);
   AcCourse.setForeground(Color.black);
   AcCourse.setBackground(Color.white);
   //AcCourse.setBorder(border);
    Pfront.add(AcCourse);

    ImageIcon cour1  = new ImageIcon("D:\\Final_Biddakosh\\HSC Physics big.png");
    butta1 = new JButton(cour1 );
    butta1.setBounds(120, 80,180,120);
    butta1.addActionListener(this);
    Pfront.add(butta1);


    lh2 = new JButton();
    lh2.setText ("<html><p>HSC Physics<br><s>1500/-</s><font face='Tahoma'" + " color=yellow>  800/-</font></p></html>");
    lh2.setFont(new Font("Roboto",Font.BOLD,12));
    lh2.setForeground(Color.black);
    lh2.setBackground(Color.decode("#5478E4"));
    lh2.setBounds(120, 204, 180, 30);
    

      lh2.setFocusable(true);
      lh2.addActionListener(this);
      lh2.addMouseListener(new MouseAdapter(){
      
       public void mouseEntered(MouseEvent evt){
           
          lh2.setBackground(Color.decode("#9DBCD4"));  
             
       }	
       public void mouseExited(MouseEvent evt){
           
           
            lh2.setBackground(Color.decode("#5478E4")); 
           
       }
   });
   Pfront.add(lh2);
    
    ImageIcon cour2 = new ImageIcon("D:\\Final_Biddakosh\\HSC ICT BIddakosh Big.png");
    butta2 = new JButton(cour2);
    butta2.setBounds(420, 80,180,120);
    butta2.addActionListener(this);
    Pfront.add(butta2);


    bh5 = new JButton();
    bh5.setText ("<html><p>HSC ICT<br><s>1000/-</s><font face='Tahoma'" + " color=yellow>  500/-</font></p></html>");
    bh5.setFont(new Font("Roboto",Font.BOLD,12));
    bh5.setForeground(Color.black);
    bh5.setBackground(Color.decode("#5478E4"));
    bh5.setBounds(420, 204, 180, 30);
    Pfront.add(bh5);
  

      bh5.setFocusable(true);
      bh5.addActionListener(this);
      bh5.addMouseListener(new MouseAdapter(){
      
       public void mouseEntered(MouseEvent evt){
           
          bh5.setBackground(Color.decode("#9DBCD4"));  
             
       }	
       public void mouseExited(MouseEvent evt){
           
           
            bh5.setBackground(Color.decode("#5478E4")); 
           
       }
   });
   Pfront.add(bh5);

   
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

      if(ae.getSource()==  butta1  )
      {
      
        Coursintro1  cll = new  Coursintro1();
        cll .show();
        this.setVisible(false);
        cll .setVisible(true);}
      
      
      if(ae.getSource()==  lh2  )
      {
      
        Coursintro1  cll = new  Coursintro1();
        cll .show();
        this.setVisible(false);
        cll .setVisible(true);}
      if(ae.getSource()==  butta2  )
      {
      
        Coursintro2  clp = new  Coursintro2();
        clp .show();
        this.setVisible(false);
        clp .setVisible(true);}
      
      
      if(ae.getSource()==  bh5  )
      {
        Coursintro2  clp = new  Coursintro2();
        clp .show();
        this.setVisible(false);
        clp .setVisible(true);}

        if(ae.getSource()== bbback)
			{  Homepage h = new Homepage();
        h.show();
         this.setVisible(false);
         h.setVisible(true);

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
 }}
    


