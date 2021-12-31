package codebuddy;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.awt.event.*;
 

public class Welcome extends Frame {
	public Welcome() {
		final Frame frame = new Frame("Bank application");
		
		
		
		
		
		
		
		
		final Label label = new Label("WELCOME TO OWL BANK ");
		label.setBounds(220,300,300, 30);
                
                
                
                Label labe2 = new Label("AVAILABLE FOR 24*7");
		labe2.setBounds(200,150,300, 30);
		
		Button button = new Button("ENTER");
		button.setBounds(250,400,60,30);
		
		button.setBackground(Color.red);
		button.setForeground(Color.white);
		frame.setBackground(Color.white);
		
		button.addActionListener((ActionListener) new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				label.setText("Welcome to OWL Bank");
			frame.dispose();
				  new Information();			
			  }

			public void actionPerformed1(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
				
				
				);
		
		
		
		
		
		frame.add(label);
                frame.add(labe2);
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
	
	
	   new Welcome();
           
	 

}
}

