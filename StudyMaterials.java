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

public class StudyMaterials extends JFrame implements ActionListener{
    JPanel Pback, Pfront, Ptop;
    JLabel AcCourse , lh3, lh4, lh5, lh6, lh7,imgsmall;
    JButton offrsbutton , studymat, cocont, Profile,bh5, bh6,bh7,  lh2, bh8, pbt,bh9, bll, bh10, bh11, butta1,butta2, butta3, butta4, butta5, butta6, butta7,bbback;
    JComboBox combo;
    ImageIcon ACcour1, pb  ;

    public StudyMaterials(){
            super("Study Materials-বিদ্যাকোষ");
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


         String items[]={"Select Course Type","Available Offer","Academic","Admission","Skills",};        
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


   AcCourse = new JLabel("<html><b><u>Study Materials</u></b></html>");
   AcCourse.setFont(new Font("Roboto" ,Font.BOLD, 25 ));
   AcCourse.setBounds(280, 15,350,30);
   AcCourse.setForeground(Color.black);
   AcCourse.setBackground(Color.white);
   //AcCourse.setBorder(border);
    Pfront.add(AcCourse);

  
    ImageIcon cour5 = new ImageIcon("D:\\Final_Biddakosh\\Secretes of Java.png");
    butta5 = new JButton(cour5);
    butta5.setBounds(120, 80,120,170);
    Pfront.add(butta5);


    bh8 = new JButton();
    bh8.setText ("<html><p align='center'>Secrets of Java<br>By Nazmul Hossain<br> <s>1600/-</s><font face='Tahoma'" + " color=yellow>  1200/-</font></p></html>");
    bh8.setFont(new Font("Roboto",Font.BOLD,12));
    bh8.setForeground(Color.black);
    bh8.setBackground(Color.decode("#5478E4"));
    bh8.setBounds(120, 264, 120, 50);

   
    bh8.setFocusable(true);
    bh8.addActionListener(this);
    bh8.addMouseListener(new MouseAdapter(){
    
     public void mouseEntered(MouseEvent evt){
         
        bh8.setBackground(Color.decode("#9DBCD4"));  
           
     }	
     public void mouseExited(MouseEvent evt){
         
         
          bh8.setBackground(Color.decode("#5478E4")); 
         
     }
 });
 Pfront.add(bh8);


    ImageIcon cour6 = new ImageIcon("D:\\Final_Biddakosh\\C++ Book.png");
    butta6 = new JButton(cour6);
    butta6.setBounds(295, 80,120,170);
    Pfront.add(butta6);


    bh9 = new JButton();
    bh9.setText ("<html><p align='center'>Basic to Advance C++<br>By C.Lamagna<br><s>1000</s><font face='Tahoma'" + " color=yellow>  800/-</font></p></html>");
    bh9.setFont(new Font("Roboto",Font.BOLD,12));
    bh9.setForeground(Color.black);
    bh9.setBackground(Color.decode("#5478E4"));
    bh9.setBounds(295, 264,120,50);

    
    bh9.setFocusable(true);
    bh9.addActionListener(this);
    bh9.addMouseListener(new MouseAdapter(){
    
     public void mouseEntered(MouseEvent evt){
         
        bh9.setBackground(Color.decode("#9DBCD4"));  
           
     }	
     public void mouseExited(MouseEvent evt){
         
         
          bh9.setBackground(Color.decode("#5478E4")); 
         
     }
 });
 Pfront.add(bh9);

 
 ImageIcon pb = new ImageIcon("D:\\Final_Biddakosh\\physics book.png");
    pbt = new JButton(pb);
    pbt.setBounds(470, 80,120,170);
    Pfront.add(pbt);
 bll = new JButton();
 bll.setText ("<html><p align='center'>Physics<br>By Shahjahan Tapan<br><s>700</s><font face='Tahoma'" + " color=yellow>  550/-</font></p></html>");
 bll.setFont(new Font("Roboto",Font.BOLD,12));
 bll.setForeground(Color.black);
 bll.setBackground(Color.decode("#5478E4"));
 bll.setBounds(470, 264,120,50);

 
 bll.setFocusable(true);
 bll.addActionListener(this);
 bll.addMouseListener(new MouseAdapter(){
 
  public void mouseEntered(MouseEvent evt){
      
     bll.setBackground(Color.decode("#9DBCD4"));  
        
  }	
  public void mouseExited(MouseEvent evt){
      
      
       bll.setBackground(Color.decode("#5478E4")); 
      
  }
});
Pfront.add(bll);


// bbback = new JButton();
// bbback.setText ("Back");
// bbback.setFont(new Font("Roboto",Font.BOLD,20));
// bbback.setForeground(Color.white);
// bbback.setBackground(Color.black);
// bbback.setBounds(50, 382, 100, 30);


// bbback.setFocusable(true);
// bbback.addActionListener(this);
// bbback.addMouseListener(new MouseAdapter(){

//  public void mouseEntered(MouseEvent evt){
     
//     bbback.setBackground(Color.decode( "#808080"));  
       
//  }	
//  public void mouseExited(MouseEvent evt){
     
     
//       bbback.setBackground(Color.black); 
     
//  }
// });
// Pfront.add(bbback);

         this.add(Ptop);
         this.add(Pfront);
         this.add(Pback);
        
        }
        
    public void actionPerformed(ActionEvent ae)
    {
      String items[]={"Select Course Type","Available Courses","Academic","Admission","Skills",}; 
 combo.addActionListener(this);    
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


