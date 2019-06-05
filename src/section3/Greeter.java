package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Type Name Here");
				System.out.println(name);
		JOptionPane.showMessageDialog(null, "Hi "+ name + "! How are you?");
		
		
	}

}
