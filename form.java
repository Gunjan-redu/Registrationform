package registrationform;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.toedter.calendar.JDateChooser;

public class form extends JFrame implements ActionListener{
	
	private JFrame frame;
	JTextField idTextField,nameTextField, fnameTextField, mobTextField, emailTextField, addressTextField, dobCal ;
	//JDateChooser dobCal;
	JRadioButton male, female;
	JComboBox courselist;
	JButton submitButton;
	  
	form(){ 
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		//title 
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Color.GRAY);
		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 105, 0));
		add(titlePanel);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/logo.png"));
		Image i2 = i1.getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		titlePanel.add(image);
				
		JLabel title = new JLabel("Registration form");
		title.setFont(new Font("Arial", Font.PLAIN, 34));
		titlePanel.add(title);
		
		//Student id
		JPanel idPanel = new JPanel();
		idPanel.setBackground(Color.WHITE);
		idPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 115, 2));
		add(idPanel);
		
		JLabel id =new JLabel("Student ID");
		id.setFont(new Font("Arial", Font.PLAIN, 14));
		idPanel.add(id);
		
		idTextField = new JTextField();
		idTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		idTextField.setPreferredSize(new Dimension(300, 30));
		idPanel.add(idTextField);
		
		//name 
		JPanel namePanel = new JPanel();
		namePanel.setBackground(Color.WHITE);
		namePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 145, 0));
		add(namePanel);
		
		JLabel name =new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 14));
		namePanel.add(name);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		nameTextField.setPreferredSize(new Dimension(300, 30));
		namePanel.add(nameTextField);
		
		//father'snamePanel
		JPanel fathernamePanel = new JPanel();
		fathernamePanel.setBackground(Color.WHITE);
		fathernamePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 90, 0));
		add(fathernamePanel);
		
		JLabel fname =new JLabel("Father's Name");
		fname.setFont(new Font("Arial", Font.PLAIN, 14));
		fathernamePanel.add(fname);
		
		fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		fnameTextField.setPreferredSize(new Dimension(300, 30));
		fathernamePanel.add(fnameTextField);
		
		//MobileNo
		JPanel mobPanel = new JPanel();
		mobPanel.setBackground(Color.WHITE);
		mobPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 90, 0));
		add(mobPanel);
		
		JLabel mob =new JLabel("Mobile Number");
		mob.setFont(new Font("Arial", Font.PLAIN, 14));
		mobPanel.add(mob);
		
		mobTextField = new JTextField();
		mobTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		mobTextField.setPreferredSize(new Dimension(300, 30));
		mobPanel.add(mobTextField);
		
		//DOB Panel
		JPanel dobPanel = new JPanel();
		dobPanel.setBackground(Color.WHITE);
		dobPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 155, 0));
		add(dobPanel);
		
		JLabel dob =new JLabel("DOB");
		dob.setFont(new Font("Arial", Font.PLAIN, 14));
		dobPanel.add(dob);
		
	    //dobCal = new JDateChooser();
	    dobCal = new JTextField();
	    dobCal.setFont(new Font("Arial", Font.PLAIN, 14));
		dobCal.setPreferredSize(new Dimension(300, 30));
		dobPanel.add(dobCal);
		
		//gender Panel
		JPanel genderPanel = new JPanel();
		genderPanel.setBackground(Color.WHITE);
		genderPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 130, 0));
		add(genderPanel);
		
		     
		
		JLabel gender =new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 14));
		genderPanel.add(gender);
		
	    male = new JRadioButton("Male");
	    male.setFont(new Font("Arial", Font.PLAIN, 14));
	    male.setOpaque(false);
	    male.setPreferredSize(new Dimension(80, 30));
		genderPanel.add(male);
		
		female = new JRadioButton("Female");
	    female.setFont(new Font("Arial", Font.PLAIN, 14));
	    female.setOpaque(false);
	    female.setPreferredSize(new Dimension(100, 30));
		genderPanel.add(female);
		
		//courses Panel
		JPanel coursesPanel = new JPanel();
		coursesPanel.setBackground(Color.WHITE);
		coursesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 140, 0));
		add(coursesPanel);
		
		JLabel Courses =new JLabel("Course");
		Courses.setFont(new Font("Arial", Font.PLAIN, 14));
		coursesPanel.add(Courses);
		
		String[] courses = {"BCA", "BA", "B.SC", "B.Com", "B.Tech", "MCA", "MA", "M.Sc.", "MBA", "M.Tech"};
		courselist = new JComboBox(courses);
		courselist.setPreferredSize(new Dimension(300, 30));
		courselist.setFont(new Font("Arial", Font.PLAIN, 15));
		courselist.setBackground(Color.WHITE);
		coursesPanel.add(courselist);
		
		//EmailNo
		JPanel emailPanel = new JPanel();
		emailPanel.setBackground(Color.WHITE);
		emailPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 155, 0));
		add(emailPanel);
		
		JLabel emailLabel =new JLabel("Email");
		emailLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		emailPanel.add(emailLabel);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		emailTextField.setPreferredSize(new Dimension(300, 30));
		emailPanel.add(emailTextField);
		
		//AddressPanel
		JPanel addressPanel = new JPanel();
		addressPanel.setBackground(Color.WHITE);
		addressPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 140, 0));
		add(addressPanel);
		
		JLabel addressLabel =new JLabel("Address");
		addressLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		addressPanel.add(addressLabel);
		
		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Arial", Font.PLAIN, 14));
		addressTextField.setPreferredSize(new Dimension(300, 60));
		addressPanel.add(addressTextField);
		
		//button
		JPanel submitPanel = new JPanel();
		submitPanel.setBackground(Color.WHITE);
		submitPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
		add(submitPanel);
		
		submitButton = new JButton("Submit");
		submitButton.setFont(new Font("Arial", Font.PLAIN, 18));
		submitButton.setPreferredSize(new Dimension(300, 30));
		submitButton.setBackground(Color.GRAY);
		submitButton.addActionListener(this);
		submitPanel.add(submitButton);
				
		getContentPane().setBackground(Color.WHITE);
		setTitle("Slider");
		setSize(1000, 750);
		setLocation(200, 0);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(nameTextField.getText()=="") {
			System.out.println("hello");
		}
		String id = idTextField.getText();
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String mob = mobTextField.getText();
		String dob = dobCal.getText();
		String gender = null;
		if(male.isSelected()) {
			gender = "Male";
		}
		if(female.isSelected()) {
			gender = "Female";
		}
		String course = ""+ courselist.getSelectedItem() ;
		String email = emailTextField.getText();
		String address = addressTextField.getText();
		
		try {
			Connec c = new Connec();
			String query = "insert into details1 values('"+id+"','"+name+"', '"+fname+"', '"+mob+"', '"+dob+"', '"+gender+"', '"+course+"', '"+email+"', '"+address+"')"; 
			c.s.executeUpdate(query);
			setVisible(false);
	
			try {
				closingform frame = new closingform();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
           }
        
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	
	public static void main(String[] args) {
		form f =	new form();
		
		
	}



}