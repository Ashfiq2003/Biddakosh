import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class NewPass extends JFrame implements ActionListener{
	
	JPanel NewpassPanel;
	 JLabel ImageLog ,pc,wnp, conp, glog;
	// JMenuBar mb1;
	// JMenu m1, m2, m3;
	JButton changepass, pback, gotologinpage ;
	// JList list;
	// JComboBox c1;
	// JTextArea textArea;
    JTextField tnewpass, tconnewpass;
	// File file, file2;

    public NewPass(){


        super("Set A New PassWord-বিদ্যাকোষ");
	this.setBounds(new Rectangle(00,00,800,600));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
        NewpassPanel = new JPanel();
	NewpassPanel.setBounds(0,0,800,600);
	NewpassPanel.setBackground(Color.black);
	NewpassPanel.setLayout(null);
 //   this.add(NewpassPanel);
	
 setIconImage(new ImageIcon("D:\\Final_Biddakosh\\logo.png").getImage());
	ImageIcon image = new ImageIcon("D:\\Final_Biddakosh\\LoginBiddakosh.png");
	ImageLog = new JLabel();
	ImageLog.setText(" ");  //set text of label
	ImageLog.setIcon(image);
	ImageLog.setOpaque(true);
	ImageLog.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	ImageLog.setForeground(Color.white);
	ImageLog.setBounds(0,0,400,600);
	NewpassPanel.add(ImageLog);
    
    pc= new JLabel("Change Password");
    pc.setFont(new Font("Cooper Black MS", Font.BOLD, 30));
    pc.setForeground(Color.WHITE);
    pc.setBounds(460,80,300,35);
    NewpassPanel.add(pc);

   wnp= new JLabel("New Password");
   wnp.setFont(new Font("Cooper Black MS", Font.BOLD, 16));
   wnp.setForeground(Color.blue);
   wnp.setBounds(410,260,150,25);
    NewpassPanel.add(wnp);

    tconnewpass = new JTextField();
    tconnewpass.setBounds(570, 260,200,25);
    NewpassPanel.add(tconnewpass);


    conp= new JLabel("Retype New Password");
   conp.setFont(new Font("Cooper Black MS", Font.BOLD, 16));
   conp.setForeground(Color.blue);
   conp.setBounds(410,300,200,25);
    NewpassPanel.add(conp);


    tnewpass = new JTextField();
    tnewpass.setBounds(585, 300,185,25);
    NewpassPanel.add(tnewpass);


   changepass = new JButton("Confirm");
   changepass.setFont(new Font("Roboto",Font.BOLD,25));
  // changepass.setOpaque(true);
   changepass.setForeground(Color.blue);
   changepass.setBackground(Color.decode("#DEC19B")); 
   changepass.setBounds(500,340,200,35);
   changepass.setBorder(null);
   changepass.setFocusable(true);
   changepass.addActionListener(this);
   changepass.addMouseListener(new MouseAdapter(){
     
      public void mouseEntered(MouseEvent evt){
          
       changepass.setBackground(Color.decode("#Ffdb58"));  
            
      }	
      public void mouseExited(MouseEvent evt){
          
          
         changepass.setBackground(Color.decode("#DEC19B")); 
          
      }
        });
        NewpassPanel.add(changepass);

        glog= new JLabel("Click Here to Login with New Password:");
        glog.setFont(new Font("Cooper Black MS", Font.BOLD, 14));
        glog.setForeground(Color.WHITE);
        glog.setBounds(410,410,280,15);
        NewpassPanel.add(glog);


        gotologinpage = new JButton("Login");
       gotologinpage.setFont(new Font("Roboto",Font.BOLD,14));
      // gotologinpage.setOpaque(true);
       gotologinpage.setForeground(Color.blue);
       gotologinpage.setBackground(Color.decode("#DEC19B")); 
       gotologinpage.setBounds(700,410,70,15);
       gotologinpage.setBorder(null);
       gotologinpage.setFocusable(true);
       gotologinpage.addActionListener(this);
       gotologinpage.addMouseListener(new MouseAdapter(){
         
          public void mouseEntered(MouseEvent evt){
              
           gotologinpage.setBackground(Color.decode("#Ffdb58"));  
                
          }	
          public void mouseExited(MouseEvent evt){
              
              
             gotologinpage.setBackground(Color.decode("#DEC19B")); 
              
          }
            });
            NewpassPanel.add(gotologinpage);
	

  pback = new JButton("Back");
  pback.setFont(new Font("Roboto",Font.BOLD,30));
 // pback.setOpaque(true);
  pback.setForeground(Color.black);
  pback.setBackground(Color.white); 
  pback.setBounds(420,510,100,30);
  pback.setBorder(null);
  pback.setFocusable(true);
  pback.addActionListener(this);
  pback.addMouseListener(new MouseAdapter(){
  
   public void mouseEntered(MouseEvent evt){
 
  pback.setBackground(Color.decode("#00FF00"));  
   
}	
   public void mouseExited(MouseEvent evt){
 
 
  pback.setBackground(Color.white); 
 
}
});
NewpassPanel.add(pback);



   
        this.add(NewpassPanel);

    }

    public void actionPerformed(ActionEvent ae)
		{
			
      if(ae.getSource()==pback)
			{
        Forgpass ff= new Forgpass();
        ff.show();
				this.setVisible(false);
				ff.setVisible(true);}
        else if(ae.getSource()== changepass  )
        {
          LoginPage log = new LoginPage();
          log.show();
          this.setVisible(false);
          log.setVisible(true);
        
        

      

			 
			
        }
    
  }}