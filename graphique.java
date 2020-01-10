import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class graphique {
	public static void main(String[]args) {
		JFrame cadre=new JFrame();
		cadre.setSize(400,130);
		cadre.setLocation(200,200);
		cadre.setTitle("DM3");
		cadre.getContentPane().add(new suiteRecursif());
		cadre.setVisible(true);
		cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
