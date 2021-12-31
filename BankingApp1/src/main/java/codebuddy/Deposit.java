package codebuddy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 

public class Deposit extends Frame {
	public Deposit() {
		final Frame frame = new Frame("Bank application");
		
		
		
		
		
		//TextField T1 = new TextField();
		//T1.setBounds(300,200,150,40);
		
		//TextField T2 = new TextField();
		//T2.setBounds(300,100,150,40);
		
		//TextField T3 = new TextField();
		//T3.setBounds(300,300,150,40);
		
		//TextField T4 = new TextField();
		//T4.setBounds(300,400,150,40);
		
		Label label = new Label("DEPOSIT MONEY ");
		label.setBounds(200,50,300, 30);
		
		
		
		
		Button button1 = new Button("Account no"); button1.setForeground(Color.black);
		button1.setBounds(30,200,130,30);
		
		TextField T1 = new TextField();
		T1.setBounds(230,200,100,30);
		
		
		
		Button button2 = new Button("Enter the deposit money"); button2.setForeground(Color.black);
		button2.setBounds(30,300,130,30);
		
		TextField T2 = new TextField();
		T2.setBounds(230,300,100,30);
		
		
		//Label label2 = new Label("Enter Account Type ");
		//label2.setBounds(30,210,300, 30);
		
		//Label label3 = new Label("Enter Name ");
		//label3.setBounds(30,300,300, 30);
		
		//Label label4 = new Label("Enter Balance ");
		//label4.setBounds(30,400,300, 30);
		
		Button button = new Button("Back"); button.setForeground(Color.black);
		button.setBounds(500,450,60,30); frame.setBackground(Color.white);
                
                //Button button1 = new Button("submit"); button1.setForeground(Color.black);
		//button1.setBounds(500,450,60,30);
                
               // Button button2 = new Button("Withdraw Money"); button2.setForeground(Color.black);
		//button2.setBounds(300,100,100,40);
                
                //Button button3 = new Button("Deposit Money"); button3.setForeground(Color.black);
		//button3.setBounds(100,300,100,40);
		
		
		
		button.addActionListener((ActionListener) new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				//label.setText("Enter Account Number");
				frame.dispose();
				 new bankportal();
			
			  }

			public void actionPerformed1(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
				
				
				);
		
		
		
		frame.add(T1);
		frame.add(T2);
		//frame.add(T3);
		//frame.add(T4);
		frame.add(label);
		//frame.add(label2);
		//frame.add(label3);
		//frame.add(label4);
		frame.add(button);
                frame.add(button1);
                frame.add(button2);
               // frame.add(button3);
		
		
		
		
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
	
	
	    new Search();	
	 

}
}


