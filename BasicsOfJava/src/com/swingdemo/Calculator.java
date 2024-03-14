package com.swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

	private JLabel lblNumber1, lblNumber2;
	private JTextField txtNumber1, txtNumber2, txtResult;
	private JButton btnAdd, btnSub;

	Calculator(String title) {
		super(title);

		lblNumber1 = new JLabel("First Value : ");
		lblNumber1.setVisible(true);
		super.add(lblNumber1);

		txtNumber1 = new JTextField(10);
		txtNumber1.setVisible(true);
		super.add(txtNumber1);

		lblNumber2 = new JLabel("Second Value : ");
		lblNumber2.setVisible(true);
		super.add(lblNumber2);

		txtNumber2 = new JTextField(10);
		txtNumber2.setVisible(true);
		super.add(txtNumber2);

		btnAdd = new JButton("Sum");
		btnAdd.setVisible(true);
		super.add(btnAdd);

		btnSub = new JButton("Diff");
		btnSub.setVisible(true);
		super.add(btnSub);

		txtResult = new JTextField(10);
		txtResult.setVisible(true);
		txtResult.setEnabled(false);
		super.add(txtResult);

		btnAdd.addActionListener(this);
		btnSub.addActionListener(this);

//		btnAdd.addActionListener(ae -> addNumbers());

		super.setLayout(new FlowLayout(FlowLayout.LEFT, 75, 25));

		super.setSize(400, 300);
		super.setVisible(true);
	}

//	private void addNumbers() {
//		double no1 = Double.parseDouble(txtNumber1.getText());
//		double no2 = Double.parseDouble(txtNumber2.getText());
//
//		txtResult.setText(String.valueOf(no1 + no2));
//	}

	@Override
	public void actionPerformed(ActionEvent e) {

		double no1 = Double.parseDouble(txtNumber1.getText());
		double no2 = Double.parseDouble(txtNumber2.getText());
		double result = 0;

		if (e.getSource() == btnAdd) {
			result = no1 + no2;
		} else if (e.getSource() == btnSub) {
			result = no1 - no2;
		}

		txtResult.setText(String.valueOf(result));
	}

	public static void main(String[] args) {

		new Calculator("Calculator");
	}

}
