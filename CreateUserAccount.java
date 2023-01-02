import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateUserAccount {
    private String fName;
    private String lName;
    private String fullName;
    private String dob;
    private String userEmail;

    private String contactnum;
    private String Password;
    private String RePassword;
    private File file;
    private FileWriter writer;
    private Scanner sc;

    //Empty Constructor
    public CreateUserAccount()
    {
        this.fullName="fName"+"lName";
    }

    public CreateUserAccount(String fName, String lName,String fullName,String dob,String userEmail,String contactnum,String Password, String RePassword)
    {
        this.fullName=fullName;
        this.fName=fName;
        this.lName=lName;
        this.dob= dob;
      //  this.userEmail=userEmail;
        this.userEmail=userEmail;
        this.contactnum =contactnum;
        this.Password=Password;
        this.RePassword=RePassword;
    }

    //setter & getter method
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public void setdob(String dob) {
        this.dob = dob;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public void setcontac(String contactnum) {
        this.contactnum = contactnum;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setRePassword(String RePassword) {
        this.RePassword = RePassword;
    }

    public String getfName() {
        return fName ;
    }

    public String getlName() {
        return lName ;
    }
    public String getFullName() {
        return fullName;
    }
   
    public String getdob() {
        return dob ;
    }
  
    public String getUserEmail() {
        return userEmail;
    }
    public String getcontac() {
        return contactnum;
    }
    public String Password() {
        return Password;
    }
    public String getRePassword() {
        return RePassword;
    }

    public void addAccount()
    {
        try
        {
            file = new File("Data/Users.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getUserEmail()+"\t");
            writer.write(Password()+"\t");
            writer.write(getdob()+"\t");
            writer.write(getFullName()+"\t");
            writer.write(getcontac()+"\n");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
	
	/* public void addTemp(string userName)
    {
		this.userName=userName;
        try
        {
            file = new File("Data/Temp.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getUserName()+"\t");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    } */

    public boolean getAccount(String userName,String userPassword)
    {
        boolean isAuthority = false;
        String path ="Data/Users.txt";
        file = new File(path);
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if(value[0].equals(userEmail) && value[1].equals(Password))
                {
                    isAuthority=true;
				try
				{
					file = new File("Data/Temp.txt");
					file.createNewFile();
					writer  = new FileWriter(file,true);
					writer.write(userEmail+"\t");
					writer.flush();
					writer.close();
					file.deleteOnExit();
				}
				catch(IOException ioe)
				{
					ioe.printStackTrace();
				}
                }
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return isAuthority;
    }
}
