import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Forgpass extends JFrame implements ActionListener{
	
	JPanel ForgpassPanel;
	 JLabel ImageLog ,Fp,eym;
	// JMenuBar mb1;
	// JMenu m1, m2, m3;
	JButton fsub, fback;
	// JList list;
	// JComboBox c1;
	// JTextArea textArea;
    JTextField entem;
	// File file, file2;

    public Forgpass(){


        super("Forget Password-বিদ্যাকোষ");
	this.setBounds(new Rectangle(00,00,800,600));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
        ForgpassPanel = new JPanel();
	ForgpassPanel.setBounds(0,0,800,600);
	ForgpassPanel.setBackground(Color.black);
	ForgpassPanel.setLayout(null);
 //   this.add(ForgpassPanel);
 setIconImage(new ImageIcon("D:\\Final_Biddakosh\\logo.png").getImage());
	
	
	ImageIcon image = new ImageIcon("D:\\Final_Biddakosh\\LoginBiddakosh.png");
	ImageLog = new JLabel();
	ImageLog.setText(" ");  //set text of label
	ImageLog.setIcon(image);
	ImageLog.setOpaque(true);
	ImageLog.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	ImageLog.setForeground(Color.white);
	ImageLog.setBounds(0,0,400,600);
	ForgpassPanel.add(ImageLog);
    
    Fp= new JLabel("Forget Password");
    Fp.setFont(new Font("Cooper Black MS", Font.BOLD, 30));
    Fp.setForeground(Color.WHITE);
    Fp.setBounds(470,100,250,35);
    ForgpassPanel.add(Fp);

   eym= new JLabel("Please Enter a Valid Email Address");
   eym.setFont(new Font("Cooper Black MS", Font.BOLD, 20));
   eym.setForeground(Color.blue);
   eym.setBounds(423,260,350,25);
    ForgpassPanel.add(eym);


    entem = new JTextField();
    entem.setBounds(420, 300,340,35);
    ForgpassPanel.add(entem);

    fsub = new JButton("Enter");
    fsub.setFont(new Font("Roboto",Font.BOLD,25));
  //  fsub.setOpaque(true);
    fsub.setForeground(Color.blue);
    fsub.setBackground(Color.decode("#DEC19B")); 
    fsub.setBounds(500,355,200,35);
    fsub.setBorder(null);
    fsub.setFocusable(true);
    fsub.addActionListener(this);
    fsub.addMouseListener(new MouseAdapter(){
     
      public void mouseEntered(MouseEvent evt){
          
        fsub.setBackground(Color.decode("#Ffdb58"));  
            
      }	
      public void mouseExited(MouseEvent evt){
          
          
          fsub.setBackground(Color.decode("#DEC19B")); 
          
      }
        });
        ForgpassPanel.add(fsub);
	

  fback = new JButton("Back");
  fback.setFont(new Font("Roboto",Font.BOLD,30));
 // fback.setOpaque(true);
  fback.setForeground(Color.black);
  fback.setBackground(Color.white); 
  fback.setBounds(420,510,100,30);
  fback.setBorder(null);
  fback.setFocusable(true);
  fback.addActionListener(this);
  fback.addMouseListener(new MouseAdapter(){
  
   public void mouseEntered(MouseEvent evt){
 
  fback.setBackground(Color.decode("#00FF00"));  
   
}	
   public void mouseExited(MouseEvent evt){
 
 
  fback.setBackground(Color.white); 
 
}
});
ForgpassPanel.add(fback);



   
        this.add(ForgpassPanel);

    }

    public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==fback)
			{
        LoginPage log = new LoginPage();
        log.show();
				this.setVisible(false);
				log.setVisible(true);

      }

      else if(ae.getSource()== fsub)
			{
        SetOTP s = new SetOTP();
        s.show();
				this.setVisible(false);
				s.setVisible(true);
			
      }
        }
    }