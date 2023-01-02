import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Main extends JFrame implements ActionListener{
	
	JPanel BackgroundPanel;
	 JLabel ImageBack, icon ;
	JButton ExitButton, LoginButton, RegisterButton, AvailableCourseButton;

    public Main(){


        super("Home Page-বিদ্যাকোষ");
	this.setBounds(new Rectangle(00,00,800,600));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);


  setIconImage(new ImageIcon("D:\\Final_Biddakosh\\logo.png").getImage());
  
        BackgroundPanel = new JPanel();
        BackgroundPanel.setBounds(0,0,800,600);
        BackgroundPanel.setBackground(Color.gray);
        BackgroundPanel.setLayout(null);
       // this.add(BackgroundPanel);
    

	
	ImageIcon image = new ImageIcon("D:\\Final_Biddakosh\\BiddakoshMain.png");
	ImageBack = new JLabel();
	ImageBack.setText(" ");  //set text of label
	ImageBack.setIcon(image);
	ImageBack.setOpaque(true);
	ImageBack.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
	ImageBack.setForeground(Color.white);
	ImageBack.setBounds(0,0,800,600);

	BackgroundPanel.add(ImageBack);

            AvailableCourseButton = new JButton("Available Courses");
            AvailableCourseButton.setFont(new Font("Roboto",Font.BOLD,25));
          //  AvailableCourseButton.setOpaque(true);
            AvailableCourseButton.setForeground(Color.black);
            AvailableCourseButton.setBackground(Color.decode("#DEC19B")); 
            AvailableCourseButton.setBounds(230,405,300,35);
            AvailableCourseButton.setBorder(null);
            AvailableCourseButton.setFocusable(true);
            AvailableCourseButton.addActionListener(this);
            AvailableCourseButton.addMouseListener(new MouseAdapter(){
     
                  public void mouseEntered(MouseEvent evt){
                      
                    AvailableCourseButton.setBackground(Color.decode("#9e2632"));  
                        
                  }	
                  public void mouseExited(MouseEvent evt){
                      
                      
                      AvailableCourseButton.setBackground(Color.decode("#DEC19B")); 
                      
                  }
                    });
                    BackgroundPanel.add(AvailableCourseButton);


      RegisterButton = new JButton("Register Now");
      RegisterButton.setFont(new Font("Roboto",Font.BOLD,25));
      RegisterButton.setOpaque(true);
      RegisterButton.setForeground(Color.black);
      RegisterButton.setBackground(Color.decode("#DEC19B")); 
      RegisterButton.setBounds(230,505,300,35);
      RegisterButton.setBorder(null);
      RegisterButton.setFocusable(true);
      RegisterButton.addActionListener(this);
      // RegisterButton.setVisible(true);
      RegisterButton.addMouseListener(new MouseAdapter(){
       

        public void mouseEntered(MouseEvent evt){
			
		  RegisterButton.setBackground(Color.decode("#9E2632"));

		}	
        public void mouseExited(MouseEvent evt){

			RegisterButton.setBackground(Color.decode("#DEC19B")); 
			
		}
    });
	    BackgroundPanel.add(RegisterButton);

        

      LoginButton = new JButton("Login");
      LoginButton.setFont(new Font("Roboto",Font.BOLD,25));
      LoginButton.setOpaque(true);
      LoginButton.setForeground(Color.black);
      LoginButton.setBackground(Color.decode("#DEC19B")); 
      LoginButton.setBounds(230,455,300,35);
      LoginButton.setBorder(null);
      LoginButton.setFocusable(true);
      LoginButton.addActionListener(this);
      LoginButton.addMouseListener(new MouseAdapter(){
       
        public void mouseEntered(MouseEvent evt){
			
		  LoginButton.setBackground(Color.decode("#9e2632"));  
			  
		}	
        public void mouseExited(MouseEvent evt){
			
			
			LoginButton.setBackground(Color.decode("#DEC19B")); 
			
		 }
    });

	     BackgroundPanel.add(LoginButton);

        this.add(BackgroundPanel);




    }

    public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==AvailableCourseButton)
			{
        Homepage h = new Homepage();
        h.show();
				this.setVisible(false);
				h.setVisible(true);
			
			}
			else if(ae.getSource()== RegisterButton)
			{
        RegiPage reg = new RegiPage();
        reg.show();
				this.setVisible(false);
				reg.setVisible(true);
			
			}

      else if(ae.getSource()== LoginButton)
			{
        LoginPage log = new LoginPage();
        log.show();
				this.setVisible(false);
				log.setVisible(true);
			
			}
			}
    }