package pracproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;

public class print {

	private JFrame frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					print window = new print();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public print() {
		initialize();
	}
	 
	 

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 775, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 102));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Staff");
		rdbtnNewRadioButton.setBackground(new Color(255, 204, 204));
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				stafflogin.main(new String[]{});
				
			}
		});
		rdbtnNewRadioButton.setBounds(296, 146, 141, 36);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Clerk");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 204, 204));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clerklogin.main(new String[]{});
				
			}
		});
		rdbtnNewRadioButton_1.setBounds(296, 231, 141, 36);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("Login As");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(SystemColor.windowBorder);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(109, 81, 414, 58);
		panel.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Delivery Boy");
		rdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deliverboy.main(new String[] {});
			}
		});
		rdbtnNewRadioButton_2.setBackground(new Color(255, 204, 204));
		rdbtnNewRadioButton_2.setForeground(Color.BLACK);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_2.setBounds(296, 312, 141, 36);
		panel.add(rdbtnNewRadioButton_2);
	}
}
