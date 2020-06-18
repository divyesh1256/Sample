import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class caclulator {

	private JFrame frame;
	private JTextField t1;
	double fnum;
	double snum;
	double res;
	String op;
	private Object math;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					caclulator window = new caclulator();
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
	public caclulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 489, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(true);
		frame.setTitle("Scientific Calculator");
		
		t1 = new JTextField();
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE)))
				{
					
					e.consume();
				}
				
			}
		});
		t1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		t1.setHorizontalAlignment(SwingConstants.RIGHT);
		t1.setText("0");
		t1.setBounds(9, 10, 461, 52);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton button = new JButton("9");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=t1.getText()+button.getText();
				t1.setText(i);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 19));
		button.setBounds(172, 167, 71, 66);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(t1.getText());
				t1.setText(null);
				op=("-");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_1.setBounds(253, 167, 71, 66);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=t1.getText()+button_2.getText();
				t1.setText(i);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_2.setBounds(10, 243, 71, 66);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=t1.getText()+button_3.getText();
				t1.setText(i);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_3.setBounds(91, 243, 71, 66);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=t1.getText()+button_4.getText();
				t1.setText(i);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_4.setBounds(172, 243, 71, 66);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("*");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(t1.getText());
				t1.setText(null);
				op=("*");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_5.setBounds(253, 243, 71, 66);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("/");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(t1.getText());
				t1.setText(null);
				op=("/");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_6.setBounds(253, 319, 71, 66);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=t1.getText()+button_7.getText();
				t1.setText(i);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_7.setBounds(172, 321, 71, 66);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String i=t1.getText()+button_8.getText();
				t1.setText(i);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_8.setBounds(91, 321, 71, 66);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=t1.getText()+button_9.getText();
				t1.setText(i);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_9.setBounds(10, 321, 71, 66);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=t1.getText()+button_10.getText();
				t1.setText(i);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_10.setBounds(10, 397, 71, 66);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton(".");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!t1.getText().contains("."))
				{
					t1.setText(t1.getText() + button_11.getText() );
				}
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_11.setBounds(91, 397, 71, 66);
		frame.getContentPane().add(button_11);
		
		JButton btnOff = new JButton("OFF");
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(" ");
				t1.setEnabled(false);
			}
		});
		btnOff.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnOff.setBounds(172, 397, 71, 66);
		frame.getContentPane().add(btnOff);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				snum=Double.parseDouble(t1.getText());
				if(op=="+")
				{
					res=fnum+snum;
					ans=String.format("%.2f", res);
					t1.setText(ans);				
					}
				else if(op=="-")
				{
					res=fnum-snum;
					ans=String.format("%.2f", res);
					t1.setText(ans);				
					}
				else if(op=="*")
				{
					res=fnum*snum;
					ans=String.format("%.2f", res);
					t1.setText(ans);				
					}
				else if(op=="/")
				{
					res=fnum/snum;
					ans=String.format("%.2f", res);
					t1.setText(ans);				
					}
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_13.setBounds(253, 395, 72, 66);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("8");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=t1.getText()+button_14.getText();
				t1.setText(i);
				
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_14.setBounds(91, 167, 71, 66);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("7");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String i=t1.getText()+button_15.getText();
				t1.setText(i);
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_15.setBounds(10, 167, 71, 66);
		frame.getContentPane().add(button_15);
		
		JButton back = new JButton("\u2190");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bsp=null;
				if(t1.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(t1.getText());
					strB.deleteCharAt(t1.getText().length()-1);
					bsp=strB.toString();
					t1.setText(bsp);
			}}
		});
		back.setFont(new Font("Calibri", Font.BOLD, 19));
		back.setBounds(9, 87, 71, 66);
		frame.getContentPane().add(back);
		
		JButton reset = new JButton("C");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setEnabled(true);
				t1.setText("");
			}
		});
		reset.setFont(new Font("Tahoma", Font.BOLD, 19));
		reset.setBounds(91, 87, 71, 66);
		frame.getContentPane().add(reset);
		
		JButton button_18 = new JButton("\u221A");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops=Double.parseDouble(String.valueOf(t1.getText()));
				ops=Math.sqrt(ops);
				t1.setText(String.valueOf(ops));
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_18.setBounds(172, 87, 71, 66);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("+");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fnum=Double.parseDouble(t1.getText());
				t1.setText(null);
				op=("+");
			}
		});
		button_19.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_19.setBounds(253, 87, 71, 66);
		frame.getContentPane().add(button_19);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(t1.getText()));
				ops=Math.log(ops);
				t1.setText(String.valueOf(ops));
				
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnLog.setBounds(368, 87, 102, 66);
		frame.getContentPane().add(btnLog);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(t1.getText()));
				ops=Math.sin(ops);
				t1.setText(String.valueOf(ops));
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnSin.setBounds(368, 167, 102, 66);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(t1.getText()));
				ops=Math.cos(ops);
				t1.setText(String.valueOf(ops));
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnCos.setBounds(368, 243, 102, 66);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(t1.getText()));
				ops=Math.tan(ops);
				t1.setText(String.valueOf(ops));
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnTan.setBounds(368, 319, 102, 66);
		frame.getContentPane().add(btnTan);
	}
}
