package pracproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.awt.Font;
import java.awt.Color;
public class StaffRegister {

	private JFrame frame;
	private JTextField textFieldname;
	private JTextField textFieldemail;
	private JTextField textFieldfilename;
	private JTextField textFieldpapertype;
	private JTextField textFieldreq;
	private JTextField textFieldID;
	
	
	



	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffRegister window = new StaffRegister();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public StaffRegister() {
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
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(237, 64, 62, 17);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(237, 92, 62, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(237, 134, 62, 33);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("File Name");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(237, 178, 89, 30);
		panel.add(lblNewLabel_4);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(331, 99, 119, 20);
		panel.add(textFieldname);
		textFieldname.setColumns(10);
		
		textFieldemail = new JTextField();
		textFieldemail.setBounds(331, 142, 119, 20);
		panel.add(textFieldemail);
		textFieldemail.setColumns(10);
		
		textFieldfilename = new JTextField();
		textFieldfilename.setBounds(331, 185, 119, 20);
		panel.add(textFieldfilename);
		textFieldfilename.setColumns(10);
		
		textFieldpapertype = new JTextField();
		textFieldpapertype.setBounds(341, 226, 109, 20);
		panel.add(textFieldpapertype);
		textFieldpapertype.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=jdbc.getConnection();
					
					PreparedStatement ps=con.prepareStatement("insert into clerk(ID,Name,Email,File_Name,req_type,paper_type) values(?,?,?,?,?,?)");
					ps.setString(1,textFieldID.getText());
					ps.setString(2,textFieldname.getText());
					ps.setString(3,textFieldemail.getText());
					ps.setString(4,textFieldfilename.getText());
					ps.setString(5,textFieldreq.getText());
					ps.setString(6,textFieldpapertype.getText());
					
					ps.execute();
					JOptionPane.showMessageDialog(null, "Data saved");
					con.close();
				}catch(Exception e1){e1.printStackTrace();}
				
				}
			
		});
		btnNewButton.setBounds(424, 322, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print.main(new String[] {});
			}
		});
		btnNewButton_1.setBounds(619, 322, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffPage.main(new String[] {});
			}
		});
		btnNewButton_2.setBounds(20, 322, 89, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Request Type");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(237, 266, 106, 31);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Paper_Type");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(237, 217, 101, 34);
		panel.add(lblNewLabel_5);
		
		textFieldreq = new JTextField();
		textFieldreq.setBounds(341, 273, 109, 20);
		panel.add(textFieldreq);
		textFieldreq.setColumns(10);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(331, 64, 119, 20);
		panel.add(textFieldID);
		textFieldID.setColumns(10);
	}
}
