package view;

import java.awt.Color;

import javax.swing.JPanel;
import buttons.ColorButton;
import model.Settings;


@SuppressWarnings("serial")
public class ColorButtonPanel extends JPanel{
	
	ColorButtonPanel(){
		super();
		int buttonSize = Settings.getSettings().getButtonSize();
		int width = Settings.getSettings().getDimension().width;
		this.setBounds(0, buttonSize, width, buttonSize);
		this.setBackground(Color.black);
		
		for(Paint i: Paint.values()) {
			this.add(new ColorButton(i.getColor()));
		}
	}
}

