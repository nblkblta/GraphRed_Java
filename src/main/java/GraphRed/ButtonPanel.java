package GraphRed;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import Buttons.EllipseButton;
import Buttons.PencilButton;
import Buttons.PolygonButton;
import Buttons.PolylineButton;
import Buttons.RectButton;
import Buttons.RefreshButton;

@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
	private int buttonSize = 40;
	ButtonPanel(Dimension dim,Query query){
		super();
		this.setBounds(0, 0, dim.width, 40);
		this.setBackground(Color.black);
		this.add(BorderLayout.WEST,new RectButton(buttonSize,query));
		this.add(BorderLayout.SOUTH,new EllipseButton(buttonSize,query));
		this.add(BorderLayout.SOUTH,new PolylineButton(buttonSize,query));
		this.add(BorderLayout.SOUTH,new PolygonButton(buttonSize,query));
		this.add(BorderLayout.SOUTH,new PencilButton(buttonSize,query));
		this.add(BorderLayout.SOUTH,new RefreshButton(buttonSize,query));
	}
}
