package buttons;


import javax.swing.JButton;

import buttonsControllers.ButtonListener;

@SuppressWarnings("serial")
public class BaseButton extends JButton{
	public BaseButton(String s){
		super(s);
		this.addActionListener(new ButtonListener(s));
	}
}
