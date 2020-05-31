package ColorButtons;


import java.awt.Color;

import javax.swing.JButton;


@SuppressWarnings("serial")
public abstract class BaseColorButton extends JButton {
	BaseColorButton(){
		super();
	}
	abstract public Color getColor();
}
