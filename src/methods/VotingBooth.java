package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String answer= 
			JOptionPane.showInputDialog(null, "how old are you?");
int answer2 = Integer.parseInt(answer);
if( answer2 >= 18) { JOptionPane.showInputDialog(null, "who do you want for president");
}
else { JOptionPane.showMessageDialog(null, "no one cares what you think -_-");
}

}
}

