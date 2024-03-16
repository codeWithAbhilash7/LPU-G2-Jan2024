package com.swingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class App implements ActionListener {

	JFrame frame;
	JLabel label;
	JTextField text;
	JPasswordField password;
	JTextArea textArea;
	JCheckBox checkBoxCPP, checkBoxJava;
	JRadioButton radioMale, radioFemale;
	JComboBox<String> comboBox;
	JTable table;
	
	JButton button;

	public App() {
		frame = new JFrame("Swing Demo");

//		label = new JLabel("=== SWING DEMO ===");
//		label.setBounds(130, 20, 300, 30);
//		frame.add(label);

		// combo box
		// comboBoxDemo();

		// table
		//tableDemo();
		
		button = new JButton("Click Here");
		button.setBounds(120, 155, 150, 30);
		button.addActionListener(this);
		frame.add(button);
		
		
		
		
		

		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	void tableDemo(JDialog frame) {
		Object[][] data = { { "Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false) },
				{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
				{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
				{ "Joe", "Brown", "Pool", new Integer(10), new Boolean(false) } };

		// Column Names
		String[] columnName = { "First Name", "Last Name", "Sport", "# of Years", "Vegetarian" };
		table = new JTable(data, columnName);
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(0, 0, 800, 100);
		frame.add(pane);
	}

	void comboBoxDemo() {
		String[] cities = { "Delhi", "Mumbai", "Dehradun", "Noida", "Pune" };
		comboBox = new JComboBox<String>(cities);
//		comboBox.addItem("Delhi");
//		comboBox.addItem("Mumbai");
//		comboBox.addItem("Dehradun");
//		comboBox.addItem("Noida");
//		comboBox.addItem("Pune");

		comboBox.addActionListener(this);
		comboBox.setBounds(50, 70, 100, 30);
		frame.add(comboBox);
	}

	void example1() {
		text = new JTextField();
		text.setBounds(50, 50, 260, 30);
		frame.add(text);

		password = new JPasswordField();
		password.setBounds(50, 90, 260, 30);
		frame.add(password);

		textArea = new JTextArea();
		textArea.setBounds(50, 130, 260, 60);
		frame.add(textArea);

		checkBoxCPP = new JCheckBox("C++");
		checkBoxCPP.setBounds(50, 200, 80, 30);
		frame.add(checkBoxCPP);

		checkBoxJava = new JCheckBox("Java");
		checkBoxJava.setBounds(150, 200, 120, 30);
		frame.add(checkBoxJava);

		radioMale = new JRadioButton("Male");
		radioMale.setBounds(50, 240, 80, 30);
		frame.add(radioMale);

		radioFemale = new JRadioButton("Female");
		radioFemale.setBounds(150, 240, 120, 30);
		frame.add(radioFemale);

		ButtonGroup group = new ButtonGroup();
		group.add(radioMale);
		group.add(radioFemale);

		radioFemale.addActionListener(this);
		radioMale.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("\n\nLabel = " + label.getText());
//		System.out.println("Text = " + text.getText());
//		System.out.println("Password = " + new String(password.getPassword()));
//		System.out.println("Text Area = " + textArea.getText());
//
//		if (checkBoxCPP.isSelected()) {
//			System.out.print("C++\t");
//		}
//		if (checkBoxJava.isSelected()) {
//			System.out.print("Java\n");
//		}
//
//		if (radioMale.isSelected()) {
//			System.out.print("Male\t");
//		}
//		if (radioFemale.isSelected()) {
//			System.out.print("Female");
//		}

		// combobox
//		System.out.println("City = " + comboBox.getSelectedItem());
//		System.out.println("index = " + comboBox.getSelectedIndex());
		
		// message box
//		JOptionPane.showMessageDialog(frame, "Hello World!", "Error", JOptionPane.ERROR_MESSAGE);
		
		// new dialog box
		JDialog newDialog = new JDialog(frame, "New Window");
		newDialog.setSize(800, 150);
		tableDemo(newDialog);
		newDialog.setLayout(null);
		newDialog.setVisible(true);
	}

	public static void main(String[] args) {
		new App();
	}

}
