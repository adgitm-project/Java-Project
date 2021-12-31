package codebuddy;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
//import codebuddy.Information;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 

public class Display extends Frame {
	String Name, Accounttype, Accountnumber,Balance;
	public Display() {
		final Frame frame = new Frame("Bank application");
		
		
		
		
		
		//TextField T1 = new TextField();
		//T1.setBounds(300,200,150,40);
		
		//TextField T2 = new TextField();
		//T2.setBounds(300,100,150,40);
		
		//TextField T3 = new TextField();
		//T3.setBounds(300,300,150,40);
		
		//TextField T4 = new TextField();
		//T4.setBounds(300,400,150,40);
		
		Label label = new Label("INFORMATION ");
		label.setBounds(400,100,300, 30);
		
		Information info = new Information();
		
		final TextArea area = new TextArea();    
		// setting location of text area in frame  
		        area.setBounds(10, 30, 300, 400); 
		        
		       
		
		//Label labela = new Label(info.s1);
		//Label labelb = new Label(info.s2);
		// labelc = new Label(info.s3);
		//Label labeld = new Label(info.s4);
		//label2.setBounds(30,210,300, 30);
		
		//Label label3 = new Label("Enter Name ");
		//label3.setBounds(30,300,300, 30);
		
		//Label label4 = new Label("Enter Balance ");
		//label4.setBounds(30,400,300, 30);
		
		Button button = new Button("Back"); button.setForeground(Color.black);
		button.setBounds(500,450,80,30); frame.setBackground(Color.white);
                
		
		
		Button button8 = new Button("Show"); button8.setForeground(Color.black);
		button8.setBounds(400,450,80,30);
		
		
		
                //Button button1 = new Button("submit"); button1.setForeground(Color.black);
		//button1.setBounds(500,450,60,30);
                
               // Button button2 = new Button("Withdraw Money"); button2.setForeground(Color.black);
		//button2.setBounds(300,100,100,40);
                
                //Button button3 = new Button("Deposit Money"); button3.setForeground(Color.black);
		//button3.setBounds(100,300,100,40);
		
		
		
		button8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		button8.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {
		
	                
	                try {
	                    CP c = new CP();
	                    String str = "select * from customer";
	                    
	            		PreparedStatement ps = c.con.prepareStatement(str);
	            		
	            		ResultSet rs = ps.executeQuery();
	            		rs.next();
	            		rs.getString(1);
	                    while(rs.next()){

	                        
	                        Name = rs.getString("name");
	                        area.append(Name+"  ");
	                        System.out.println(Name);
	                        Accounttype = rs.getString("ac_type");
	                        area.append(Accounttype+"  ");
	                        System.out.println(Accounttype+"\n");
	                        Accountnumber = rs.getString("ac_no");
	                        area.append(Accountnumber+"  ");
	                        System.out.println(Accountnumber+"\n");
	                        Balance = rs.getString("balance");
	                        area.append(Balance+"\n");
	                        System.out.println(Balance);
	                       
	                    }
	                    
	                }catch(SQLException e){
	                    e.printStackTrace();
	                }
	            }
	        });
		button.addActionListener( new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				//label.setText("Enter Account Number");
			frame.dispose();
				 new bankportal();
			
			  }

			
		}
				
				
				);
		
		
		
		//frame.add(T1);
		//frame.add(T2);
		//frame.add(T3);
		//frame.add(T4);
		frame.add(label);
		//frame.add(labela);
	//	frame.add(labelb);
		//frame.add(labelc);
		//frame.add(labeld);
		frame.add(button);
		frame.add(area);
               // frame.add(button1);
               // frame.add(button2);
                frame.add(button8);
		
		
		
		
		frame.setSize(600,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		
		
	}
	public static void main(String[] args) {
	
	
	    new Display();	
	 

}
}