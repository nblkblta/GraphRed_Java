package GraphRed;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import ColorButtons.AppleColorButton;
import ColorButtons.BlackColorButton;
import ColorButtons.BlueColorButton;
import ColorButtons.BrownColorButton;
import ColorButtons.CyanColorButton;
import ColorButtons.DarkgreenColorButton;
import ColorButtons.GrayColorButton;
import ColorButtons.GreenColorButton;
import ColorButtons.MagentaColorButton;
import ColorButtons.OrangeColorButton;
import ColorButtons.OrangeredColorButton;
import ColorButtons.PinkColorButton;
import ColorButtons.PurpleColorButton;
import ColorButtons.RedColorButton;
import ColorButtons.SeaColorButton;
import ColorButtons.SkyColorButton;
import ColorButtons.SteelColorButton;
import ColorButtons.VioletColorButton;
import ColorButtons.WhiteColorButton;
import ColorButtons.YellowColorButton;

@SuppressWarnings("serial")
public class ColorButtonPanel extends JPanel{
	private int buttonSize = 40;
	ColorButtonPanel(Dimension dim,Query query, int buttonSize){
		super();
		this.buttonSize = buttonSize;
		this.setBounds(0, buttonSize, dim.width, buttonSize);
		this.setBackground(Color.black);
		
		this.add(BorderLayout.WEST,new VioletColorButton(query));
		this.add(BorderLayout.WEST,new PurpleColorButton(query));
		this.add(BorderLayout.WEST,new PinkColorButton(query));
		this.add(BorderLayout.WEST,new MagentaColorButton(query));
		this.add(BorderLayout.WEST,new RedColorButton(query));
		this.add(BorderLayout.WEST,new BrownColorButton(query));
		this.add(BorderLayout.WEST,new OrangeredColorButton(query));
		this.add(BorderLayout.WEST,new OrangeColorButton(query));
		this.add(BorderLayout.WEST,new YellowColorButton(query));
		this.add(BorderLayout.WEST,new AppleColorButton(query));
		this.add(BorderLayout.WEST,new GreenColorButton(query));
		this.add(BorderLayout.WEST,new DarkgreenColorButton(query));
		this.add(BorderLayout.WEST,new SeaColorButton(query));
		this.add(BorderLayout.WEST,new CyanColorButton(query));
		this.add(BorderLayout.WEST,new SkyColorButton(query));
		this.add(BorderLayout.WEST,new SteelColorButton(query));
		this.add(BorderLayout.WEST,new BlueColorButton(query));
		this.add(BorderLayout.WEST,new BlackColorButton(query));
		this.add(BorderLayout.WEST,new GrayColorButton(query));
		this.add(BorderLayout.WEST,new WhiteColorButton(query));
	}
}

