import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class WindowBD {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBD window = new WindowBD();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowBD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 688, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 84, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 121, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 305, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 420, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton button = new JButton("LogIn");
		sl_panel.putConstraint(SpringLayout.NORTH, button, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, button, 0, SpringLayout.WEST, panel);
		panel.add(button);
		
		JButton button_1 = new JButton("create");
		sl_panel.putConstraint(SpringLayout.NORTH, button_1, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, button_1, 0, SpringLayout.WEST, panel);
		panel.add(button_1);
		
		textField = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, panel);
		textField.setText("ID");
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel label = new JLabel("Connection");
		sl_panel.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, panel);
		panel.add(label);
	}

}
