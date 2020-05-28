package GraphRed;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;


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
		this.add(BorderLayout.WEST,new RedColorButton(query));
		this.add(BorderLayout.WEST,new BlueColorButton(query));
		this.add(BorderLayout.WEST,new GreenColorButton(query));
		this.add(BorderLayout.WEST,new WhiteColorButton(query));
		this.add(BorderLayout.WEST,new BlackColorButton(query));
		this.add(BorderLayout.WEST,new YellowColorButton(query));
	}
}

