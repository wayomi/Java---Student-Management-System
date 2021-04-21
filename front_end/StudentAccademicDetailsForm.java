package project.front_end;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import project.backend.CRUDOperations;
public class StudentAccademicDetailsForm
{
	JFrame fr;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	JButton b1,b2;
	String username,password;
	StudentAccademicDetailsForm()
	{
	fr=new JFrame("STUDENT ACCADEMIC DETAILS");
	l8=new JLabel("ENTER STUDENT ID");
	l1=new JLabel("Percentage Obtained In Class 10th");
	l2=new JLabel("Percentage Obtained In Class 12th");
	l3=new JLabel("Percentage Obtained In Ist Year");
	l4=new JLabel("Percentage Obtained In IInd Year");
	l5=new JLabel("Percentage Obtained In IIIrd Year");
	l6=new JLabel("Percentage Obtained In IVth Year");
	l7=new JLabel("STUDENT ACCADEMIC DETAILS FORM");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	t6=new JTextField();
	t7=new JTextField();
	t8=new JTextField();
	t9=new JTextField();
	b2=new JButton("BACK");
	Container contentpane=fr.getContentPane();
	contentpane.setLayout(null);
	b1=new JButton("SUBMIT");
	fr.setLayout(null);
	fr.setVisible(true);
	fr.setSize(500,500);
	l7.setBounds(100,10,250,30);
	l8.setBounds(40,50,220,30);
	t8.setBounds(300,50,120,30);
	l1.setBounds(40,90,220,30);
	t1.setBounds(300,90,120,30);
	l2.setBounds(40,120,220,30);
	t2.setBounds(300,120,120,30);
	l3.setBounds(40,150,220,30);
	t3.setBounds(300,150,120,30);
	l4.setBounds(40,180,220,30);
	t4.setBounds(300,180,120,30);
	l5.setBounds(40,210,220,30);
	t5.setBounds(300,210,120,30);
	l6.setBounds(40,240,220,30);
	t6.setBounds(300,240,120,30);
	b1.setBounds(180,300,120,30);
	b2.setBounds(330,300,120,30);
	contentpane.add(l1);
	contentpane.add(t1);
	contentpane.add(l2);
	contentpane.add(t2);
	contentpane.add(l3);
	contentpane.add(t3);
	contentpane.add(l4);
	contentpane.add(t4);
	contentpane.add(l5);
	contentpane.add(t5);
	contentpane.add(l6);
	contentpane.add(t6);
	contentpane.add(l7);
	contentpane.add(b1);
	contentpane.add(b2);
	contentpane.add(t8);
	contentpane.add(l8);
	b1.addActionListener(new ActionListener()
		{  
				public void actionPerformed(ActionEvent ae)
				{ 
							String name=t9.getText();
							String fathersname=t9.getText();
							String mothersname=t9.getText();
							String phone=t9.getText();
							String residence=t9.getText();
							String DOB=t9.getText();
							String email=t9.getText();
							String tenth=t1.getText();
							String twelth=t2.getText();
							String first=t3.getText();
							String second=t4.getText();
							String third=t5.getText();
							String fourth=t6.getText();
							String attendance=t9.getText();
							String studid =t8.getText();
						CRUDOperations c=new CRUDOperations();
						c.add(name,fathersname,mothersname,phone,residence,DOB,email,studid,tenth,twelth,first,second,third,fourth,attendance);  
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
	}
public static void main(String args[])
{
	new StudentAccademicDetailsForm();
}
}	