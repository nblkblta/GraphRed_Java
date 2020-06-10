package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Model;
import Shapes.RectShape;

@SuppressWarnings("serial")
public class RectButton extends BaseButton {
	public RectButton(int buttonSize,Model model){
		super("Rect");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				model.addShape(new RectShape());
			}
		});
	}
}
