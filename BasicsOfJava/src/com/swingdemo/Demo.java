package com.swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo implements ActionListener {

	private JFrame frame;
	private JLabel label, labelOut;
	private JTextField text;
	private JButton button;

	Demo() {
		frame = new JFrame("Some Title");
		
		label = new JLabel("Username : ");
		label.setVisible(true);
		frame.add(label);

		text = new JTextField(20);
		text.setVisible(true);
		frame.add(text);
		
		button = new JButton("Click here...");
		button.setVisible(true);
		frame.add(button);
		
		button.addActionListener(this);
				
		frame.setLayout(new FlowLayout(FlowLayout.LEFT, 75, 25));
		
		labelOut = new JLabel("Entered text is : ");
		labelOut.setVisible(true);
		frame.add(labelOut);
		
		frame.setSize(1000, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Demo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String username = text.getText();
		labelOut.setText(labelOut.getText() + " " + username);
	}

}
