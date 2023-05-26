package kmsils;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class frizior extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frizior frame = new frizior();
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
	public frizior() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Student\\Desktop\\ilsa\\R (8).jpg"));
		setType(Type.POPUP);
		setTitle("\u0424\u0440\u0438\u0437\u0438\u043E\u0440\u0441\u043A\u0438 \u0441\u0430\u043B\u043E\u043D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 568);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbk = new JLabel("");
		lbk.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lbk.setBounds(151, 390, 151, 81);
		contentPane.add(lbk);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 27, 357, 109);
		panel.setForeground(new Color(178, 34, 34));
		panel.setBackground(new Color(253, 245, 230));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u041F\u043E\u0434\u0441\u0442\u0440\u0438\u0433\u0432\u0430\u043D\u0435", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 205)));
		panel.setToolTipText("");
		contentPane.add(panel);
		
		JRadioButton j1 = new JRadioButton("\u0414\u0430\u043C\u0441\u043A\u043E");
		buttonGroup.add(j1);
		j1.setBackground(new Color(253, 245, 230));
		j1.setForeground(new Color(218, 112, 214));
		j1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JRadioButton m1 = new JRadioButton("\u041C\u044A\u0436\u043A\u043E");
		buttonGroup.add(m1);
		m1.setBackground(new Color(253, 245, 230));
		m1.setForeground(new Color(0, 0, 139));
		m1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(34)
					.addComponent(j1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(m1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(j1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(m1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 162, 357, 109);
		panel_1.setToolTipText("");
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0414\u044A\u043B\u0436\u0438\u043D\u0430 \u043D\u0430 \u043A\u043E\u0441\u0430\u0442\u0430", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 205)));
		panel_1.setBackground(new Color(253, 245, 230));
		contentPane.add(panel_1);
		
		JRadioButton d2 = new JRadioButton("\u0414\u044A\u043B\u0433\u043E");
		buttonGroup_1.add(d2);
		d2.setForeground(new Color(0, 0, 139));
		d2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		d2.setBackground(new Color(253, 245, 230));
		
		JRadioButton k2 = new JRadioButton("\u041A\u044A\u0441\u043E");
		buttonGroup_1.add(k2);
		k2.setForeground(new Color(0, 0, 139));
		k2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		k2.setBackground(new Color(253, 245, 230));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(38)
					.addComponent(d2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(k2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(d2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(k2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1.setLayout(gl_panel_1);
		
		JCheckBox b3 = new JCheckBox("\u0411\u043E\u044F\u0434\u0438\u0441\u0432\u0430\u043D\u0435");
		//buttonGroup_2.add(chckbxNewCheckBox);
		b3.setBounds(20, 304, 97, 23);
		b3.setBackground(new Color(176, 224, 230));
		b3.setForeground(new Color(0, 0, 128));
		b3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(b3);
		
		JCheckBox i3 = new JCheckBox("\u0418\u0437\u043C\u0438\u0432\u0430\u043D\u0435");
		//buttonGroup_2.add(chckbxNewCheckBox_1);
		i3.setBounds(20, 345, 97, 23);
		i3.setBackground(new Color(240, 255, 255));
		i3.setForeground(new Color(0, 0, 128));
		i3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(i3);
		
		JCheckBox s3 = new JCheckBox("\u0421\u0443\u0448\u0435\u043D\u0435");
		//buttonGroup_2.add(chckbxNewCheckBox_2);
		s3.setBounds(20, 386, 97, 23);
		s3.setForeground(new Color(0, 0, 128));
		s3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(s3);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Student\\Desktop\\ilsa\\87654213.png"));
		lblNewLabel.setBounds(98, 319, 290, 210);
		contentPane.add(lblNewLabel);
		lblNewLabel.setVisible(false);
				
		JButton btnNewButton = new JButton("\u041F\u0440\u0435\u0441\u043C\u0435\u0442\u043D\u0438");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c = 0;
				
				if (j1.isSelected() ==true) c=c+10;
				else if (m1.isSelected()==true)c=+5;
				
				if (d2.isSelected() ==true) c=+7;
				else if (k2.isSelected()==true)c=+5;
				
				if (i3.isSelected() ==true) c=+10;
				 if (s3.isSelected()==true)c=+10;
				 if (b3.isSelected() ==true) c=+20;
				
				String g = Integer.toString(c);
				
				lblNewLabel.setVisible(true);lbk.setText(g+" лв.");
			}
		});
		btnNewButton.setBackground(new Color(240, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(10, 447, 107, 33);
		contentPane.add(btnNewButton);
		
		
	}
}
