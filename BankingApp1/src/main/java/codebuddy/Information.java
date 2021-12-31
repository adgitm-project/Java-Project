package codebuddy;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 

public class  Information extends Frame {
	TextField T1 ,T2,T3,T4; 
	Button button; 
	public Information() {
		final Frame frame = new Frame("Bank application");
		
	
		
		
		
		
		
		 T1 = new TextField();
		T1.setBounds(300,200,150,40);
		//account type
		
		 T2 = new TextField();
		T2.setBounds(300,100,150,40);
//account number		
		 T3 = new TextField();
		T3.setBounds(300,300,150,40);
		//name
		
		 T4 = new TextField();
		T4.setBounds(300,400,150,40);
		
		final Label label = new Label("Enter Account Number ");
		label.setBounds(30,100,300, 30);
		
		Label label2 = new Label("Enter Account Type ");
		label2.setBounds(30,210,300, 30);
		
		Label label3 = new Label("Enter Name ");
		label3.setBounds(30,300,300, 30);
		
		Label label4 = new Label("Enter Balance ");
		label4.setBounds(30,400,300, 30);
		
		 button = new Button("submit");
		button.setBounds(500,450,60,30);
		
		
		
		
		button.setForeground(Color.black);
		frame.setBackground(Color.white);
		
		button.addActionListener( new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				//label.setText("Enter Account Number");
			//frame.dispose();
				
			
			 // }

		//	public void actionPerformed1(ActionEvent e) {
				
				
				
				
			
   // if(e.getSource()==button){
try{
CP c1 = new CP(); // as we are working with database , make connection class object

String s1 = T1.getText();
String s2 = T2.getText();
String s3 = T3.getText();
String s4 = T4.getText();



String str = "INSERT INTO customer values( '"+s2+"', '"+s1+"','"+s3+"', '"+s4+"')";

c1.s.executeUpdate(str);
JOptionPane.showMessageDialog(null,"Customer Added");
setVisible(false);

} catch(Exception ae) {
ae.printStackTrace();
}
new bankportal();

    
//}
				// TODO Auto-generated method stub
				
			}
		}
				
				
				);
		
		
		
		frame.add(T1);
		frame.add(T2);
		frame.add(T3);
		frame.add(T4);
		frame.add(label);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(button);
		
		
		
		
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
	
	
	    new Information();	
	  new CheckboxGroup();

}
}

