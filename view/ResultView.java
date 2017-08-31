package view;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import crontroller.CrontrollerSystem;
import model.Schedule;

import javax.swing.DefaultComboBoxModel;

public class ResultView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldDate;
	
	
	private JTextField textFieldAddDescription;
	
	private JButton addSchedule;
	
	private JLabel staffName;
	
	private JLabel descriptionName;
	
	private JTable table;
	private JScrollPane scrollPane;
	private static Object[][] data;
	
	
	
	
	public static void setData(){
		ArrayList<Schedule> schedules = Schedule.getSchedules();
		for(int i =0;i<schedules.size();i++){
			data[i][i] = schedules.get(i);
		}
	}
	public ResultView(CrontrollerSystem crontrollerSystem) {
		ResultView.setData();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(570, 300, 800, 400);
		setTitle("My Schedule");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Box
		
		
		
		//TextField
		textFieldDate = new JTextField();
		textFieldDate.setBounds(175, 266, 121, 20);
		contentPane.add(textFieldDate);
		textFieldDate.setColumns(10);
		
		
		
		textFieldAddDescription = new JTextField();
		textFieldAddDescription.setBounds(330, 300, 350, 50);
		contentPane.add(textFieldAddDescription);
		textFieldAddDescription.setColumns(10);
		
		
		
		addSchedule = new JButton("เพิ่มนัด");
		addSchedule.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addSchedule.setBounds(685, 266, 100, 20);
		contentPane.add(addSchedule);
		addSchedule.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a) {
				
				
				Schedule.addSchedule (textFieldDate.getText(),textFieldAddDescription.getText());
					model.addRow(new Object[] {textFieldDate.getText(),textFieldAddDescription.getText()});
					
				
				
			}	
		});
		
		
		
		descriptionName = new JLabel("รายละเอียด");
		descriptionName.setFont(new Font("Tahoma", Font.BOLD, 14));
		descriptionName.setBounds(220, 310, 100, 32);
		contentPane.add(descriptionName);
		
		staffName = new JLabel("วันที่");
		staffName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		staffName.setBounds(143, 249, 30, 50);
		contentPane.add(staffName);
		
		
		
		//Table
		table = new JTable();
		table.setModel(model);
		table.setBounds(1, 26, 1083, 64);
		getContentPane().add(table);
		
		//ScrollPane
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 1074, 244);
		getContentPane().add(scrollPane);

	}
	




	private DefaultTableModel model = new DefaultTableModel(data,new String[] {"วันที่","รายละเอียด"});
}
