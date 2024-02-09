import javax.swing.JOptionPane;
public class User {

	public static void main(String[] args) {
	 
		String name = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		
	}

}
