package project.front_end;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import project.backend.CRUDOperations;
public class RetrivalStudentDetails
{
	JFrame fr;
	JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
	JButton b1,b2;
	String username,password;
	public RetrivalStudentDetails()
	{
	fr=new JFrame("Student Details");
	l0=new JLabel("Student Details");
	l15=new JLabel("ENTER STUDENT ID");
	l1=new JLabel("Name");
	l2=new JLabel("Father'sName");
	l3=new JLabel("Mother'sName");
	l4=new JLabel("Phone");
	l5=new JLabel("Residence");
	l6=new JLabel("Student Id");
	l7=new JLabel("DOB");
	l8=new JLabel("EMAIL");
	l9=new JLabel("Percentage Obtained In Class 10th");
	l10=new JLabel("Percentage Obtained In Class 12th");
	l11=new JLabel("Percentage Obtained In Ist Year");
	l12=new JLabel("Percentage Obtained In IInd Year");
	l13=new JLabel("Percentage Obtained In IIIrd Year");
	l14=new JLabel("Percentage Obtained In IVth Year");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	t6=new JTextField();
	t7=new JTextField();
	t8=new JTextField();
    t9=new JTextField();
	t10=new JTextField();
	t11=new JTextField();
	t12=new JTextField();
	t13=new JTextField();
	t14=new JTextField();
	t15=new JTextField();
	b1=new JButton("RETRIVE");
	b2=new JButton("BACK");
	Container contentpane=fr.getContentPane();
	contentpane.setLayout(null);
	fr.setVisible(true);
	fr.setSize(750,750);
	l0.setBounds(120,10,120,30);
	l15.setBounds(40,50,120,30);
	t15.setBounds(400,50,120,30);
	l1.setBounds(40,90,120,30);
	t1.setBounds(400,90,120,30);
	l2.setBounds(40,130,120,30);
	t2.setBounds(400,130,120,30);
	l3.setBounds(40,170,120,30);
	t3.setBounds(400,170,120,30);
	l4.setBounds(40,210,120,30);
	t4.setBounds(400,210,120,30);
	l5.setBounds(40,250,120,30);
	t5.setBounds(400,250,120,30);
	l6.setBounds(40,290,120,30);
	t6.setBounds(400,290,120,30);
	l7.setBounds(40,330,120,30);
	t7.setBounds(400,330,120,30);
	l8.setBounds(40,370,120,30);
	t8.setBounds(400,370,120,30);
	l9.setBounds(40,410,220,30);
	t9.setBounds(400,410,120,30);
	l10.setBounds(40,450,220,30);
	t10.setBounds(400,450,120,30);
	l11.setBounds(40,490,220,30);
	t11.setBounds(400,490,120,30);
	l12.setBounds(40,530,220,30);
	t12.setBounds(400,530,120,30);
	l13.setBounds(40,570,220,30);
	t13.setBounds(400,570,120,30);
	l14.setBounds(40,620,220,30);
	t14.setBounds(400,620,120,30);
	b1.setBounds(300,670,120,30);
	b2.setBounds(500,670,120,30);
	contentpane.add(l0);
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
	contentpane.add(t7);
	contentpane.add(l8);
	contentpane.add(t8);
	contentpane.add(l9);
	contentpane.add(t9);
	contentpane.add(l10);
	contentpane.add(t10);
	contentpane.add(l11);
	contentpane.add(t11);
	contentpane.add(l12);
	contentpane.add(t12);
	contentpane.add(l13);
	contentpane.add(t13);
	contentpane.add(l14);
	contentpane.add(t14);
	contentpane.add(l15);
	contentpane.add(t15);
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
							String studid =t15.getText();
						CRUDOperations c=new CRUDOperations();
						c.retrivedet(name,fathersname,mothersname,phone,residence,DOB,email,studid,tenth,twelth,first,second,third,fourth,attendance);  
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
	public void retdet(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{
	t1.setText(name);
	t2.setText(fathersname);
	t3.setText(mothersname);
	t4.setText(phone);
	t5.setText(residence);
	t7.setText(DOB);
	t8.setText(email);
	t6.setText(studid);
	t9.setText(tenth);
	t10.setText(twelth);
	t11.setText(first);
	t12.setText(second);
	t13.setText(third);
	t14.setText(fourth);
	t15.setText(studid);
	}
	public static void main(String args[])
{
	new RetrivalStudentDetails();
	
}
}	