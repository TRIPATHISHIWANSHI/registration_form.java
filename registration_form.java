import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class registration_form {
	JFrame frame;
	JLabel heading;
	String[] data;

// container
	Container c;
// labels
	JLabel name;
	JLabel email;
	JLabel pass;
	JLabel cPass;
	JLabel country;
	JLabel state;
	JLabel phone;

// textField
	JTextField nameText;
	JTextField emailText;
	JPasswordField passText;
	JPasswordField cPassText;
	JTextField countryText;
	JTextField stateText;
	JTextField phoneText;

// buttons
	JButton submit;
	JButton clear;

	registration_form() {
		frame = new JFrame("Registration Form in Java ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 800, 500);

// heading
		heading = new JLabel("Registration Form ");
		heading.setBounds(40, 10, 400, 40);
		Font font = new Font("Aerial", Font.PLAIN, 30);
		heading.setFont(font);
		heading.setForeground(Color.blue);

// Creating container
		c = frame.getContentPane();
		c.setLayout(null);

// Creating labels
// memory allocation
		name = new JLabel("Name : ");
		email = new JLabel("Email-ID : ");
		pass = new JLabel("Create Password : ");
		cPass = new JLabel("Confirm Password : ");
		country = new JLabel("Country : ");
		state = new JLabel("State : ");
		phone = new JLabel("Phone No. : ");

// set bounds
		name.setBounds(20, 70, 150, 25);
		email.setBounds(20, 100, 150, 25);
		pass.setBounds(20, 130, 150, 25);
		cPass.setBounds(20, 160, 150, 25);
		country.setBounds(20, 190, 150, 25);
		state.setBounds(20, 220, 150, 25);
		phone.setBounds(20, 250, 150, 25);

// Creating textField
// memory allocation
		nameText = new JTextField();
		emailText = new JTextField();
		passText = new JPasswordField();
		cPassText = new JPasswordField();
		countryText = new JTextField();
		stateText = new JTextField();
		phoneText = new JTextField();

// set bounds
		nameText.setBounds(180, 70, 200, 25);
		emailText.setBounds(180, 100, 200, 25);
		passText.setBounds(180, 130, 200, 25);
		cPassText.setBounds(180, 160, 200, 25);
		countryText.setBounds(180, 190, 200, 25);
		stateText.setBounds(180, 220, 200, 25);
		phoneText.setBounds(180, 250, 200, 25);

// buttons creation
		submit = new JButton("Submit ");
		clear = new JButton("Clear ");
		submit.setBounds(20, 300, 80, 40);
		clear.setBounds(160, 300, 85, 40);

// storing Data
		data = new String[7];

// adding components
		c.add(heading);
		c.add(name);
		c.add(email);
		c.add(pass);
		c.add(cPass);
		c.add(country);
		c.add(state);
		c.add(phone);

		c.add(nameText);
		c.add(emailText);
		c.add(passText);
		c.add(cPassText);
		c.add(countryText);
		c.add(stateText);
		c.add(phoneText);

		c.add(submit);
		c.add(clear);

		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
// storing data in data array
				data[0] = nameText.getText();
				data[1] = emailText.getText();
				data[2] = passText.getText();
				data[3] = cPassText.getText();
				data[4] = countryText.getText();
				data[5] = stateText.getText();
				data[6] = phoneText.getText();
				System.out.println(Arrays.toString(data));
				JOptionPane.showMessageDialog(frame, "Data Saved Successfully ", "Message ",
						JOptionPane.INFORMATION_MESSAGE);
			}

		});

		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
// clearing data from textbox
				nameText.setText(null);
				emailText.setText(null);
				passText.setText(null);
				cPassText.setText(null);
				countryText.setText(null);
				stateText.setText(null);
				phoneText.setText(null);

// clearing data from data array
				data[0] = nameText.getText();
				data[1] = emailText.getText();
				data[2] = passText.getText();
				data[3] = cPassText.getText();
				data[4] = countryText.getText();
				data[5] = stateText.getText();
				data[6] = phoneText.getText();
			}
		});

// set visibility true
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		registration_form form = new registration_form();
	}
}
