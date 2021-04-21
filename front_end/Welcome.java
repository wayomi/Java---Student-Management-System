package project.front_end;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Welcome
{
	JFrame fr;
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4,b5,b6;
	String username,password;
	public Welcome()
	{
	fr=new JFrame("WELCOME");
	l1=new JLabel("WELCOME TO STUDENT MANAGEMENT SYSTEM");
	Font f = new Font("Helvetica", Font.BOLD + Font.ITALIC, 20);
	l1.setFont(f);
	l2=new JLabel("Sushil Jain");
	Font f1 = new Font("Helvetica", Font.BOLD + Font.ITALIC, 15);
	l2.setFont(f1);
	l3=new JLabel("");
	b1=new JButton("CONTINUE");
	b2=new JButton("EXIT");
	Container contentpane=fr.getContentPane();
	contentpane.setLayout(null);
	fr.setVisible(true);
	fr.setSize(600,500);
	l1.setBounds(50,100,500,100);
	b1.setBounds(100,300,150,50);
	b2.setBounds(300,300,150,50);
	l2.setBounds(460,410,100,30);
	l3.setBounds(450,430,100,30);
	contentpane.add(l1);
	contentpane.add(b1);
	contentpane.add(b2);
	contentpane.add(l2);
	contentpane.add(l3);
		b1.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new LoginForm();
			}
		}
		);  
			b2.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				System.exit(0);
				fr.setVisible(false);
				
			}
		}
		);  
	}
public static void main(String args[])
{
	new Welcome();
}
}	