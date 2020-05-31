package GraphRed;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import ColorButtons.BaseColorButton;
import ColorButtons.BlackColorButton;
import ColorButtons.BlueColorButton;
import ColorButtons.GreenColorButton;
import ColorButtons.RedColorButton;
import ColorButtons.WhiteColorButton;
import ColorButtons.YellowColorButton;

@SuppressWarnings("serial")
public class ColorButtonPanel extends JPanel{
	private int buttonSize = 40;
	ColorButtonPanel(Dimension dim,Query query){
		super();
		this.setBounds(0, buttonSize, dim.width, buttonSize);
		this.setBackground(Color.black);
		
		BaseColorButton buttonRed = new RedColorButton(query);
		buttonRed.setBackground(buttonRed.getColor());
		this.add(BorderLayout.WEST,buttonRed);
		
		BaseColorButton buttonYell = new YellowColorButton(query);
		buttonYell.setBackground(buttonYell.getColor());
		this.add(BorderLayout.WEST,buttonYell);
		
		BaseColorButton buttonGreen = new GreenColorButton(query);
		buttonGreen.setBackground(buttonGreen.getColor());
		this.add(BorderLayout.WEST,buttonGreen);
		
		BaseColorButton buttonBlue = new BlueColorButton(query);
		buttonBlue.setBackground(buttonBlue.getColor());
		this.add(BorderLayout.WEST,buttonBlue);
		
		BaseColorButton buttonBlack = new BlackColorButton(query);
		buttonBlack.setBackground(buttonBlack.getColor());
		this.add(BorderLayout.WEST,buttonBlack);
		
		BaseColorButton buttonWhite = new WhiteColorButton(query);
		buttonWhite.setBackground(buttonWhite.getColor());
		this.add(BorderLayout.WEST,buttonWhite);
	}
}

