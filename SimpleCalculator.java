import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.desktop.ScreenSleepEvent;

public class SimpleCalculator implements ActionListener {
	
	JTextField textField1,textField2,textField3;
	JButton jButton1,jButton2,jButton3,jButton4;
	
	 SimpleCalculator(){
		 
		 JFrame frame = new JFrame("Simple Calculator");
		 JLabel textlabel = new JLabel("Habibullah Asif(Facebook ID - Asif10h)",SwingConstants.CENTER);
		 
		 textField1 = new JTextField();
		 textField1.setBounds(150,150,100,20);
		 textField2 = new JTextField();
		 textField2.setBounds(150,200,100,20);
		 textField3 = new JTextField();
		 textField3.setBounds(150,250,100,20);
		 textField3.setEditable(false);
		 
		 jButton1 = new JButton("+");
		 jButton1.setBounds(70,300,60,20);
		 jButton2 = new JButton("-");
		 jButton2.setBounds(140,300,60,20);
		 jButton3 = new JButton("*");
		 jButton3.setBounds(210,300,60,20);
		 jButton4 = new JButton("/");
		 jButton4.setBounds(280,300,60,20);
		 
		 frame.add(textField1);
		 frame.add(textField2);
		 frame.add(textField3);
		 frame.add(jButton1);
         frame.add(jButton2);
         frame.add(jButton3);
         frame.add(jButton4);
         
		 textlabel.setPreferredSize(new Dimension(400,200));
		 frame.getContentPane().add(textlabel,BorderLayout.CENTER);
		 frame.setLocationRelativeTo(null);
		 frame.pack();
		 frame.setBounds(0,0,frame.WIDTH,frame.HEIGHT);
		 frame.setSize(500,500);
		 frame.setLayout(null);
		 frame.setVisible(true);
		 
		 jButton1.addActionListener(this);
		 jButton2.addActionListener(this);
		 jButton3.addActionListener(this);
		 jButton4.addActionListener(this);
	 }
	 @Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		 String string1 = textField1.getText();
		 String string2 = textField2.getText();
		 double anyNumber1 = Double.parseDouble(string1);
		 double anyNumber2 = Double.parseDouble(string2);
		 
		 double anotherNumber = 0d;
		 if(e.getSource()==jButton1) {
			 anotherNumber = anyNumber1 + anyNumber2;
		 }
		 else if(e.getSource()==jButton2) {
			 anotherNumber = anyNumber1 - anyNumber2;
		 }
		 else if(e.getSource()==jButton3) {
			 anotherNumber = anyNumber1 * anyNumber2;
		 }
		 else if(e.getSource()==jButton4) {
			 anotherNumber = anyNumber1 / anyNumber2;
					 
		 }
		 String result =  String.valueOf(anotherNumber);
		 textField3.setText(result);
		 
 		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new  SimpleCalculator();
	}
}
