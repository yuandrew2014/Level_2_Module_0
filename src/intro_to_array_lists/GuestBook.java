package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.a();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		if(e.getSource() == b1) {
			String andrew = JOptionPane.showInputDialog("enter a name");
			names.add(andrew);	
			
		}if(e.getSource() == b1) {
			
		}
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	
	JButton b1 = new JButton();
	void a() {
		
	JFrame f1 = new JFrame();
	f1.setVisible(true);
	
	JPanel p1 = new JPanel();
	p1.setVisible(true);
	JButton b1 = new JButton();
	b1.setVisible(true);
	b1.setText("add name");
	JButton  b2 = new JButton();
	b2.setVisible(true);
	b2.setText("view names");
	f1.add(p1);
	p1.add(b1);
	p1.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	f1.pack();
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add

	//@Override
	
	
	
	
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	
	
	// all the names added to the list. Format the list as follows:
	
	
	// Guest #1: Bob Banders
	
	
	// Guest #2: Sandy Summers
	
	
	// Guest #3: Greg Ganders
	
	
	// Guest #4: Donny Doners
}
