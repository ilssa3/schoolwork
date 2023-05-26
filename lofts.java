package kmsils;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;

public class opabaca extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					opabaca frame = new opabaca();
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
	public opabaca() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Student\\Desktop\\ilsa\\R (6).jpg"));
		setTitle("Create peace");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 128));
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(193, 193, 225));
		panel_2.setBounds(53, 25, 333, 63);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0410\u0413\u0415\u041D\u0426\u0418\u042F \u0417\u0410 \u041D\u0415\u0414\u0412\u0418\u0416\u0418\u041C\u0418 \u0418\u041C\u041E\u0422\u0418");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		lblNewLabel.setBounds(23, 11, 284, 27);
		panel_2.add(lblNewLabel);
		
		JLabel lblcreatePeace = new JLabel("\"CREATE PEACE\" ");
		lblcreatePeace.setBackground(new Color(193, 193, 225));
		lblcreatePeace.setHorizontalAlignment(SwingConstants.CENTER);
		lblcreatePeace.setForeground(Color.DARK_GRAY);
		lblcreatePeace.setFont(new Font("Sitka Subheading", Font.BOLD, 21));
		lblcreatePeace.setBounds(23, 22, 284, 41);
		panel_2.add(lblcreatePeace);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 255));
		panel.setBounds(-83, -13, 287, 82);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(308, 43, 321, 71);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u0412\u0438\u0434 \u0438\u043C\u043E\u0442:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 17));
		lblNewLabel_1.setBounds(10, 142, 100, 36);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u0412\u0438\u043B\u0430", "\u0410\u043F\u0430\u0440\u0442\u0430\u043C\u0435\u043D\u0442", "\u041A\u044A\u0449\u0430", "\u041E\u0444\u0438\u0441"}));
		comboBox.setFont(new Font("Sitka Subheading", Font.ITALIC, 16));
		comboBox.setBounds(114, 147, 210, 26);
		contentPane.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(193, 193, 225));
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0411\u0440\u043E\u0439 \u0441\u0442\u0430\u0438", TitledBorder.RIGHT, TitledBorder.TOP, null, Color.BLACK));
		panel_3.setBounds(57, 209, 178, 145);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton rb1 = new JRadioButton("1");
		buttonGroup.add(rb1);
		rb1.setBackground(new Color(193, 193, 225));
		rb1.setForeground(Color.BLACK);
		rb1.setHorizontalAlignment(SwingConstants.CENTER);
		rb1.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		rb1.setBounds(17, 25, 63, 31);
		panel_3.add(rb1);
		
		JRadioButton rb3 = new JRadioButton("3");
		buttonGroup.add(rb3);
		rb3.setBackground(new Color(193, 193, 225));
		rb3.setHorizontalAlignment(SwingConstants.CENTER);
		rb3.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		rb3.setBounds(17, 85, 63, 31);
		panel_3.add(rb3);
		
		JRadioButton rb2 = new JRadioButton("2");
		buttonGroup.add(rb2);
		rb2.setBackground(new Color(193, 193, 225));
		rb2.setHorizontalAlignment(SwingConstants.CENTER);
		rb2.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		rb2.setBounds(97, 25, 63, 31);
		panel_3.add(rb2);
		
		JRadioButton br4 = new JRadioButton("4");
		buttonGroup.add(br4);
		br4.setBackground(new Color(193, 193, 225));
		br4.setHorizontalAlignment(SwingConstants.CENTER);
		br4.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		br4.setBounds(97, 85, 63, 31);
		panel_3.add(br4);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(193, 193, 225));
		panel_3_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0415\u043A\u0441\u0442\u0440\u0438", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3_1.setBounds(292, 209, 178, 145);
		contentPane.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JCheckBox cb1 = new JCheckBox("\u043E\u0442\u043E\u043F\u043B\u0435\u043D\u0438\u0435");
		cb1.setBackground(new Color(193, 193, 225));
		cb1.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		cb1.setBounds(17, 16, 142, 23);
		panel_3_1.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("\u0433\u0430\u0440\u0430\u0436");
		cb2.setBackground(new Color(193, 193, 225));
		cb2.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		cb2.setBounds(17, 49, 142, 23);
		panel_3_1.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("\u043A\u043B\u0438\u043C\u0430\u0442\u0438\u043A");
		cb3.setBackground(new Color(193, 193, 225));
		cb3.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		cb3.setBounds(17, 82, 142, 23);
		panel_3_1.add(cb3);
		
		JCheckBox cb4 = new JCheckBox("\u043D\u043E\u0432\u043E");
		cb4.setBackground(new Color(193, 193, 225));
		cb4.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		cb4.setBounds(17, 115, 142, 23);
		panel_3_1.add(cb4);
		
		JButton btnNewButton = new JButton("\u0417\u0430\u044F\u0432\u043A\u0430");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String b = ""; 
			String h ="";
			
			String j =(String) comboBox.getSelectedItem();
				if(rb1.isSelected()) b=("1 стая");
				if(rb2.isSelected()) b=("2 стаи");
				if(rb3.isSelected()) b=("3 стаи");
				if(br4.isSelected()) b=("4 стаи");
				
				if(cb1.isSelected()) h+=("отопление; ");
				if(cb2.isSelected()) h+=("гараж; ");
				if(cb3.isSelected()) h+=("климатик; ");
				if(cb4.isSelected()) h+=("ново");
				
				JOptionPane.showMessageDialog(null,"Избрано: "+j+"; "+b+". Екстри: "+h, "Резервация", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(193, 193, 225));
		btnNewButton.setBounds(100, 387, 114, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0418\u0437\u0445\u043E\u0434");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  System.exit(0);
			
			}
		});
		btnNewButton_1.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		btnNewButton_1.setBackground(new Color(193, 193, 225));
		btnNewButton_1.setBounds(314, 387, 114, 36);
		contentPane.add(btnNewButton_1);
	}
}
