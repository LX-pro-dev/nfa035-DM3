import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class suiteRecursif extends JPanel implements ActionListener{
	JLabel instructions;
	JTextField entier;
	JLabel sortie;
	
	suiteRecursif(){
		instructions=new JLabel("Donner un entier positif :");
		instructions.setFont(new Font(null,0,18));
		entier= new JTextField(3);
		entier.addActionListener(this);
		sortie=new JLabel();
		sortie.setFont(new Font(null,2,18));
		add(instructions);
		add(entier);
		add(sortie);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		int n=Integer.parseInt(entier.getText());
		double result= calculSuiteRecursif(n);
		
		sortie.setText("\nle calcul vaut : "+result);
		
	}
	public static double calculSuiteRecursif(int n) {
		double result;
		if(n==0) result=3;
		else if(n==1) result=2;
		else {
			result=calculSuiteRecursif(n-1)/(1+(4*calculSuiteRecursif(n-2)));;
		}
		return result;
	}
	
}
