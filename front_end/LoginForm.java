package project.front_end;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import project.backend.CRUDOperations;
public class LoginForm
{
	
	JFrame fr;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1;
	boolean loginstatus;
	String username,password;
	public LoginForm()                // login form constructor
	{
	//initialisations
	fr=new JFrame("Login Form");
	l1=new JLabel("user name");
	l2=new JLabel("password");
	t1=new JTextField();
	t2=new JPasswordField();
	b1=new JButton("SUBMIT");
	Container contentpane=fr.getContentPane();
	contentpane.setLayout(null);
	fr.setVisible(true);
	fr.setSize(300,300);
	l1.setBounds(20,50,80,30);
	t1.setBounds(130,50,100,30);
	l2.setBounds(20,100,70,30);
	t2.setBounds(130,100,100,30);
	b1.setBounds(100,150,100,30);
	contentpane.add(l1);
	contentpane.add(t1);
	contentpane.add(l2);
	contentpane.add(t2);
	contentpane.add(b1);
	b1.addActionListener(new ActionListener()               //anonymous class
	{                 
		public void actionPerformed(ActionEvent ae)
		{
			//get the user login details
				String username=t1.getText();
				String password=t2.getText();
			CRUDOperations c=new CRUDOperations();
			loginstatus=c.validate(username,password);
			//user does not exist
			if(loginstatus==false)
			{
				JDialog dg1;
				JLabel msg1;
				dg1=new JDialog(new Frame());
				msg1=new JLabel("LOGIN UNSUCCESSFUL");
				dg1.setSize(200,200);
				dg1.setVisible(true);
				msg1.setBounds(30,60,100,30);
				dg1.add(msg1);
			}
			//user exist
			else{
			
						fr.setVisible(false);
						new MainForm();
		}		
		}
	}	
	);
} 
}	
	
	