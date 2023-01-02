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

public class Homepage extends JFrame implements ActionListener{
    JPanel Pback, Pfront, Ptop;
    JLabel showpopcourse , lh3, lh4, lh5, lh6, lh7,imgsmall;
    JButton offrsbutton , studymat, cocont, Profile,bh5, bh6,bh7,  lh2, bh8, bh9, bh10, bh11, assd,butta2, butta3, butta4, butta5, butta6, butta7,bbback;
    JComboBox combo;
    ImageIcon cour1, cour2,cour3, cour4, cour5, cour6, cour7, cour8, cour9, cour10, cour11, cour12;

    public Homepage(){
            super("Homepage First-বিদ্যাকোষ");
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
         combo.setSelectedIndex(1);
      //  combo.setSelectedIndex(2);
      //  combo.setSelectedIndex(3);
      //  combo.setSelectedIndex(4);
        combo.setFont(new Font("Roboto", Font.BOLD, 15));
        combo.setForeground(Color.BLACK);
        combo.setBackground(Color.WHITE);
        combo.setBounds(80, 20, 160, 30);
      //   combo.addActionListener(new ActionListener() ;
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


    showpopcourse = new JLabel("Available Courses");
    showpopcourse.setFont(new Font("Roboto" ,Font.BOLD, 25 ));
    showpopcourse.setBounds(270, 8,220,30);
    showpopcourse.setForeground(Color.black);
    showpopcourse.setBackground(Color.white);
    showpopcourse.setBorder(border);
    Pfront.add(showpopcourse);

    ImageIcon cour1 = new ImageIcon("D:\\Final_Biddakosh\\HSC Physics big.png");
    assd = new JButton(cour1);
    assd.setBounds(50, 55,180,120);
    assd.addActionListener(this);
    Pfront.add(assd);


    lh2 = new JButton();
    lh2.setText ("<html><p>HSC Physics<br><s>1500/-</s><font face='Tahoma'" + " color=yellow>  800/-</font></p></html>");
    lh2.setFont(new Font("Roboto",Font.BOLD,12));
    lh2.setForeground(Color.black);
    lh2.setBackground(Color.decode("#5478E4"));
    lh2.setBounds(50, 178, 180, 30);
    

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
    butta2.setBounds(270, 55,180,120);
    butta2.addActionListener(this);
    Pfront.add(butta2);


    bh5 = new JButton();
    bh5.setText ("<html><p>HSC ICT<br><s>1000/-</s><font face='Tahoma'" + " color=yellow>  500/-</font></p></html>");
    bh5.setFont(new Font("Roboto",Font.BOLD,12));
    bh5.setForeground(Color.black);
    bh5.setBackground(Color.decode("#5478E4"));
    bh5.setBounds(270, 178, 180, 30);
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

    
    ImageIcon cour3 = new ImageIcon("D:\\Final_Biddakosh\\Medical Big.png");
    butta3 = new JButton(cour3);
    butta3.setBounds(490, 55,180,120);
    butta3.addActionListener(this);
    Pfront.add(butta3);


    bh6 = new JButton();
    bh6.setText ("<html><p>Medical Admission<br><s>10000/-</s><font face='Tahoma'" + " color=yellow>    5000/-</font></p></html>");
    bh6.setFont(new Font("Roboto",Font.BOLD,12));
    bh6.setForeground(Color.black);
    bh6.setBackground(Color.decode("#5478E4"));
    bh6.setBounds(490, 178, 180, 30);
    Pfront.add(bh6);


    bh6.setFocusable(true);
    bh6.addActionListener(this);
    bh6.addMouseListener(new MouseAdapter(){
    
     public void mouseEntered(MouseEvent evt){
         
        bh6.setBackground(Color.decode("#9DBCD4"));  
           
     }	
     public void mouseExited(MouseEvent evt){
         
         
          bh6.setBackground(Color.decode("#5478E4")); 
         
     }
 });
 Pfront.add(bh6);


    ImageIcon cour4 = new ImageIcon("D:\\Final_Biddakosh\\Engineering Admission big.png");
    butta4 = new JButton(cour4);
    butta4.setBounds(50, 220,180,120);
    butta4.addActionListener(this);
    Pfront.add(butta4);


    bh7 = new JButton();
    bh7.setText ("<html><p>Engineering Admission<br><s>18000/-</s><font face='Tahoma'" + " color=yellow>  9500/-</font></p></html>");
    bh7.setFont(new Font("Roboto",Font.BOLD,12));
    bh7.setForeground(Color.black);
    bh7.setBackground(Color.decode("#5478E4"));
    bh7.setBounds(50, 343, 180, 30);


    bh7.setFocusable(true);
    bh7.addActionListener(this);
    bh7.addMouseListener(new MouseAdapter(){
    
     public void mouseEntered(MouseEvent evt){
         
        bh7.setBackground(Color.decode("#9DBCD4"));  
           
     }	
     public void mouseExited(MouseEvent evt){
         
         
          bh7.setBackground(Color.decode("#5478E4")); 
         
     }
 });
 Pfront.add(bh7);



    ImageIcon cour5 = new ImageIcon("D:\\Final_Biddakosh\\C1.jpg");
    butta5 = new JButton(cour5);
    butta5.setBounds(270, 220,180,120);
    butta5.addActionListener(this);
    Pfront.add(butta5);


    bh8 = new JButton();
    bh8.setText ("<html><p>C++ Advance<br><s>16000/-</s><font face='Tahoma'" + " color=yellow>  8500/-</font></p></html>");
    bh8.setFont(new Font("Roboto",Font.BOLD,12));
    bh8.setForeground(Color.black);
    bh8.setBackground(Color.decode("#5478E4"));
    bh8.setBounds(270, 343, 180, 30);

   
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


    ImageIcon cour6 = new ImageIcon("D:\\Final_Biddakosh\\Java Big.png");
    butta6 = new JButton(cour6);
    butta6.setBounds(490, 220,180,120);
    butta6.addActionListener(this);
    Pfront.add(butta6);


    bh9 = new JButton();
    bh9.setText ("<html><p>OOP1 [JAVA]<br><s>25000/-</s><font face='Tahoma'" + " color=yellow>  15000/-</font></p></html>");
    bh9.setFont(new Font("Roboto",Font.BOLD,12));
    bh9.setForeground(Color.black);
    bh9.setBackground(Color.decode("#5478E4"));
    bh9.setBounds(490, 343, 180, 30);

    
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
      
         if(ae.getSource()==assd )
			{  
            Coursintro1  cll = new  Coursintro1();
            cll.show();
				this.setVisible(false);
				cll.setVisible(true);
            
         }

         
         if(ae.getSource()== lh2 )
			{  
            Coursintro1  cll = new  Coursintro1();
            cll.show();
				this.setVisible(false);
				cll.setVisible(true);
            
         }

         if(ae.getSource()==butta2 )
			{  
            
    Coursintro2  clp = new  Coursintro2();
   
               clp.show();
                        this.setVisible(false);
                        clp.setVisible(true);
                        
                     }

                     
                     if(ae.getSource()== bh5 )
                     {  
                     
               Coursintro2  clp = new  Coursintro2();
            
               clp.show();
                        this.setVisible(false);
                        clp.setVisible(true);
            
         }

         
         if(ae.getSource()==butta3 )
			{  
            Coursintro3  clii = new  Coursintro3();
            clii .show();
				this.setVisible(false);
				clii .setVisible(true);
            
         }

         
         if(ae.getSource()== bh6 )
			{  
            Coursintro3  clii = new  Coursintro3();
            clii .show();
				this.setVisible(false);
				clii .setVisible(true);
            
         }
          
         if(ae.getSource()==butta4 )
			{  
            Coursintro4  clko = new  Coursintro4(); 
            clko .show();
				this.setVisible(false);
            clko .setVisible(true);
            
         }

         
         if(ae.getSource()== bh7 )
			{  
            Coursintro4  clko = new  Coursintro4(); 
            clko .show();
				this.setVisible(false);
            clko .setVisible(true);
            
         }

         if(ae.getSource()==butta5 )
			{  
            Coursintro5  clyu = new  Coursintro5();
            clyu .show();
				this.setVisible(false);
            clyu .setVisible(true);
            
         }

         
         if(ae.getSource()== bh8 )
			{  
            Coursintro5  clyu = new  Coursintro5();
            clyu .show();
				this.setVisible(false);
            clyu .setVisible(true);
            
         }

         if(ae.getSource()==butta6 )
			{  
            Coursintro6  coll= new  Coursintro6();
            coll .show();
				this.setVisible(false);
            coll .setVisible(true);
            
         }

         
         if(ae.getSource()== bh9 )
			{  
            Coursintro6  coll= new  Coursintro6();
            coll.show();
				this.setVisible(false);
            coll .setVisible(true);
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
 

   

  
   
         