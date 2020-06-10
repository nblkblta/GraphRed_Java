package GraphRed;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Solution {
	public static void main(String[] args) {
		int buttonSize = 40;
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); 
		Settings settings  = new Settings(screenSize,buttonSize);
		Model model = new Model(settings);
		EventQueue.invokeLater(() ->
		{
		GraphRed gr = new GraphRed(model,settings);
		gr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		model.addObserver(gr);
		});
	}
}
