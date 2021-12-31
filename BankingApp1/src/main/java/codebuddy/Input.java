package codebuddy;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 

public class Input extends Frame {
	public Input() {
		final Frame frame = new Frame("Bank application");
		
		
		
		
		
		
		TextField T2 = new TextField();
		T2.setBounds(400,100,40,30);
		
		final Label label = new Label("How many number of customers do you want to input? ");
		label.setBounds(20,100,300, 30);
		
		Button button = new Button("submit");
		button.setBounds(250,200,60,30);
		
		button.setBackground(Color.red);
		button.setForeground(Color.white);
		frame.setBackground(Color.yellow);
		
		button.addActionListener((ActionListener) new ActionListener() {
			//@Override
			/*public void actionPerformed(ActionEvent e) {
				label.setText("How many number of customers do you want to input?");
			
				  new Information();
			
			  }*/

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				frame.dispose();
				new Information();
				
			}
		}
				
				
				);
		
		
		
		
		frame.add(T2);
		frame.add(label);
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
	
	//new awt123();
	   new Input();	
	 

}
}

