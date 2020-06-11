package solution;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

import model.Model;
import model.Settings;
import view.GraphRed;

public class Solution {
	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
		int buttonSize = 40;
		int panelCount = 2;
		Settings settings  = new Settings(screenSize, buttonSize, panelCount);
		Model model = new Model(settings);
		EventQueue.invokeLater(() ->
		{
		GraphRed gr = new GraphRed(model,settings);
		gr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		model.addObserver(gr);
		});
	}
}
