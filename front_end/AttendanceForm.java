package project.front_end;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AttendanceForm
{
	JFrame fr;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1,b2,b3,b4,b5,b6,b7;
	String username,password;
	AttendanceForm()
	{
	fr=new JFrame("ATTENDENCE FORM");
	l8=new JLabel("Attendebce Form");
	b2=new JButton("Fill Attendence");
	b3=new JButton("Retrive Attendence");
	b7=new JButton("BACK");
	Container contentpane=fr.getContentPane();
	contentpane.setLayout(null);
	fr.setLayout(null);
	fr.setVisible(true);
	fr.setSize(500,500);
	b2.setBounds(100,80,300,30);
	b3.setBounds(100,120,300,30);
	b7.setBounds(100,300,120,30);
	contentpane.add(b2);
	contentpane.add(b3);
	contentpane.add(b7);
	contentpane.add(l8);
	b2.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new AddAttendence();
			}
		}
		);  
		b3.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new PersonalAttendancedetails();
			}
		}
		);  
		b7.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new MainForm();
			}
		}
		);
	}
public static void main(String args[])
{
	new AttendanceForm();
}
}	