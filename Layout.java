package storyPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Layout {
	JFrame window = new JFrame("Story");
	JTextArea Text =new JTextArea();
	JTextField Input = new JTextField();
	JTextField log = new JTextField();
	String choice;
	private static String c;
	
	public Layout() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1000,1000);
		window.setLayout(null);
		
		Text.setBounds(10,10,965,750);
		window.add(Text);
		
		log.setBounds(0,300,100,20);
		//window.add(log);
		
		Input.setBounds(400,825,100,20);
		Input.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c = Input.getText() ;
			    log.setText(c);
			    Input.setText("");
			}
		});
		window.add(Input);
		window.setVisible(true);
		}
	
	public void set(String a) {
		Text.setText(a);
	}
	public void add(String a) {
		Text.append("\n"+a);
	}
	public void choice() {
		boolean boo=true;
		while (boo) {
			choice = log.getText().toLowerCase();
			if (!choice.equals("") ) {
				choice = c.toLowerCase();
				log.setText("");
				boo = false;
			}
		}
	}
	
}
