package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	int l = 0;
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.a();
		
	}
	
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	
	JButton b1 = new JButton();
	JButton  b2 = new JButton();
	void a() {
		
	JFrame f1 = new JFrame();
	f1.setVisible(true);
	
	JPanel p1 = new JPanel();
	p1.setVisible(true);
	
	b1.setVisible(true);
	b1.setText("add name");
	
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
	ArrayList<String> names = new ArrayList<String>();
	@Override
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == b1) {
			System.out.println("pressed");
			String andrew = JOptionPane.showInputDialog("enter a name");
			names.add(andrew);	
			
			
		} else if(e.getSource() == b2) {
			String s = "";
			for (int i = 0; i < names.size(); i++) {
				
			
			s += "Guest #" + (i+1) + ":" + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, s);
		}
		
	//@Override
	
	
	
	
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	
	
	// all the names added to the list. Format the list as follows:
	
	
	// Guest #1: Bob Banders
	
	
	// Guest #2: Sandy Summers
	
	
	// Guest #3: Greg Ganders
	
	
	// Guest #4: Donny Doners
}
	}
