package project.front_end;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import project.backend.CRUDOperations;
public class Updatedob
{
	JFrame fr;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2;
	Updatedob()
	{
	fr=new JFrame("UPDATE STUDENT D.O.B");
	l1=new JLabel("UPDATE STUDENT D.O.B");
	l2=new JLabel("ENTER STUDENT ID");
	l3=new JLabel("ENTER STUDENT D.O.B");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	b1=new JButton("SUBMIT");
	Container contentpane=fr.getContentPane();
	contentpane.setLayout(null);
	fr.setVisible(true);
	fr.setSize(600,500);
	l1.setBounds(180,40,250,50);
	l2.setBounds(40,90,220,30);
	t1.setBounds(300,90,100,30);
	l3.setBounds(40,120,220,30);
	t2.setBounds(300,120,100,30);
    b1.setBounds(180,200,120,30);
	b2=new JButton("BACK");
	b2.setBounds(300,200,120,30);
	contentpane.add(b2);
	contentpane.add(l1);
	contentpane.add(l2);
	contentpane.add(l3);
	contentpane.add(t1);
	contentpane.add(t2);
	contentpane.add(b1);
	b1.addActionListener(new ActionListener()
		{  
				public void actionPerformed(ActionEvent ae)
				{ 
							String name=t3.getText();
							String fathersname=t3.getText();
							String mothersname=t3.getText();
							String phone=t3.getText();
							String residence=t3.getText();
							String DOB=t2.getText();
							String email=t3.getText();
							String tenth=t3.getText();
							String twelth=t3.getText();
							String first=t3.getText();
							String second=t3.getText();
							String third=t3.getText();
							String fourth=t3.getText();
							String attendance=t3.getText();
							String studid =t1.getText();
						CRUDOperations c=new CRUDOperations();
						c.updateDOB(name,fathersname,mothersname,phone,residence,DOB,email,studid,tenth,twelth,first,second,third,fourth,attendance);  
						
				
				}
		}
	);
	b2.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				fr.setVisible(false);
				new UpdateStudentDetailsForm();
			}
		}
	);  
	}
	public static void main(String args[])
   {
	new Updatedob();
   }
   }