package pracproject;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Color;

public class clerknext extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldID;
	private JTextField textFieldname;
	private JTextField textFieldfile_name;
	private JTextField textFieldcost;
	private JTextField textField;
	
	public void loadtable()
	{
		try {
			Connection con=jdbc.getConnection();
			PreparedStatement ps=con.prepareStatement("select ID,Name,File_Name,File_id,Paper_type,cost from clerk");
			ResultSet rs=ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			con.close();
			}
			catch (Exception e1)
			{
				e1.printStackTrace();
			}
	}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clerknext frame = new clerknext();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public clerknext() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnloadTable = new JButton("load");
		btnloadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=jdbc.getConnection();
					PreparedStatement ps=con.prepareStatement("select ID,Name,File_Name,File_id,Paper_type,cost from clerk");
					ResultSet rs=ps.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					con.close();
					}
					catch (Exception e1)
					{
						e1.printStackTrace();
					}
			}
		});
		btnloadTable.setBounds(590, 11, 89, 23);
		contentPane.add(btnloadTable);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(276, 55, 473, 317);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(52, 89, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(41, 148, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("File ID");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(24, 198, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(108, 86, 86, 20);
		contentPane.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(108, 145, 86, 20);
		contentPane.add(textFieldname);
		textFieldname.setColumns(10);
		
		textFieldfile_name = new JTextField();
		textFieldfile_name.setBounds(108, 197, 86, 20);
		contentPane.add(textFieldfile_name);
		textFieldfile_name.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("cost");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(41, 252, 57, 14);
		contentPane.add(lblNewLabel_3);
		
		textFieldcost = new JTextField();
		textFieldcost.setBounds(108, 251, 86, 20);
		contentPane.add(textFieldcost);
		textFieldcost.setColumns(10);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					Connection con=jdbc.getConnection();
					
					PreparedStatement ps=con.prepareStatement("update clerk set ID='"+textFieldID.getText()+"',name='"+textFieldname.getText()+"',File_ID='"+textFieldfile_name.getText()+"',cost='"+textFieldcost.getText()+"'where ID='"+textFieldID.getText()+"' ");
					ps.execute();
					JOptionPane.showMessageDialog(null,"Data Updated");
					ps.close();
					
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				loadtable();
			}
		});
		btnNewButton.setBounds(75, 311, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				print.main(new String[] {});
				
			}
		});
		btnNewButton_1.setBounds(177, 349, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clerkview.main(new String[] {});
			}
		});
		btnNewButton_2.setBounds(10, 349, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("search :");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(24, 15, 74, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				try {
Connection con=jdbc.getConnection();
					
					PreparedStatement ps=con.prepareStatement("select ID,Name,File_Name,File_id,Paper_type,cost from clerk where ID=?");
					ps.setString(1, textField.getText());
					ResultSet res=ps.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(res));
					ps.close();
				}
				catch (Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		textField.setBounds(91, 12, 103, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		loadtable();
	}
}
