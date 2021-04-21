package project.front_end;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainForm
{
	JFrame fr;
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6;
	String username,password;
	MainForm()
	{
	fr=new JFrame("MAIN FORM");
	l1=new JLabel("STUDENT MANAGEMENT SYSTEM");
	b1=new JButton("STUDENT DETAILS");
	b2=new JButton("ADD A STUDENT DETAIL");
	b3=new JButton("UPDATE STUDENT DETAIL");
	b4=new JButton("DELETE STUDENT");
	b5=new JButton("ATTENDANCE ");
	b6=new JButton("EXIT");
	Container contentpane=fr.getContentPane();
	contentpane.setLayout(null);
	fr.setVisible(true);
	fr.setSize(600,500);
	l1.setBounds(160,40,200,80);
    b1.setBounds(60,130,200,40);
	b2.setBounds(300,130,200,40);
	b3.setBounds(60,220,200,40);
	b4.setBounds(300,220,200,40);
	b5.setBounds(60,310,200,40);
	b6.setBounds(300,310,200,40);
	contentpane.add(l1);
	contentpane.add(b1);
	contentpane.add(b2);
	contentpane.add(b3);
	contentpane.add(b4);
	contentpane.add(b5);
	contentpane.add(b6);
		b1.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new RetrivalStudentDetails();
			}
		}
		);  
			b2.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new StudentDetails();
			}
		}
		);  
		b3.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new UpdateStudentDetailsForm();
			}
		}
		);  
		b4.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new Deletestudent();
			}
		}
		);
		b5.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new AttendanceForm();
			}
		}
		);  
		b6.addActionListener(new ActionListener()
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
	new MainForm();
}
}	
	
	