import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 307, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(10, 24, 270, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.GRAY);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setForeground(Color.BLACK);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(10, 145, 60, 45);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBackground(Color.GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(80, 145, 60, 45);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBackground(Color.GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(150, 145, 60, 45);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBackground(Color.GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBounds(10, 201, 60, 45);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBackground(Color.GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(80, 201, 60, 45);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBackground(Color.GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBounds(150, 201, 60, 45);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBackground(Color.GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setBounds(10, 257, 60, 45);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBackground(Color.GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(80, 257, 60, 45);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBackground(Color.GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBounds(150, 257, 60, 45);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.WHITE);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBackground(Color.DARK_GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBounds(80, 313, 60, 45);
		frame.getContentPane().add(btn0);
		
		JButton btnP = new JButton("+");
		btnP.setForeground(Color.WHITE);
		btnP.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnP.setBackground(Color.DARK_GRAY);
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnP.setBounds(220, 257, 60, 45);
		frame.getContentPane().add(btnP);
		
		JButton btnM = new JButton("-");
		btnM.setForeground(Color.WHITE);
		btnM.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnM.setBackground(Color.DARK_GRAY);
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnM.setBounds(220, 201, 60, 45);
		frame.getContentPane().add(btnM);
		
		JButton btnX = new JButton("x");
		btnX.setForeground(Color.WHITE);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnX.setBackground(Color.DARK_GRAY);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "x";
			}
		});
		btnX.setBounds(220, 145, 60, 45);
		frame.getContentPane().add(btnX);
		
		JButton btnD = new JButton("/");
		btnD.setForeground(Color.WHITE);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnD.setBackground(Color.DARK_GRAY);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnD.setBounds(220, 89, 60, 45);
		frame.getContentPane().add(btnD);
		
		JButton btnPM = new JButton("±");
		btnPM.setForeground(Color.WHITE);
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPM.setBackground(Color.DARK_GRAY);
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setBounds(10, 313, 60, 45);
		frame.getContentPane().add(btnPM);
		
		JButton btnDot = new JButton(".");
		btnDot.setForeground(Color.WHITE);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBackground(Color.DARK_GRAY);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setBounds(150, 313, 60, 45);
		frame.getContentPane().add(btnDot);
		
		JButton btnE = new JButton("=");
		btnE.setForeground(Color.WHITE);
		btnE.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnE.setBackground(new Color(178, 34, 34));
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondNum = Double.parseDouble(textField.getText());
				
				// mathematical operations
				if (operations == "+")
				{
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					answer = answer.replaceAll(",",".");
					textField.setText(answer);	
				}
				else if (operations == "-")
				{
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					answer = answer.replaceAll(",",".");
					textField.setText(answer);	
				}
				else if (operations == "x")
				{
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					answer = answer.replaceAll(",",".");
					textField.setText(answer);	
				}
				else if (operations == "/")
				{
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					answer = answer.replaceAll(",",".");
					textField.setText(answer);	
				}
				else if (operations == "%")
				{
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					answer = answer.replaceAll(",",".");
					textField.setText(answer);	
				}

			}
		});
		btnE.setBounds(220, 313, 60, 45);
		frame.getContentPane().add(btnE);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(Color.WHITE);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnC.setBackground(Color.DARK_GRAY);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(80, 89, 60, 45);
		frame.getContentPane().add(btnC);
		
		JButton btnCE = new JButton("CE");
		btnCE.setForeground(Color.WHITE);
		btnCE.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCE.setBackground(Color.DARK_GRAY);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnCE = null;
				if(textField.getText().length() > 0){
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					btnCE = strB.toString();
					textField.setText(btnCE);
				}
			}
		});
		btnCE.setBounds(10, 89, 60, 45);
		frame.getContentPane().add(btnCE);
		
		JButton btnPe = new JButton("%");
		btnPe.setForeground(Color.WHITE);
		btnPe.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPe.setBackground(Color.DARK_GRAY);
		btnPe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPe.setBounds(150, 89, 60, 45);
		frame.getContentPane().add(btnPe);
	}
}
