package view;

import java.awt.Color;
import javax.swing.JPanel;


import buttons.BaseButton;
import model.Settings;


@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
	
	ButtonPanel(){
		super();
		int buttonSize = Settings.getSettings().getButtonSize();
		this.setBounds(0, 0, Settings.getSettings().getDimension().width, buttonSize);
		this.setBackground(Color.black);
		for(Tool i: Tool.values()) {
			this.add(new BaseButton(i.getName()));
		}
	}
	
}
