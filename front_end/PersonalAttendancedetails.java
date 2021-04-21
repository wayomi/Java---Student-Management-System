package project.front_end;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import project.backend.CRUDOperations;
public class PersonalAttendancedetails
{
	JFrame fr;
	JLabel l1,l2,l3;
	JTextField t2,t3,t1;
	JButton b1,b2;
	public PersonalAttendancedetails()
	{
	fr=new JFrame("Attendance details");
	l1=new JLabel("Retrival Of Attendance");
	l2=new JLabel("STUDENT ID");
	t2=new JTextField();
	l3=new JLabel("Attendence");
	t3=new JTextField();
	t1=new JTextField();
	b1=new JButton("RETRIVE");
	b2=new JButton("BACK");
	Container contentpane=fr.getContentPane();
	contentpane.setLayout(null);
	fr.setVisible(true);
	fr.setSize(600,500);
	l1.setBounds(180,40,250,50);
	l2.setBounds(40,120,220,30);
	t2.setBounds(300,120,100,30);
    l3.setBounds(40,170,220,30);
	t3.setBounds(300,170,100,30);
    b1.setBounds(150,220,120,30);
	b2.setBounds(330,220,120,30);
	contentpane.add(l1);
	contentpane.add(l2);
	contentpane.add(l3);
	contentpane.add(t2);
	contentpane.add(t3);
	contentpane.add(b1);
	contentpane.add(b2);
	b1.addActionListener(new ActionListener()
		{  
				public void actionPerformed(ActionEvent ae)
				{ 
							String name=t1.getText();
							String fathersname=t1.getText();
							String mothersname=t1.getText();
							String phone=t1.getText();
							String residence=t1.getText();
							String DOB=t1.getText();
							String email=t1.getText();
							String tenth=t1.getText();
							String twelth=t1.getText();
							String first=t1.getText();
							String second=t1.getText();
							String third=t1.getText();
							String fourth=t1.getText();
							String attendance=t1.getText();
							String studid =t2.getText();
						CRUDOperations c=new CRUDOperations();
						c.retriveatt(name,fathersname,mothersname,phone,residence,DOB,email,studid,tenth,twelth,first,second,third,fourth,attendance);  
						fr.setVisible(false);
				}
		}
	);
	b2.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new MainForm();
			}
		}
		);  
	}
	public void setatt(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{
	t1.setText(name);
	t1.setText(fathersname);
	t1.setText(mothersname);
	t1.setText(phone);
	t1.setText(residence);
	t1.setText(DOB);
	t1.setText(email);
	t2.setText(studid);
	t1.setText(tenth);
	t1.setText(twelth);
	t1.setText(first);
	t1.setText(second);
	t1.setText(third);
	t1.setText(fourth);
	t3.setText(attendance);
	}
	public static void main(String args[])
   {
	new PersonalAttendancedetails();
   }
   }