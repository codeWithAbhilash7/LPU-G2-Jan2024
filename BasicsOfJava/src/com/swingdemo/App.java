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

	public App() {
		frame = new JFrame("Swing Demo");

		label = new JLabel("=== SWING DEMO ===");
		label.setBounds(130, 20, 300, 30);
		frame.add(label);

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
		
		frame.setSize(400, 800);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("\n\nLabel = " + label.getText());
		System.out.println("Text = " + text.getText());
		System.out.println("Password = " + new String(password.getPassword()));
		System.out.println("Text Area = " + textArea.getText());

		if (checkBoxCPP.isSelected()) {
			System.out.print("C++\t");
		}
		if (checkBoxJava.isSelected()) {
			System.out.print("Java\n");
		}
		
		if (radioMale.isSelected()) {
			System.out.print("Male\t");
		}
		if (radioFemale.isSelected()) {
			System.out.print("Female");
		}

	}

	public static void main(String[] args) {
		new App();
	}

}
