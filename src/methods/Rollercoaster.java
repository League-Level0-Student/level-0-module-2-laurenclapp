package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
				String answer= 
						JOptionPane.showInputDialog(null, "how many inches tall are you?");
int answer2 = Integer.parseInt(answer);
if( answer2 > 48) { JOptionPane.showMessageDialog(null, "You are tall enough! Good job at being tall");
}
else { JOptionPane.showMessageDialog(null, "you are not tall enough! Go grow and don't waist my time! i mean COME ON!!!! Did you NOT see the sign");
}

}}