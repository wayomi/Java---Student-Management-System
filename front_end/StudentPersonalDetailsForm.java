package project.front_end;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import project.backend.CRUDOperations;
public class StudentPersonalDetailsForm
{
	JFrame fr;
	JLabel l1,l2,l3,l4,l5,l7,l8,l9;
	JTextField t1,t2,t3,t4,t5,t7,t9,t10;
	JButton b1,b2;
	String username,password;
	StudentPersonalDetailsForm()
	{
	fr=new JFrame("STUNDENT PERSONAL DETAILS ");
	l1=new JLabel("Name");
	l2=new JLabel("Father'sName");
	l3=new JLabel("Mother'sName");
	l4=new JLabel("Phone");
	l5=new JLabel("Residence");
	l7=new JLabel("DOB");
	l9=new JLabel("EMAIL");
	l8=new JLabel("STUDENT PERSONAL DETAILS FORM");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	t7=new JTextField();
	t9=new JTextField();
	t10=new JTextField();
	b1=new JButton("SUBMIT");
	b2=new JButton("back");
	Container contentpane=fr.getContentPane();
	contentpane.setLayout(null);
	fr.setVisible(true);
	fr.setSize(500,500);
	l1.setBounds(40,90,70,30);
	t1.setBounds(140,90,150,30);
	l2.setBounds(40,120,100,30);
	t2.setBounds(140,120,150,30);
	l3.setBounds(40,150,100,30);
	t3.setBounds(140,150,150,30);
	l4.setBounds(40,180,70,30);
	t4.setBounds(140,180,150,30);
	l5.setBounds(40,210,70,30);
	t5.setBounds(140,210,150,30);
	l7.setBounds(40,240,70,30);
	t7.setBounds(140,240,150,30);
	l9.setBounds(40,270,70,30);
	t9.setBounds(140,270,150,30);
	l8.setBounds(100,40,250,30);
	b1.setBounds(160,360,120,30);
	b2.setBounds(310,360,120,30);
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
	contentpane.add(l7);
	contentpane.add(t7);
	contentpane.add(l9);
	contentpane.add(t9);
	contentpane.add(l8);
	contentpane.add(b1);
	contentpane.add(b2);
	b1.addActionListener(new ActionListener()
		{  
				public String studid()                  //account generator code        
				{
					int num= (int)System.currentTimeMillis();
					String studid= "S"+num;
					return studid;
				}
				public void actionPerformed(ActionEvent ae)
				{ 
					JDialog dg1;
					JLabel msg1,msg2;
					String studid =studid();
					dg1=new JDialog(new Frame());
					msg1=new JLabel("SUCCESSFUL STUDENT ID CREATION ");
					msg2=new JLabel("YOUR STUDENT ID IS  " +studid );
					dg1.setSize(300,300);
					dg1.setVisible(true);
					msg1.setBounds(40,60,200,30);
					msg2.setBounds(80,180,200,30);
					dg1.add(msg1);
					dg1.add(msg2);
							String name=t1.getText();
							String fathersname=t2.getText();
							String mothersname=t3.getText();
							String phone=t4.getText();
							String residence=t5.getText();
							String DOB=t7.getText();
							String email=t9.getText();
							String tenth=t10.getText();
							String twelth=t10.getText();
							String first=t10.getText();
							String second=t10.getText();
							String third=t10.getText();
							String fourth=t10.getText();
							String attendance=t10.getText();
						CRUDOperations c=new CRUDOperations();
						c.insert(name,fathersname,mothersname,phone,residence,DOB,email,studid,tenth,twelth,first,second,third,fourth,attendance);  
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
	new StudentPersonalDetailsForm();
	
}
}	