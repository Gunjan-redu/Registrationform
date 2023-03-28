package registrationform;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class closingform extends JFrame implements ActionListener {
	
	closingform(){
		
		JFrame frame;
		JButton ex;
		
		frame = new JFrame();
		
		frame.setLayout(null);
		
		JLabel l1 = new JLabel("Congratulations! Your form is successfully submitted.");
		l1.setBounds(60, 100, 400, 40);
		l1.setBackground(Color.WHITE);
		l1.setFont(new Font("Raleway", Font.BOLD, 15));
		frame.add(l1);
		
		ex = new JButton("Exit");
		ex.setBounds(200, 190, 70, 40);
		ex.setBackground(Color.WHITE);
		ex.addActionListener(this);
		frame.add(ex);
		
		ex.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	           System.exit(0);
	        }
	    });
		
		frame.setTitle("Congrats!!");
		frame.setLocation(400, 200);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		closingform cf = new closingform();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	


}
