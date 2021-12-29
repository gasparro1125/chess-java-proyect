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
		
		JButton c00 = new JButton("c00");
		c00.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		c00.setBorderPainted(false);
		c00.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		c00.setBackground(new Color(160, 82, 45));
		panel_1.add(c00);
		
		JButton c01 = new JButton("c01");
		c01.setBorderPainted(false);
		c01.setBackground(Color.WHITE);
		panel_1.add(c01);
		
		JButton c02 = new JButton("c02");
		c02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		c02.setBorderPainted(false);
		c02.setBackground(new Color(160, 82, 45));
		panel_1.add(c02);
		
		JButton c03 = new JButton("c03");
		c03.setBorderPainted(false);
		c03.setBackground(Color.WHITE);
		panel_1.add(c03);
		
		JButton c04 = new JButton("c04");
		c04.setBorderPainted(false);
		c04.setBackground(new Color(160, 82, 45));
		panel_1.add(c04);
		
		JButton c05 = new JButton("c05");
		c05.setBorderPainted(false);
		c05.setBackground(Color.WHITE);
		panel_1.add(c05);
		
		JButton c06 = new JButton("c06");
		c06.setBorderPainted(false);
		c06.setBackground(new Color(160, 82, 45));
		panel_1.add(c06);
		
		JButton c07 = new JButton("c07");
		c07.setBorderPainted(false);
		c07.setBackground(Color.WHITE);
		panel_1.add(c07);
		
		JButton c08 = new JButton("c08");
		c08.setBorderPainted(false);
		c08.setBackground(Color.WHITE);
		panel_1.add(c08);
		
		JButton c09 = new JButton("c09");
		c09.setBorderPainted(false);
		c09.setBackground(new Color(160, 82, 45));
		panel_1.add(c09);
		
		JButton c10 = new JButton("c10");
		c10.setBorderPainted(false);
		c10.setBackground(Color.WHITE);
		panel_1.add(c10);
		
		JButton c11 = new JButton("c11");
		c11.setBorderPainted(false);
		c11.setBackground(new Color(160, 82, 45));
		panel_1.add(c11);
		
		JButton c12 = new JButton("c12");
		c12.setBorderPainted(false);
		c12.setBackground(Color.WHITE);
		panel_1.add(c12);
		
		JButton c13 = new JButton("c13");
		c13.setBorderPainted(false);
		c13.setBackground(new Color(160, 82, 45));
		panel_1.add(c13);
		
		JButton c14 = new JButton("c14");
		c14.setBorderPainted(false);
		c14.setBackground(Color.WHITE);
		panel_1.add(c14);
		
		JButton c15 = new JButton("c15");
		c15.setBorderPainted(false);
		c15.setBackground(new Color(160, 82, 45));
		panel_1.add(c15);
		
		JButton c16 = new JButton("c16");
		c16.setBorderPainted(false);
		c16.setBackground(new Color(160, 82, 45));
		panel_1.add(c16);
		
		JButton c17 = new JButton("c17");
		c17.setBorderPainted(false);
		c17.setBackground(Color.WHITE);
		panel_1.add(c17);
		
		JButton c18 = new JButton("c18");
		c18.setBorderPainted(false);
		c18.setBackground(new Color(160, 82, 45));
		panel_1.add(c18);
		
		JButton c19 = new JButton("c19");
		c19.setBorderPainted(false);
		c19.setBackground(Color.WHITE);
		panel_1.add(c19);
		
		JButton c20 = new JButton("c20");
		c20.setBorderPainted(false);
		c20.setBackground(new Color(160, 82, 45));
		panel_1.add(c20);
		
		JButton c21 = new JButton("c21");
		c21.setBorderPainted(false);
		c21.setBackground(Color.WHITE);
		panel_1.add(c21);
		
		JButton c22 = new JButton("c22");
		c22.setBorderPainted(false);
		c22.setBackground(new Color(160, 82, 45));
		panel_1.add(c22);
		
		JButton c23 = new JButton("c23");
		c23.setBorderPainted(false);
		c23.setBackground(Color.WHITE);
		panel_1.add(c23);
		
		JButton c24 = new JButton("c24");
		c24.setBorderPainted(false);
		c24.setBackground(Color.WHITE);
		panel_1.add(c24);
		
		JButton c25 = new JButton("c25");
		c25.setBorderPainted(false);
		c25.setBackground(new Color(160, 82, 45));
		panel_1.add(c25);
		
		JButton c26 = new JButton("c26");
		c26.setBorderPainted(false);
		c26.setBackground(Color.WHITE);
		panel_1.add(c26);
		
		JButton c27 = new JButton("c27");
		c27.setBorderPainted(false);
		c27.setBackground(new Color(160, 82, 45));
		panel_1.add(c27);
		
		JButton c28 = new JButton("c28");
		c28.setBorderPainted(false);
		c28.setBackground(Color.WHITE);
		panel_1.add(c28);
		
		JButton c29 = new JButton("c29");
		c29.setBorderPainted(false);
		c29.setBackground(new Color(160, 82, 45));
		panel_1.add(c29);
		
		JButton c30 = new JButton("c30");
		c30.setBorderPainted(false);
		c30.setBackground(Color.WHITE);
		panel_1.add(c30);
		
		JButton c31 = new JButton("c31");
		c31.setBorderPainted(false);
		c31.setBackground(new Color(160, 82, 45));
		panel_1.add(c31);
		
		JButton c32 = new JButton("c32");
		c32.setBorderPainted(false);
		c32.setBackground(new Color(160, 82, 45));
		panel_1.add(c32);
		
		JButton c33 = new JButton("c33");
		c33.setBorderPainted(false);
		c33.setBackground(Color.WHITE);
		panel_1.add(c33);
		
		JButton c34 = new JButton("c34");
		c34.setBorderPainted(false);
		c34.setBackground(new Color(160, 82, 45));
		panel_1.add(c34);
		
		JButton c35 = new JButton("c35");
		c35.setBorderPainted(false);
		c35.setBackground(Color.WHITE);
		panel_1.add(c35);
		
		JButton c36 = new JButton("c36");
		c36.setBorderPainted(false);
		c36.setBackground(new Color(160, 82, 45));
		panel_1.add(c36);
		
		JButton c37 = new JButton("c37");
		c37.setBorderPainted(false);
		c37.setBackground(Color.WHITE);
		panel_1.add(c37);
		
		JButton c38 = new JButton("c38");
		c38.setBorderPainted(false);
		c38.setBackground(new Color(160, 82, 45));
		panel_1.add(c38);
		
		JButton c39 = new JButton("c39");
		c39.setBorderPainted(false);
		c39.setBackground(Color.WHITE);
		panel_1.add(c39);
		
		JButton c40 = new JButton("c40");
		c40.setBorderPainted(false);
		c40.setBackground(Color.WHITE);
		panel_1.add(c40);
		
		JButton c41 = new JButton("c41");
		c41.setBorderPainted(false);
		c41.setBackground(new Color(160, 82, 45));
		panel_1.add(c41);
		
		JButton c42 = new JButton("c42");
		c42.setBorderPainted(false);
		c42.setBackground(Color.WHITE);
		panel_1.add(c42);
		
		JButton c43 = new JButton("c43");
		c43.setBorderPainted(false);
		c43.setBackground(new Color(160, 82, 45));
		panel_1.add(c43);
		
		JButton c44 = new JButton("c44");
		c44.setBorderPainted(false);
		c44.setBackground(Color.WHITE);
		panel_1.add(c44);
		
		JButton c45 = new JButton("c45");
		c45.setBorderPainted(false);
		c45.setBackground(new Color(160, 82, 45));
		panel_1.add(c45);
		
		JButton c46 = new JButton("c46");
		c46.setBorderPainted(false);
		c46.setBackground(Color.WHITE);
		panel_1.add(c46);
		
		JButton c47 = new JButton("c47");
		c47.setBorderPainted(false);
		c47.setBackground(new Color(160, 82, 45));
		panel_1.add(c47);
		
		JButton c48 = new JButton("c48");
		c48.setBorderPainted(false);
		c48.setBackground(new Color(160, 82, 45));
		panel_1.add(c48);
		
		JButton c49 = new JButton("c49");
		c49.setBorderPainted(false);
		c49.setBackground(Color.WHITE);
		panel_1.add(c49);
		
		JButton c50 = new JButton("c50");
		c50.setBorderPainted(false);
		c50.setBackground(new Color(160, 82, 45));
		panel_1.add(c50);
		
		JButton c51 = new JButton("c51");
		c51.setBorderPainted(false);
		c51.setBackground(Color.WHITE);
		panel_1.add(c51);
		
		JButton c52 = new JButton("c52");
		c52.setBorderPainted(false);
		c52.setBackground(new Color(160, 82, 45));
		panel_1.add(c52);
		
		JButton c53 = new JButton("c53");
		c53.setBorderPainted(false);
		c53.setBackground(Color.WHITE);
		panel_1.add(c53);
		
		JButton c54 = new JButton("c54");
		c54.setBorderPainted(false);
		c54.setBackground(new Color(160, 82, 45));
		panel_1.add(c54);
		
		JButton c55 = new JButton("c55");
		c55.setBorderPainted(false);
		c55.setBackground(Color.WHITE);
		panel_1.add(c55);
		
		JButton c56 = new JButton("c56");
		c56.setBorderPainted(false);
		c56.setBackground(Color.WHITE);
		panel_1.add(c56);
		
		JButton c57 = new JButton("c57");
		c57.setBorderPainted(false);
		c57.setBackground(new Color(160, 82, 45));
		panel_1.add(c57);
		
		JButton c58 = new JButton("c58");
		c58.setBorderPainted(false);
		c58.setBackground(Color.WHITE);
		panel_1.add(c58);
		
		JButton c59 = new JButton("c59");
		c59.setBorderPainted(false);
		c59.setBackground(new Color(160, 82, 45));
		panel_1.add(c59);
		
		JButton c60 = new JButton("c60");
		c60.setBorderPainted(false);
		c60.setBackground(Color.WHITE);
		panel_1.add(c60);
		
		JButton c61 = new JButton("c61");
		c61.setBorderPainted(false);
		c61.setBackground(new Color(160, 82, 45));
		panel_1.add(c61);
		
		JButton c62 = new JButton("c62");
		c62.setBorderPainted(false);
		c62.setBackground(Color.WHITE);
		panel_1.add(c62);
		
		JButton c63 = new JButton("c63");
		c63.setBorderPainted(false);
		c63.setBackground(new Color(160, 82, 45));
		panel_1.add(c63);
	}
}
