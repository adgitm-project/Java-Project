package codebuddy;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 

public class bankportal extends Frame {
	public bankportal() {
		final Frame frame = new Frame("Bank application");
		
		
		
		
		
		//TextField T1 = new TextField();
		//T1.setBounds(300,200,150,40);
		
		//TextField T2 = new TextField();
		//T2.setBounds(300,100,150,40);
		
		//TextField T3 = new TextField();
		//T3.setBounds(300,300,150,40);
		
		//TextField T4 = new TextField();
		//T4.setBounds(300,400,150,40);
		
		//Label label = new Label("Enter Account Number ");
		//label.setBounds(30,100,300, 30);
		
		//Label label2 = new Label("Enter Account Type ");
		//label2.setBounds(30,210,300, 30);
		
		//Label label3 = new Label("Enter Name ");
		//label3.setBounds(30,300,300, 30);
		
		//Label label4 = new Label("Enter Balance ");
		//label4.setBounds(30,400,300, 30);
		
		Button button = new Button("Display all Details"); button.setForeground(Color.black);
		button.setBounds(100,100,150,40); frame.setBackground(Color.YELLOW);
		
		
		
		
		Button button21 = new Button("Withdraw Money"); button21.setForeground(Color.black);
		button21.setBounds(300,100,150,40);
		
		
		Button button6 = new Button("Return"); button6.setForeground(Color.black);
		button6.setBounds(350,400,50,40);
		
		
		
		
		
                
                //Button button1 = new Button("submit"); button1.setForeground(Color.black);
		//button1.setBounds(500,450,60,30);
                
                //Button button21 = new Button("Withdraw Money"); button21.setForeground(Color.black);
		//button21.setBounds(300,100,150,40);
		
		
                
                Button button3 = new Button("Deposit Money"); button3.setForeground(Color.black);
		button3.setBounds(100,300,150,40);
		
		Button button4 = new Button("Search by account number"); button3.setForeground(Color.black);
		button4.setBounds(300,300,200,40);
		
		
		
		Button button5 = new Button("Exit"); button5.setForeground(Color.black);
		button5.setBounds(100,400,50,40);
		
		
		
		button.addActionListener((ActionListener) new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				//label.setText("Enter Account Number");
				frame.dispose();
				 new Display();
			
			  }

			public void actionPerformed1(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		} );
		
		button21.addActionListener((ActionListener) new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				//label.setText("Enter Account Number");
				frame.dispose();
				 new Withdraw();
			
			  }

			public void actionPerformed1(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		
				
				
				);
		
		
		
		
		
		button3.addActionListener((ActionListener) new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				//label.setText("Enter Account Number");
				frame.dispose();
				 new Deposit();
			
			  }

			public void actionPerformed1(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		
				
				
				);
		
		
		
		
		button6.addActionListener((ActionListener) new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				//label.setText("Enter Account Number");
				
				frame.dispose();
			
				 new Information();
			
			  }

			public void actionPerformed1(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
				
				
				);
		
		
		
		
		
		
		button4.addActionListener((ActionListener) new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				//label.setText("Enter Account Number");
				frame.dispose();
				 new Search();
			
			  }

			public void actionPerformed1(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		
				
				
				);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		button5.addActionListener((ActionListener) new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				//label.setText("Enter Account Number");
				frame.dispose();
				 new Exit();
			
			  }

			public void actionPerformed1(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		
				
				
	);
		
		
		
		
		
	
		
		
		
		//frame.add(T1);
		//frame.add(T2);
		//frame.add(T3);
		//frame.add(T4);
		//frame.add(label);
		//frame.add(label2);
		//frame.add(label3);
		//frame.add(label4);
		frame.add(button);
               // frame.add(button1);
                frame.add(button21);
                frame.add(button3);
                frame.add(button4);
                frame.add(button5);
                frame.add(button6);
		
		
		
		
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
	
	
	    new bankportal();	
	 

}
}

