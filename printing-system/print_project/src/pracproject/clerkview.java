package pracproject;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.sql.*;
import java.awt.Color;
;public class clerkview {

	private JFrame frame;
	private JTable table;



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clerkview window = new clerkview();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public clerkview() {
		initialize();
	}



	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 51, 102));
		frame.setBounds(100, 100, 775, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLoadTable = new JButton("Load");
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Connection con=jdbc.getConnection();
				PreparedStatement ps=con.prepareStatement("select ID,Name,Email,File_Name,staff_eligibility,req_type from clerk");
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
		btnLoadTable.setBounds(622, 11, 89, 23);
		frame.getContentPane().add(btnLoadTable);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 45, 724, 310);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_2 = new JButton("Reject");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				try {
					int SelectedRowIndex= table.getSelectedRow();
					model.removeRow(SelectedRowIndex);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please ,select the row before clicking the reject button");
				}
			}
		});
		btnNewButton_2.setBounds(340, 359, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		Button button = new Button("Back");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clerkPage.main(new String[] {});
			}
		});
		button.setBounds(23, 361, 70, 22);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("Next");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clerknext.main(new String[] {});
			}
		});
		button_1.setBounds(678, 360, 70, 22);
		frame.getContentPane().add(button_1);
	}
}
