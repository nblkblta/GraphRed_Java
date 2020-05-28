package GraphRed;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import Buttons.EllipseButton;
import Buttons.PolygonButton;
import Buttons.PolylineButton;
import Buttons.RectButton;
import ColorButtons.BlackColorButton;
import ColorButtons.BlueColorButton;
import ColorButtons.GreenColorButton;
import ColorButtons.RedColorButton;
import ColorButtons.WhiteColorButton;
import ColorButtons.YellowColorButton;

public class ColorButtonPanel extends JPanel{
	private int buttonSize = 40;
	ColorButtonPanel(Dimension dim,Query query){
		super();
		this.setBounds(0, 40, dim.width, 40);
		this.setBackground(Color.black);
		this.add(BorderLayout.WEST,new RedColorButton(query));
		this.add(BorderLayout.WEST,new BlueColorButton(query));
		this.add(BorderLayout.WEST,new GreenColorButton(query));
		this.add(BorderLayout.WEST,new WhiteColorButton(query));
		this.add(BorderLayout.WEST,new BlackColorButton(query));
		this.add(BorderLayout.WEST,new YellowColorButton(query));
	}
}

