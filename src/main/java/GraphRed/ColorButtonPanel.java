package GraphRed;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import ColorButtons.AppleColorButton;
import ColorButtons.BaseColorButton;
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
	ColorButtonPanel(Dimension dim,Query query){
		super();
		//
		this.setBounds(0, buttonSize, dim.width, buttonSize);
		this.setBackground(Color.black);
		
		BaseColorButton buttonVi = new VioletColorButton(query);
		buttonVi.setBackground(buttonVi.getColor());
		this.add(BorderLayout.WEST,buttonVi);
		
		BaseColorButton buttonPurp = new PurpleColorButton(query);
		buttonPurp.setBackground(buttonPurp.getColor());
		this.add(BorderLayout.WEST,buttonPurp);
		
		BaseColorButton buttonPink = new PinkColorButton(query);
		buttonPink.setBackground(buttonPink.getColor());
		this.add(BorderLayout.WEST,buttonPink);
		
		BaseColorButton buttonMag = new MagentaColorButton(query);
		buttonMag.setBackground(buttonMag.getColor());
		this.add(BorderLayout.WEST,buttonMag);
		
		BaseColorButton buttonRed = new RedColorButton(query);
		buttonRed.setBackground(buttonRed.getColor());
		this.add(BorderLayout.WEST,buttonRed);
		
		BaseColorButton buttonBrown = new BrownColorButton(query);
		buttonBrown.setBackground(buttonBrown.getColor());
		this.add(BorderLayout.WEST,buttonBrown);
		
		BaseColorButton buttonOred = new OrangeredColorButton(query);
		buttonOred.setBackground(buttonOred.getColor());
		this.add(BorderLayout.WEST,buttonOred);
		
		BaseColorButton buttonOr = new OrangeColorButton(query);
		buttonOr.setBackground(buttonOr.getColor());
		this.add(BorderLayout.WEST,buttonOr);
		
		BaseColorButton buttonYell = new YellowColorButton(query);
		buttonYell.setBackground(buttonYell.getColor());
		this.add(BorderLayout.WEST,buttonYell);
		
		BaseColorButton buttonApp = new AppleColorButton(query);
		buttonApp.setBackground(buttonApp.getColor());
		this.add(BorderLayout.WEST,buttonApp);
		
		BaseColorButton buttonGreen = new GreenColorButton(query);
		buttonGreen.setBackground(buttonGreen.getColor());
		this.add(BorderLayout.WEST,buttonGreen);
		
		BaseColorButton buttonDG = new DarkgreenColorButton(query);
		buttonDG.setBackground(buttonDG.getColor());
		this.add(BorderLayout.WEST,buttonDG);
		
		BaseColorButton buttonSea = new SeaColorButton(query);
		buttonSea.setBackground(buttonSea.getColor());
		this.add(BorderLayout.WEST,buttonSea);
		
		BaseColorButton buttonCyan = new CyanColorButton(query);
		buttonCyan.setBackground(buttonCyan.getColor());
		this.add(BorderLayout.WEST,buttonCyan);
		
		BaseColorButton buttonSky = new SkyColorButton(query);
		buttonSky.setBackground(buttonSky.getColor());
		this.add(BorderLayout.WEST,buttonSky);
		
		BaseColorButton buttonSteel = new SteelColorButton(query);
		buttonSteel.setBackground(buttonSteel.getColor());
		this.add(BorderLayout.WEST,buttonSteel);
		
		BaseColorButton buttonBlue = new BlueColorButton(query);
		buttonBlue.setBackground(buttonBlue.getColor());
		this.add(BorderLayout.WEST,buttonBlue);
		
		BaseColorButton buttonBlack = new BlackColorButton(query);
		buttonBlack.setBackground(buttonBlack.getColor());
		this.add(BorderLayout.WEST,buttonBlack);
		
		BaseColorButton buttonGray = new GrayColorButton(query);
		buttonGray.setBackground(buttonGray.getColor());
		this.add(BorderLayout.WEST,buttonGray);
		
		BaseColorButton buttonWhite = new WhiteColorButton(query);
		buttonWhite.setBackground(buttonWhite.getColor());
		this.add(BorderLayout.WEST,buttonWhite);
	}
}

