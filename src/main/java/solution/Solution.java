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
		Settings.getSettings().setDimension(screenSize);
		Settings.getSettings().setButtonSize(buttonSize);
		Settings.getSettings().setPanelCount(panelCount);
		EventQueue.invokeLater(() ->
		{
		GraphRed gr = new GraphRed();
		gr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Model.getModel().addObserver(gr);
		});
	}
}
