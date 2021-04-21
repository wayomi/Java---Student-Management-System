package project.front_end;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class StudentDetails
{
	JFrame fr;
	JButton b1,b2,b3;
	StudentDetails()
	{
		fr= new JFrame("STUDENT DETAILS");
		b1= new JButton("STUDENT PERSONAL DETAILS");
		b2= new JButton("STUDENT ACCADEMIC DETAILS");
		b3= new JButton("BACK");
		Container contentpane= fr.getContentPane();
		contentpane.setLayout(null);
	b1.setBounds(100,80,300,30);
	b2.setBounds(100,120,300,30);
	b3.setBounds(100,160,300,30);
			fr.setVisible(true);
			fr.setSize(500,500);		
			fr.setLayout(null);
			contentpane.setVisible(true);
			contentpane.setSize(800,600);
			contentpane.add(b1);
			contentpane.add(b2);
			contentpane.add(b3);
	b1.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new StudentPersonalDetailsForm();
			}
		}
		);  
		b2.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new StudentAccademicDetailsForm();
			}
		}
		);	
		b3.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new MainForm();
			}
		}
		);		
	}
	public static void main(String st[])
	{
		 new StudentDetails();
	}
	
}
