import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class SetOTP extends JFrame implements ActionListener{
	
	JPanel CodePanel;
	 JLabel ImageLog ,cs,entcode, rscode;
	// JMenuBar mb1;
	// JMenu m1, m2, m3;
	JButton csub, sback, bresend;
	// JList list;
	// JComboBox c1;
	// JTextArea textArea;
    JTextField tencode;
	// File file, file2;

    public SetOTP(){


        super("Set OTP-বিদ্যাকোষ");
	this.setBounds(new Rectangle(00,00,800,600));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
        CodePanel = new JPanel();
	CodePanel.setBounds(0,0,800,600);
	CodePanel.setBackground(Color.black);
	CodePanel.setLayout(null);
 //   this.add(CodePanel);
 setIconImage(new ImageIcon("D:\\Final_Biddakosh\\logo.png").getImage());
	
	
	ImageIcon image = new ImageIcon("D:\\Final_Biddakosh\\LoginBiddakosh.png");
	ImageLog = new JLabel();
	ImageLog.setText(" ");  //set text of label
	ImageLog.setIcon(image);
	ImageLog.setOpaque(true);
	ImageLog.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	ImageLog.setForeground(Color.white);
	ImageLog.setBounds(0,0,400,600);
	CodePanel.add(ImageLog);
    
    cs= new JLabel("Code Send");
    cs.setFont(new Font("Cooper Black MS", Font.BOLD, 30));
    cs.setForeground(Color.WHITE);
    cs.setBounds(510,80,250,35);
    CodePanel.add(cs);

   entcode= new JLabel("Please Enter the Code");
   entcode.setFont(new Font("Cooper Black MS", Font.BOLD, 20));
   entcode.setForeground(Color.blue);
   entcode.setBounds(423,260,350,25);
    CodePanel.add(entcode);


    tencode = new JTextField();
    tencode.setBounds(420, 300,340,35);
    CodePanel.add(tencode);

    csub = new JButton("Submit");
    csub.setFont(new Font("Roboto",Font.BOLD,25));
  //  csub.setOpaque(true);
    csub.setForeground(Color.blue);
    csub.setBackground(Color.decode("#DEC19B")); 
    csub.setBounds(500,355,200,35);
    csub.setBorder(null);
    csub.setFocusable(true);
    csub.addActionListener(this);
    csub.addMouseListener(new MouseAdapter(){
     
      public void mouseEntered(MouseEvent evt){
          
        csub.setBackground(Color.decode("#Ffdb58"));  
            
      }	
      public void mouseExited(MouseEvent evt){
          
          
          csub.setBackground(Color.decode("#DEC19B")); 
          
      }
        });
        CodePanel.add(csub);

        rscode= new JLabel("Don't You Receive the Code?");
        rscode.setFont(new Font("Cooper Black MS", Font.BOLD, 14));
        rscode.setForeground(Color.WHITE);
        rscode.setBounds(440,410,250,15);
        CodePanel.add(rscode);

        bresend = new JButton("Resend Code");
       bresend.setFont(new Font("Roboto",Font.BOLD,14));
      // bresend.setOpaque(true);
       bresend.setForeground(Color.blue);
       bresend.setBackground(Color.decode("#DEC19B")); 
       bresend.setBounds(650,410,100,15);
       bresend.setBorder(null);
       bresend.setFocusable(true);
       bresend.addActionListener(this);
       bresend.addMouseListener(new MouseAdapter(){
         
          public void mouseEntered(MouseEvent evt){
              
           bresend.setBackground(Color.decode("#Ffdb58"));  
                
          }	
          public void mouseExited(MouseEvent evt){
              
              
             bresend.setBackground(Color.decode("#DEC19B")); 
              
          }
            });
            CodePanel.add(bresend);
	

  sback = new JButton("Back");
  sback.setFont(new Font("Roboto",Font.BOLD,30));
 // sback.setOpaque(true);
  sback.setForeground(Color.black);
  sback.setBackground(Color.white); 
  sback.setBounds(420,510,100,30);
  sback.setBorder(null);
  sback.setFocusable(true);
  sback.addActionListener(this);
  sback.addMouseListener(new MouseAdapter(){
  
   public void mouseEntered(MouseEvent evt){
 
  sback.setBackground(Color.decode("#00FF00"));  
   
}	
   public void mouseExited(MouseEvent evt){
 
 
  sback.setBackground(Color.white); 
 
}
});
CodePanel.add(sback);



   
        this.add(CodePanel);

    }
    
    public void actionPerformed(ActionEvent ae)
		{

      if(ae.getSource()==sback)
			{
        Forgpass ff= new Forgpass();
        ff.show();
				this.setVisible(false);
				ff.setVisible(true);
			
			}

      if(ae.getSource()==csub)
			{
        NewPass n = new NewPass();
        n.show();
				this.setVisible(false);
				n.setVisible(true);
			
			}
		
		
		
        }
    }