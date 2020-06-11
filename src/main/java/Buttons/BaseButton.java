package buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;


@SuppressWarnings("serial")
public class BaseButton extends JButton{
	public BaseButton(String s, ActionListener listener){
		super(s);
		this.addActionListener(listener);
	}

}
