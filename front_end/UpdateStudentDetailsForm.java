package project.front_end;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UpdateStudentDetailsForm
{
	JFrame fr;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1,b2,b3,b4,b5,b6,b7;
	String username,password;
	UpdateStudentDetailsForm()
	{
	fr=new JFrame("STUDENT UPDATE DETAILS FORM");
	l8=new JLabel("STUDENT UPDATE DETAILS FORM");
	b2=new JButton("UPDATE STUDENT NAME");
	b3=new JButton("UPDATE STUDENT PHONE_NO");
	b4=new JButton("UPDATE STUDENT EMAIL");
	b5=new JButton("UPDATE STUDENT D.O.B");
	b6=new JButton("UPDATE STUDENT RESIDENCE");
	b7=new JButton("BACK");
	Container contentpane=fr.getContentPane();
	contentpane.setLayout(null);
	fr.setLayout(null);
	fr.setVisible(true);
	fr.setSize(500,500);
	b2.setBounds(100,80,300,30);
	b3.setBounds(100,120,300,30);
	b4.setBounds(100,160,300,30);
	b5.setBounds(100,200,300,30);
	b6.setBounds(100,240,300,30);
	b7.setBounds(100,300,120,30);
	contentpane.add(b2);
	contentpane.add(b3);
	contentpane.add(b4);
	contentpane.add(b5);
	contentpane.add(b6);
	contentpane.add(b7);
	contentpane.add(l8);
	b2.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new Updatename();
			}
		}
		);  
	b3.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new Updatephone();
			}
		}
		);  
	b4.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new Updateemail();
			}
		}
		);  
		b5.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new Updatedob();
			}
		}
		);
	b6.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new Updateresidence();
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
	new UpdateStudentDetailsForm();
}
}	