package gui;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;

public class TableView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableView frame = new TableView();
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
	public TableView() {
		
		//Tool Bar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1090, 781);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 11, 985, 33);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setBackground(Color.YELLOW);
		contentPane.add(panel);
		FlowLayout fl_panel = new FlowLayout(FlowLayout.CENTER, 50, 5);
		panel.setLayout(fl_panel);
		
		JButton btnNewButton = new JButton("Restart");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Turn number -");
		lblNewLabel.setAlignmentX(1.0f);
		lblNewLabel.setDisplayedMnemonic(KeyEvent.VK_ENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 55, 985, 663);
		panel_1.setForeground(new Color(165, 42, 42));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel_1.setBackground(Color.BLACK);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(8, 8, 3, 3));
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		btnNewButton_2.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_58 = new JButton("New button");
		btnNewButton_58.setBorderPainted(false);
		btnNewButton_58.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_58);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("New button");
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		btnNewButton_14.setBorderPainted(false);
		btnNewButton_14.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBorderPainted(false);
		btnNewButton_16.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_16);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBorderPainted(false);
		btnNewButton_15.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_18 = new JButton("New button");
		btnNewButton_18.setBorderPainted(false);
		btnNewButton_18.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_18);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBorderPainted(false);
		btnNewButton_17.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_17);
		
		JButton btnNewButton_20 = new JButton("New button");
		btnNewButton_20.setBorderPainted(false);
		btnNewButton_20.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_20);
		
		JButton btnNewButton_19 = new JButton("New button");
		btnNewButton_19.setBorderPainted(false);
		btnNewButton_19.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_19);
		
		JButton btnNewButton_21 = new JButton("New button");
		btnNewButton_21.setBorderPainted(false);
		btnNewButton_21.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_21);
		
		JButton btnNewButton_23 = new JButton("New button");
		btnNewButton_23.setBorderPainted(false);
		btnNewButton_23.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_23);
		
		JButton btnNewButton_22 = new JButton("New button");
		btnNewButton_22.setBorderPainted(false);
		btnNewButton_22.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_22);
		
		JButton btnNewButton_24 = new JButton("New button");
		btnNewButton_24.setBorderPainted(false);
		btnNewButton_24.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_24);
		
		JButton btnNewButton_26 = new JButton("New button");
		btnNewButton_26.setBorderPainted(false);
		btnNewButton_26.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_26);
		
		JButton btnNewButton_25 = new JButton("New button");
		btnNewButton_25.setBorderPainted(false);
		btnNewButton_25.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_25);
		
		JButton btnNewButton_27 = new JButton("New button");
		btnNewButton_27.setBorderPainted(false);
		btnNewButton_27.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("New button");
		btnNewButton_28.setBorderPainted(false);
		btnNewButton_28.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("New button");
		btnNewButton_29.setBorderPainted(false);
		btnNewButton_29.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("New button");
		btnNewButton_30.setBorderPainted(false);
		btnNewButton_30.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("New button");
		btnNewButton_31.setBorderPainted(false);
		btnNewButton_31.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("New button");
		btnNewButton_32.setBorderPainted(false);
		btnNewButton_32.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_32);
		
		JButton btnNewButton_38 = new JButton("New button");
		btnNewButton_38.setBorderPainted(false);
		btnNewButton_38.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_38);
		
		JButton btnNewButton_33 = new JButton("New button");
		btnNewButton_33.setBorderPainted(false);
		btnNewButton_33.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("New button");
		btnNewButton_34.setBorderPainted(false);
		btnNewButton_34.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("New button");
		btnNewButton_35.setBorderPainted(false);
		btnNewButton_35.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_35);
		
		JButton btnNewButton_37 = new JButton("New button");
		btnNewButton_37.setBorderPainted(false);
		btnNewButton_37.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_37);
		
		JButton btnNewButton_36 = new JButton("New button");
		btnNewButton_36.setBorderPainted(false);
		btnNewButton_36.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_36);
		
		JButton btnNewButton_39 = new JButton("New button");
		btnNewButton_39.setBorderPainted(false);
		btnNewButton_39.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_39);
		
		JButton btnNewButton_43 = new JButton("New button");
		btnNewButton_43.setBorderPainted(false);
		btnNewButton_43.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_43);
		
		JButton btnNewButton_40 = new JButton("New button");
		btnNewButton_40.setBorderPainted(false);
		btnNewButton_40.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_40);
		
		JButton btnNewButton_44 = new JButton("New button");
		btnNewButton_44.setBorderPainted(false);
		btnNewButton_44.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_44);
		
		JButton btnNewButton_42 = new JButton("New button");
		btnNewButton_42.setBorderPainted(false);
		btnNewButton_42.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_42);
		
		JButton btnNewButton_41 = new JButton("New button");
		btnNewButton_41.setBorderPainted(false);
		btnNewButton_41.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_41);
		
		JButton btnNewButton_51 = new JButton("New button");
		btnNewButton_51.setBorderPainted(false);
		btnNewButton_51.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_51);
		
		JButton btnNewButton_45 = new JButton("New button");
		btnNewButton_45.setBorderPainted(false);
		btnNewButton_45.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_45);
		
		JButton btnNewButton_46 = new JButton("New button");
		btnNewButton_46.setBorderPainted(false);
		btnNewButton_46.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_46);
		
		JButton btnNewButton_47 = new JButton("New button");
		btnNewButton_47.setBorderPainted(false);
		btnNewButton_47.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_47);
		
		JButton btnNewButton_48 = new JButton("New button");
		btnNewButton_48.setBorderPainted(false);
		btnNewButton_48.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_48);
		
		JButton btnNewButton_49 = new JButton("New button");
		btnNewButton_49.setBorderPainted(false);
		btnNewButton_49.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_49);
		
		JButton btnNewButton_50 = new JButton("New button");
		btnNewButton_50.setBorderPainted(false);
		btnNewButton_50.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_50);
		
		JButton btnNewButton_52 = new JButton("New button");
		btnNewButton_52.setBorderPainted(false);
		btnNewButton_52.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_52);
		
		JButton btnNewButton_53 = new JButton("New button");
		btnNewButton_53.setBorderPainted(false);
		btnNewButton_53.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_53);
		
		JButton btnNewButton_54 = new JButton("New button");
		btnNewButton_54.setBorderPainted(false);
		btnNewButton_54.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_54);
		
		JButton btnNewButton_55 = new JButton("New button");
		btnNewButton_55.setBorderPainted(false);
		btnNewButton_55.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_55);
		
		JButton btnNewButton_56 = new JButton("New button");
		btnNewButton_56.setBorderPainted(false);
		btnNewButton_56.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_56);
		
		JButton btnNewButton_57 = new JButton("New button");
		btnNewButton_57.setBorderPainted(false);
		btnNewButton_57.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_57);
		
		JButton btnNewButton_59 = new JButton("New button");
		btnNewButton_59.setBorderPainted(false);
		btnNewButton_59.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_59);
		
		JButton btnNewButton_60 = new JButton("New button");
		btnNewButton_60.setBorderPainted(false);
		btnNewButton_60.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_60);
		
		JButton btnNewButton_61 = new JButton("New button");
		btnNewButton_61.setBorderPainted(false);
		btnNewButton_61.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_61);
		
		JButton btnNewButton_62 = new JButton("New button");
		btnNewButton_62.setBorderPainted(false);
		btnNewButton_62.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_62);
		
		JButton btnNewButton_63 = new JButton("New button");
		btnNewButton_63.setBorderPainted(false);
		btnNewButton_63.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_63);
		
		JButton btnNewButton_64 = new JButton("New button");
		btnNewButton_64.setBorderPainted(false);
		btnNewButton_64.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_64);
		
		JButton btnNewButton_65 = new JButton("New button");
		btnNewButton_65.setBorderPainted(false);
		btnNewButton_65.setBackground(new Color(160, 82, 45));
		panel_1.add(btnNewButton_65);
		
		
	}
}
