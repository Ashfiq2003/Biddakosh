import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class LoginPage extends JFrame implements ActionListener{

	
	JPanel LoginPanel;
	 JLabel ttl,ImageLog , LEmail,LPass,LNewRegister, Title;
   JPasswordField  loginPass;
	
	JButton BLogin, Bregister, ForgetPass, gback;
	
    JTextField loginEmail/*loginPass */ ;
	
     public LoginPage(){


      super("SignInPage-বিদ্যাকোষ");
	this.setBounds(new Rectangle(00,00,800,600));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
        LoginPanel = new JPanel();
	LoginPanel.setBounds(0,0,800,600);
	LoginPanel.setBackground(Color.black);
	LoginPanel.setLayout(null);
 //   this.add(LoginPanel);
 setIconImage(new ImageIcon("D:\\Final_Biddakosh\\logo.png").getImage());
	
	
	ImageIcon image = new ImageIcon("D:\\Final_Biddakosh\\LoginBiddakosh.png");
	ImageLog = new JLabel();
	ImageLog.setText(" ");  //set text of label
	ImageLog.setIcon(image);
	ImageLog.setOpaque(true);
	ImageLog.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	ImageLog.setForeground(Color.white);
	ImageLog.setBounds(0,0,400,600);
	LoginPanel.add(ImageLog);
    
    Title= new JLabel("বিদ্যাকোষ");
    Title.setFont(new Font("Cooper Black MS", Font.BOLD, 50));
    Title.setForeground(Color.WHITE);
    Title.setBounds(500,70,200,55);
    LoginPanel.add(Title);

    ttl= new JLabel("LOGIN");
    ttl.setFont(new Font("Cooper Black MS", Font.BOLD, 30));
    ttl.setForeground(Color.blue);
    ttl.setBounds(550,130,200,45);
    LoginPanel.add(ttl);

    LEmail= new JLabel("Email");
    LEmail.setFont(new Font("Cooper Black MS",Font.BOLD,25));
	 LEmail.setOpaque(true);
	LEmail.setForeground(Color.WHITE);
	LEmail.setBackground(Color.BLACK);
	LEmail.setBounds(420,250,150,25);
	LoginPanel.add(LEmail);

    loginEmail = new JTextField();
    loginEmail.setBounds(560, 250,210,25);
    LoginPanel.add(loginEmail);

   LPass= new JLabel("Password");
   LPass.setFont(new Font("Cooper Black MS",Font.BOLD,25));
	LPass.setOpaque(true);
	LPass.setForeground(Color.WHITE);
	LPass.setBackground(Color.BLACK);
    LPass.setBounds(420,300,150,25);
	LoginPanel.add(LPass);

    loginPass = new JPasswordField();
    loginPass.setBounds(560, 300,210,25);
    LoginPanel.add(loginPass);


    BLogin = new JButton("Login");
    BLogin.setFont(new Font("Roboto",Font.BOLD,25));
  //  BLogin.setOpaque(true);
    BLogin.setForeground(Color.blue);
    BLogin.setBackground(Color.decode("#DEC19B")); 
    BLogin.setBounds(500,355,200,35);
    BLogin.setBorder(null);
    BLogin.setFocusable(true);
    BLogin.addActionListener(this);
    BLogin.addMouseListener(new MouseAdapter(){
     
      public void mouseEntered(MouseEvent evt){
          
        BLogin.setBackground(Color.decode("#Ffdb58"));  
            
      }	
      public void mouseExited(MouseEvent evt){
          
          
          BLogin.setBackground(Color.decode("#DEC19B")); 
          
      }
        });
        LoginPanel.add(BLogin);
	
        
	LNewRegister = new JLabel("or");                              
	//LNewRegister.setText(" Contact Us: 420  ");                       
  LNewRegister.setFont(new Font("Cooper Black MS",Font.BOLD,19));
	LNewRegister.setOpaque(true);                                     
	LNewRegister.setForeground(Color.white);
	LNewRegister.setBackground(Color.black);          
	LNewRegister.setBounds(590,430,200,19);
	LoginPanel.add(LNewRegister);


    
      Bregister = new JButton("Create a New Account");
      Bregister.setFont(new Font("Roboto",Font.BOLD,17));
      Bregister.setOpaque(true);
      Bregister.setForeground(Color.blue);
      Bregister.setBackground(Color.black); 
      Bregister.setBounds(500,455,200,17);
      Bregister.setBorder(null);
      Bregister.setFocusable(true);
      Bregister.addActionListener(this);
      Bregister.addMouseListener(new MouseAdapter(){
       
        public void mouseEntered(MouseEvent evt){
			
		  Bregister.setBackground(Color.decode("#00FF00"));  
			  
		}	
        public void mouseExited(MouseEvent evt){
			
			
			Bregister.setBackground(Color.black); 
			
		}
    });
	LoginPanel.add(Bregister);

      ForgetPass = new JButton("Forgotten Password?");
       ForgetPass.setFont(new Font("Roboto",Font.BOLD,17));
      // ForgetPass.setOpaque(true);
       ForgetPass.setForeground(Color.blue);
       ForgetPass.setBackground(Color.black); 
       ForgetPass.setBounds(500,410,200,17);
       ForgetPass.setBorder(null);
       ForgetPass.setFocusable(true);
       ForgetPass.addActionListener(this);
       ForgetPass.addMouseListener(new MouseAdapter(){
       
        public void mouseEntered(MouseEvent evt){
			
		   ForgetPass.setBackground(Color.decode("#00FF00"));  
			  
		}	
        public void mouseExited(MouseEvent evt){
			
			
			 ForgetPass.setBackground(Color.black); 
			
		}
    });
	LoginPanel.add(ForgetPass);


  gback = new JButton("HomePage");
  gback.setFont(new Font("Roboto",Font.BOLD,30));
 // gback.setOpaque(true);
  gback.setForeground(Color.black);
  gback.setBackground(Color.white); 
  gback.setBounds(520,510,160,30);
  gback.setBorder(null);
  gback.setFocusable(true);
  gback.addActionListener(this);
  gback.addMouseListener(new MouseAdapter(){

   public void mouseEntered(MouseEvent evt){
 
  gback.setBackground(Color.decode("#00FF00"));  
   
}	
   public void mouseExited(MouseEvent evt){
 
 
  gback.setBackground(Color.white); 
 
}
});
LoginPanel.add(gback);



   
        this.add(LoginPanel);

    }

    public void actionPerformed(ActionEvent ae)
		{

      if(ae.getSource()==BLogin)
        {

          String userEmail = LEmail.getText();
          String Password = loginPass.getText();

          CreateUserAccount cua1 = new CreateUserAccount();
          new Homepage();
         
        

          if(cua1.getAccount(userEmail, Password)){
            JOptionPane.showMessageDialog(this,"Login Successful");
          
            Homepage h2 = new Homepage();
            h2.show();
            //s1.addService(userName);
            this.setVisible(false);
            h2.setVisible(true);
            
          }
          else{JOptionPane.showMessageDialog(this, "Invalid UserName/Password", "INVALID", JOptionPane.WARNING_MESSAGE);}
        }
        
        

			else if(ae.getSource()==gback)
		
			{
        Main g1 = new Main();
        g1.show();
				this.setVisible(false);
				g1.setVisible(true);
			
			}
      
        else if(ae.getSource()== ForgetPass)
        {
          Forgpass ff = new  Forgpass();
          ff.show();
          this.setVisible(false);
          ff.setVisible(true);
        
        }
       
        
       

        else if(ae.getSource()==Bregister)
        {
          RegiPage reg = new RegiPage();
          reg.show();
          this.setVisible(false);
          reg.setVisible(true);
        

        }
      }}
        
			