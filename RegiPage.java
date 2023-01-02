
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import java.lang.*;
// import java.lang.RegiPage.*;
public class RegiPage extends JFrame implements ActionListener{
	
	JPanel RegPanel;
	 JLabel T1 ,Tsignup,F1,last, dob, cont, em, entpass, retypePass,ImageLogRe, cbox;
	// JMenuBar mb1;
	// JMenu m1, m2, m3;
	JButton BsignUp,BBack;
	// JList list;
	JCheckBox c1;
	// JTextArea textArea;
    JTextField Ft1,lastT, dobT, contT, emT;
    JPasswordField entpassT, retypePassT ;
	// File file, file2;

    public RegiPage(){


        super("Sign Up Page-বিদ্যাকোষ");
	this.setBounds(new Rectangle(00,00,800,600));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);

        RegPanel = new JPanel();
	RegPanel.setBounds(0,0,800,600);
	RegPanel.setBackground(Color.black);
	RegPanel.setLayout(null);
  this.add(RegPanel);
  setIconImage(new ImageIcon("D:\\Final_Biddakosh\\logo.png").getImage());

  ImageIcon image = new ImageIcon("D:\\Final_Biddakosh\\LoginBiddakosh.png");
	ImageLogRe = new JLabel();
	ImageLogRe.setText(" ");  //set text of label
	ImageLogRe.setIcon(image);
	ImageLogRe.setOpaque(true);
	ImageLogRe.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	ImageLogRe.setForeground(Color.white);
	ImageLogRe.setBounds(0,0,400,600);
	RegPanel.add(ImageLogRe);
    
	
	Tsignup= new JLabel("SignUP");
  Tsignup.setFont(new Font("Cooper Black MS",Font.BOLD,25));
  Tsignup.setOpaque(true);
  Tsignup.setForeground(Color.WHITE);
  Tsignup.setBackground(Color.BLACK);
  Tsignup.setBounds(550,30,200,45);
	RegPanel.add(Tsignup);

    // Ft1 = new JTextField();
    // Ft1.setBounds(560, 250,210,25);
    // RegPanel.add(Ft1);
    F1= new JLabel("First Name");
    F1.setFont(new Font("Cooper Black MS",Font.BOLD,16));
	F1.setOpaque(true);
	F1.setForeground(Color.WHITE);
	F1.setBackground(Color.BLACK);
	F1.setBounds(420,110,150,20);
	RegPanel.add(F1);

    Ft1 = new JTextField();
    Ft1.setBounds(560, 110,210,24);
    RegPanel.add(Ft1);

  last= new JLabel("Last Name");
  last.setFont(new Font("Cooper Black MS",Font.BOLD,16));
	last.setOpaque(true);
	last.setForeground(Color.WHITE);
	last.setBackground(Color.BLACK);
   last.setBounds(420,150,150,20);
	RegPanel.add(last);

    lastT = new JTextField();
    lastT.setBounds(560, 150,210,24);
    RegPanel.add(lastT);

     dob= new JLabel("Date of Birth");
     dob.setFont(new Font("Cooper Black MS",Font.BOLD,16));
       dob.setOpaque(true);
       dob.setForeground(Color.WHITE);
       dob.setBackground(Color.BLACK);
      dob.setBounds(420,190,150,20);
      RegPanel.add(dob);
  
      dobT = new JTextField();
       dobT.setBounds(560, 190,210,24);
      RegPanel.add( dobT);

      
  em= new JLabel("Email");
  em.setFont(new Font("Cooper Black MS",Font.BOLD,16));
	em.setOpaque(true);
	em.setForeground(Color.WHITE);
	em.setBackground(Color.BLACK);
   em.setBounds(420,230,150,20);
	RegPanel.add(em);

   emT = new JTextField();
    emT.setBounds(560, 230,210,24);
    RegPanel.add(emT);

    cont= new JLabel("Contact Number");
    cont.setFont(new Font("Cooper Black MS",Font.BOLD,16));
      cont.setOpaque(true);
      cont.setForeground(Color.WHITE);
      cont.setBackground(Color.BLACK);
     cont.setBounds(420,270,150,20);
      RegPanel.add(cont);
  
     contT = new JTextField();
      contT.setBounds(560, 270,210,24);
      RegPanel.add(contT);

      entpass= new JLabel("Password");
      entpass.setFont(new Font("Cooper Black MS",Font.BOLD,16));
        entpass.setOpaque(true);
        entpass.setForeground(Color.WHITE);
        entpass.setBackground(Color.BLACK);
       entpass.setBounds(420,310,150,20);
        RegPanel.add(entpass);
    
       entpassT = new JPasswordField();
        entpassT.setBounds(560, 310,210,24);
        RegPanel.add(entpassT);

        retypePass= new JLabel("Retype Password");
        retypePass.setFont(new Font("Cooper Black MS",Font.BOLD,16));
          retypePass.setOpaque(true);
          retypePass.setForeground(Color.WHITE);
          retypePass.setBackground(Color.BLACK);
         retypePass.setBounds(420,350,150,20);
          RegPanel.add(retypePass);
      
         retypePassT= new JPasswordField();
          retypePassT.setBounds(560, 350,210,24);
          RegPanel.add(retypePassT);

          c1= new JCheckBox();
          c1.setBackground(Color.black);
          c1.setForeground(Color.blue);
          c1.setBounds(420,380,20,20);
          RegPanel.add(c1);

          cbox = new JLabel("Above Provided All The Informations are Right");
          cbox.setFont(new Font("Cooper Black MS",Font.BOLD,14));
          cbox.setBackground(Color.BLACK);
          cbox.setForeground(Color.BLUE);
          cbox.setBounds(440,380,400,21);
          RegPanel.add(cbox);

          
   BsignUp = new JButton("SignUP");
   BsignUp.setFont(new Font("Roboto",Font.BOLD,25));
  // BsignUp.setOpaque(true);
   BsignUp.setForeground(Color.blue);
   BsignUp.setBackground(Color.decode("#DEC19B")); 
   BsignUp.setBounds(500,410,200,35);
   BsignUp.setBorder(null);
   BsignUp.setFocusable(true);
   BsignUp.addActionListener(this);
   BsignUp.addMouseListener(new MouseAdapter(){
     
      public void mouseEntered(MouseEvent evt){
          
       BsignUp.setBackground(Color.decode("#Ffdb58"));  
            
      }	
      public void mouseExited(MouseEvent evt){
          
          
         BsignUp.setBackground(Color.decode("#DEC19B")); 
          
      }
        });
        RegPanel.add(BsignUp);

      BBack = new JButton("Back");
       BBack.setFont(new Font("Roboto",Font.BOLD,30));
      // BBack.setOpaque(true);
       BBack.setForeground(Color.black);
       BBack.setBackground(Color.white); 
       BBack.setBounds(420,510,100,30);
       BBack.setBorder(null);
       BBack.setFocusable(true);
       BBack.addActionListener(this);
       BBack.addMouseListener(new MouseAdapter(){
       
        public void mouseEntered(MouseEvent evt){
			
		   BBack.setBackground(Color.decode("#00FF00"));  
			  
		}	
        public void mouseExited(MouseEvent evt){
			
			
			 BBack.setBackground(Color.white); 
			
		}
    });
	RegPanel.add(BBack);


   
   
        this.add(RegPanel);

    }

    public void actionPerformed(ActionEvent ae)
		{

    // if(ae.getSource()==    BsignUp)
			// {
      //   LoginPage log = new LoginPage();
      //   log.show();
			// 	this.setVisible(false);
			// 	log.setVisible(true);
        if(ae.getSource()==BsignUp)
        {
         // String fullName = fullName.getText();
            String fName = Ft1.getText();
            String lName = lastT.getText();
            String dob = dobT.getText();
            String userEmail = emT.getText();
            String contactnum =   cont.getText();
            String Password =  entpassT.getText();
            String RePassword = retypePassT.getText();

            if(fName.isEmpty() ||lName.isEmpty() ||  dob.isEmpty() || userEmail.isEmpty() || contactnum.isEmpty() || Password.isEmpty() || RePassword.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Fill your informations", "MISSING INFORMATION",JOptionPane.WARNING_MESSAGE);
            }
            else if(Password.equals(RePassword))
            {
                CreateUserAccount cua1 = new CreateUserAccount(fName, lName, dob, userEmail, contactnum, Password, Password, RePassword);
                cua1.addAccount();
                JOptionPane.showMessageDialog(this, "Account Added");
               Ft1.setText("");
               lastT.setText("");
                dobT.setText("");
                emT.setText("");
                cont.setText("");
                entpassT.setText("");
                retypePassT.setText("");
				
				this.setVisible(false);
				LoginPage log = new LoginPage();
				log.setVisible(true);
				
            }
            else{JOptionPane.showMessageDialog(this, "Check Password");}

            
        }
			
			

      if(ae.getSource()==    BBack)
			{
        LoginPage log = new LoginPage();
        log.show();
				this.setVisible(false);
				log.setVisible(true);
			
			}
			
    }
    
    }
  
    