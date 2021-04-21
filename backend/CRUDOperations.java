package project.backend;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import project.front_end.*;
public class CRUDOperations
{
	String username,password;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	boolean validationstatus;
	// method to check validation of the worker
	public boolean validate(String username,String password)
	{
		try
		{
			con=new ConnectionManager().makeConnection();
			String query="select * from Users where username=? and password=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			rs=pstmt.executeQuery();
			if(rs.next()==false)
			{
					validationstatus=false;
			}
			//user exists
			else
			{
				validationstatus=true;	
			}
		}catch(SQLException sqle){System.out.println(sqle);}
		return validationstatus;
	}
	// method to insert values into table student details   
	public void insert(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
		try
		{
			con=new ConnectionManager().makeConnection();
			String query="insert into studentdetails values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,name);
			pstmt.setString(2,fathersname);
			pstmt.setString(3,mothersname);
			pstmt.setString(4,phone);
			pstmt.setString(5,residence);
			pstmt.setString(6,DOB);
			pstmt.setString(7,email);
			pstmt.setString(8,studid);
			pstmt.setString(9,tenth);
			pstmt.setString(10,twelth);
			pstmt.setString(11,first);
			pstmt.setString(12,second);
			pstmt.setString(13,third);
			pstmt.setString(14,fourth);
			pstmt.setString(15,attendance);
			int i=pstmt.executeUpdate();
			}catch(SQLException sqle){System.out.println(sqle);}
	}
	public void add(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
		try
		{
			con=new ConnectionManager().makeConnection();
			String query1="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query1);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
			//username and password  does not exist
			if(rs.next()==false)
			{
			JDialog dg;
				JLabel msg;
				dg=new JDialog(new JFrame());
				msg=new JLabel("studid Does Not exist");
				dg.setSize(200,200);
				dg.setVisible(true);
				msg.setBounds(30,60,100,30);
				dg.add(msg);
				}
			//user exists
			else
			{
			con=new ConnectionManager().makeConnection();
			String query="update studentdetails set tenth=?,twelth=?,first=?,second=?,third=?,fourth=? where studid=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,tenth);
			pstmt.setString(2,twelth);
			pstmt.setString(3,first);
			pstmt.setString(4,second);
			pstmt.setString(5,third);
			pstmt.setString(6,fourth);
			pstmt.setString(7,studid);
			int i=pstmt.executeUpdate();
			JDialog dg1;
					JLabel msg1;
					dg1=new JDialog(new Frame());
					msg1=new JLabel("Accademic details Added Successfully");
					dg1.setSize(300,300);
					dg1.setVisible(true);
					msg1.setBounds(40,60,200,30);
					dg1.add(msg1);
			}
		}catch(SQLException sqle){System.out.println(sqle);}
	}
		public void addatt(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
			try
		{
			con=new ConnectionManager().makeConnection();
			String query1="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query1);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
			if(rs.next()==false)
			{
				JDialog dg;
				JLabel msg;
				dg=new JDialog(new JFrame());
				msg=new JLabel("studid Does Not exist");
				dg.setSize(200,200);
				dg.setVisible(true);
				msg.setBounds(30,60,100,30);
				dg.add(msg);
			}
			else
			{
			con=new ConnectionManager().makeConnection();
			String query="update studentdetails set attendance=? where studid=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,attendance);
			pstmt.setString(2,studid);
			int i=pstmt.executeUpdate();
					JDialog dg1;
					JLabel msg1;
					dg1=new JDialog(new Frame());
					msg1=new JLabel("attendance details Added Successfully");
					dg1.setSize(300,300);
					dg1.setVisible(true);
					msg1.setBounds(40,60,200,30);
					dg1.add(msg1);
			}
		}catch(SQLException sqle){System.out.println(sqle);}
	}
	public void updateDOB(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
		try
		{
			con=new ConnectionManager().makeConnection();
			String query1="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query1);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
			if(rs.next()==false)
			{
				JDialog dg;
				JLabel msg;
				dg=new JDialog(new JFrame());
				msg=new JLabel("studid Does Not exist");
				dg.setSize(200,200);
				dg.setVisible(true);
				msg.setBounds(30,60,100,30);
				dg.add(msg);
			}
			else
			{
			con=new ConnectionManager().makeConnection();
			String query="update studentdetails set DOB=? where studid=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,DOB);
			pstmt.setString(2,studid);
			int i=pstmt.executeUpdate();
			JDialog dg1;
					JLabel msg1;
					dg1=new JDialog(new Frame());
					msg1=new JLabel("DOB updated Successfully");
					dg1.setSize(300,300);
					dg1.setVisible(true);
					msg1.setBounds(40,60,200,30);
					dg1.add(msg1);
			}
		}catch(SQLException sqle){System.out.println(sqle);}
	}
	public void updatephone(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
	try
		{		con=new ConnectionManager().makeConnection();
			String query1="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query1);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
			if(rs.next()==false)
			{
				JDialog dg;
				JLabel msg;
				dg=new JDialog(new JFrame());
				msg=new JLabel("studid Does Not exist");
				dg.setSize(200,200);
				dg.setVisible(true);
				msg.setBounds(30,60,100,30);
				dg.add(msg);
			}
			else
			{
			con=new ConnectionManager().makeConnection();
			String query="update studentdetails set phone=? where studid=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,phone);
			pstmt.setString(2,studid);
			int i=pstmt.executeUpdate();
			JDialog dg1;
					JLabel msg1;
					dg1=new JDialog(new Frame());
					msg1=new JLabel("PHONE NUMBER updated Successfully");
					dg1.setSize(300,300);
					dg1.setVisible(true);
					msg1.setBounds(40,60,200,30);
					dg1.add(msg1);
			}
		}catch(SQLException sqle){System.out.println(sqle);}
	}
	public void updateemail(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
		try
		{
			con=new ConnectionManager().makeConnection();
			String query1="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query1);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
			if(rs.next()==false)
			{
				JDialog dg;
				JLabel msg;
				dg=new JDialog(new JFrame());
				msg=new JLabel("studid Does Not exist");
				dg.setSize(200,200);
				dg.setVisible(true);
				msg.setBounds(30,60,100,30);
				dg.add(msg);
			}
			else
			{
			con=new ConnectionManager().makeConnection();
			String query="update studentdetails set email=? where studid=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,email);
			pstmt.setString(2,studid);
			int i=pstmt.executeUpdate();
			JDialog dg1;
					JLabel msg1;
					dg1=new JDialog(new Frame());
					msg1=new JLabel("E-MAIL updated Successfully");
					dg1.setSize(300,300);
					dg1.setVisible(true);
					msg1.setBounds(40,60,200,30);
					dg1.add(msg1);
			}
		}catch(SQLException sqle){System.out.println(sqle);}
	}
	public void updatename(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
	try
		{
			con=new ConnectionManager().makeConnection();
			String query1="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query1);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
			if(rs.next()==false)
			{
				JDialog dg;
				JLabel msg;
				dg=new JDialog(new JFrame());
				msg=new JLabel("studid Does Not exist");
				dg.setSize(200,200);
				dg.setVisible(true);
				msg.setBounds(30,60,100,30);
				dg.add(msg);
			}
			else
			{
			con=new ConnectionManager().makeConnection();
			String query="update studentdetails set name=? where studid=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,name);
			pstmt.setString(2,studid);
			int i=pstmt.executeUpdate();
			JDialog dg1;
					JLabel msg1;
					dg1=new JDialog(new Frame());
					msg1=new JLabel("NAME updated Successfully");
					dg1.setSize(300,300);
					dg1.setVisible(true);
					msg1.setBounds(40,60,200,30);
					dg1.add(msg1);
			}
		}catch(SQLException sqle){System.out.println(sqle);}
	}
	public void updateresidence(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
		try
		{
			con=new ConnectionManager().makeConnection();
			String query1="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query1);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
			if(rs.next()==false)
			{
				JDialog dg;
				JLabel msg;
				dg=new JDialog(new JFrame());
				msg=new JLabel("studid Does Not exist");
				dg.setSize(200,200);
				dg.setVisible(true);
				msg.setBounds(30,60,100,30);
				dg.add(msg);
			}
			else
			{
			con=new ConnectionManager().makeConnection();
			String query="update studentdetails set residence=? where studid=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,residence);
			pstmt.setString(2,studid);
			int i=pstmt.executeUpdate();
			JDialog dg1;
					JLabel msg1;
					dg1=new JDialog(new Frame());
					msg1=new JLabel("RESIDENCE updated Successfully");
					dg1.setSize(300,300);
					dg1.setVisible(true);
					msg1.setBounds(40,60,200,30);
					dg1.add(msg1);
			}
		}catch(SQLException sqle){System.out.println(sqle);}
	}
	public void deletestudent(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
		try
		{
			con=new ConnectionManager().makeConnection();
			String query1="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query1);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
			if(rs.next()==false)
			{
				JDialog dg;
				JLabel msg;
				dg=new JDialog(new JFrame());
				msg=new JLabel("studid Does Not exist");
				dg.setSize(200,200);
				dg.setVisible(true);
				msg.setBounds(30,60,100,30);
				dg.add(msg);
			}
			else
			{
			con=new ConnectionManager().makeConnection();
			String query="delete from studentdetails where studid=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,studid);
			int i=pstmt.executeUpdate();
			JDialog dg1;
					JLabel msg1;
					dg1=new JDialog(new Frame());
					msg1=new JLabel("Student Deleted Successfully");
					dg1.setSize(300,300);
					dg1.setVisible(true);
					msg1.setBounds(40,60,200,30);
					dg1.add(msg1);
			}
		}catch(SQLException sqle){System.out.println(sqle);}
	}
public void retriveatt(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
		try
		{
			con=new ConnectionManager().makeConnection();
			String query1="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query1);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
			if(rs.next()==false)
			{
				final JDialog dg;
				JLabel msg;
				JButton b1;
				b1=new JButton("studid Does Not exist /nclick here to return ");
				dg=new JDialog(new JFrame());
				msg=new JLabel("studid Does Not exist");
				dg.setSize(400,200);
				dg.setVisible(true);
				msg.setBounds(30,60,100,30);
				b1.setBounds(40,100,50,50);
				dg.add(msg);
				dg.add(b1);
				b1.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				dg.setVisible(false);
				new PersonalAttendancedetails();
			}
		}
		);  
			}
			else
			{
			con=new ConnectionManager().makeConnection();
			String query="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
					while(rs.next())
				{
					name=rs.getString(1);
					fathersname=rs.getString(2);
					mothersname=rs.getString(3);
					phone=rs.getString(4);
					residence=rs.getString(5);
					DOB=rs.getString(6);
					email=rs.getString(7);
					studid=rs.getString(8);
					tenth=rs.getString(9);
					twelth=rs.getString(10);
					first=rs.getString(11);
					second=rs.getString(12);
					third=rs.getString(13);
					fourth=rs.getString(14);
					attendance=rs.getString(15);
					}
	PersonalAttendancedetails p=new PersonalAttendancedetails();
			p.setatt(name,fathersname,mothersname,phone,residence,DOB,email,studid,tenth,twelth,first,second,third,fourth,attendance);
			}
		}catch(SQLException sqle){System.out.println(sqle);}
	}
public void retrivedet(String name,String fathersname,String mothersname,String phone,String residence,String DOB,String email,String studid,String tenth,String twelth,String first,String second,String third,String fourth,String attendance)
	{	
		try
		{
			con=new ConnectionManager().makeConnection();
			String query1="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query1);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
			if(rs.next()==false)
			{
				final JDialog dg;
				JLabel msg;
				JButton b1;
				b1=new JButton("studid Does Not exist /nclick here to return ");
				dg=new JDialog(new JFrame());
				msg=new JLabel("studid Does Not exist");
				dg.setSize(400,200);
				dg.setVisible(true);
				msg.setBounds(30,60,100,30);
				b1.setBounds(40,100,50,50);
				dg.add(msg);
				dg.add(b1);
				b1.addActionListener(new ActionListener()
		{                 
			public void actionPerformed(ActionEvent ae)
			{ 
				dg.setVisible(false);
				new RetrivalStudentDetails();
			}
		}
		);  
			}
			else
			{
			con=new ConnectionManager().makeConnection();
			String query="select * from studentdetails where studid=? ";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,studid);
			rs=pstmt.executeQuery();
					while(rs.next())
				{
				name=rs.getString(1);
					fathersname=rs.getString(2);
					mothersname=rs.getString(3);
					phone=rs.getString(4);
					residence=rs.getString(5);
					DOB=rs.getString(6);
					email=rs.getString(7);
					studid=rs.getString(8);
					tenth=rs.getString(9);
					twelth=rs.getString(10);
					first=rs.getString(11);
					second=rs.getString(12);
					third=rs.getString(13);
					fourth=rs.getString(14);
					attendance=rs.getString(15);
					}
			RetrivalStudentDetails r=new RetrivalStudentDetails();
			r.retdet(name,fathersname,mothersname,phone,residence,DOB,email,studid,tenth,twelth,first,second,third,fourth,attendance);
			}
		}catch(SQLException sqle){System.out.println(sqle);}
	}
}