package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynumbers {
	public static void main(String[] args) {
		int r;
		String message="";
		
		
		
		Random rand = new Random();
	for (int i = 0; i < 5.; i++) {
		r= rand.nextInt(60)+1;	
		message +=" ";
		message += r;
		
			
		
	}
	JOptionPane.showMessageDialog(null, message);	
	}

}
