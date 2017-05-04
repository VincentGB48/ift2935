import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateUserFrame extends JFrame {

	private JPanel contentPane;
	private JTextField locaionField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public CreateUserFrame(CreateUserFrame createframe) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton createBtn = new JButton("Create");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, createBtn, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, createBtn, -10, SpringLayout.EAST, contentPane);
		contentPane.add(createBtn);
		
		JButton cancelBtn = new JButton("cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createframe.setVisible(false);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, cancelBtn, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, cancelBtn, 0, SpringLayout.SOUTH, createBtn);
		contentPane.add(cancelBtn);
		
		locaionField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, locaionField, -6, SpringLayout.NORTH, createBtn);
		sl_contentPane.putConstraint(SpringLayout.EAST, locaionField, 0, SpringLayout.EAST, createBtn);
		contentPane.add(locaionField);
		locaionField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_1, -6, SpringLayout.NORTH, locaionField);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, createBtn);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_2, -10, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, createBtn);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_3, -8, SpringLayout.NORTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, createBtn);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblId = new JLabel("id");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblId, 0, SpringLayout.NORTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblId, -6, SpringLayout.WEST, textField_3);
		contentPane.add(lblId);
		
		JLabel lblNom = new JLabel("nom");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNom, 0, SpringLayout.NORTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNom, -6, SpringLayout.WEST, textField_2);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("prenom");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPrenom, 0, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblPrenom, -6, SpringLayout.WEST, textField_1);
		contentPane.add(lblPrenom);
		
		JLabel lblLocation = new JLabel("location");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblLocation, 0, SpringLayout.NORTH, locaionField);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblLocation, -3, SpringLayout.WEST, locaionField);
		contentPane.add(lblLocation);
	}


}
