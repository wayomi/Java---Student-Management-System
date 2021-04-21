/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.io.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.view.*;

public class MyiReportViewer extends JFrame///////////////////////////////////
{

public MyiReportViewer(String fileName)/////////////////////////////////
{
this(fileName,null);
}

public MyiReportViewer(String fileName,HashMap parameter)//////////////////////////////////
{
super("View Report");
try
{
    Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stii_project", "root", "");
JasperPrint print = JasperFillManager.fillReport(fileName, parameter, con);
JRViewer viewer=new JRViewer(print);

Container c=getContentPane();
c.add(viewer);
}
catch(ClassNotFoundException cnfe)
{
cnfe.printStackTrace();
}
catch(SQLException sqle)
{
sqle.printStackTrace();
}
catch(JRException jre)
{
jre.printStackTrace();
}

setBounds(10,10,600,500);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);


}
public static void main(String args[])
{

//HashMap param=new HashMap();
//MyiReportViewer viewer=new MyiReportViewer("report4.jasper",param);
//viewer.setVisible(true);



}
}
