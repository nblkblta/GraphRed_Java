package GraphRed;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import Buttons.EllipseButton;
import Buttons.PolygonButton;
import Buttons.PolylineButton;
import Buttons.RectButton;
import ColorButtons.RedColorButton;

public class ColorButtonPanel extends JPanel{
	private int buttonSize = 40;
	ColorButtonPanel(Dimension dim,Query query){
		super();
		this.setBounds(0, 40, dim.width, 40);
		this.setBackground(Color.black);
		this.add(BorderLayout.WEST,new RedColorButton(query));
	}
}

