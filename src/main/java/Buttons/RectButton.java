package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;
import Shapes.RectShape;

@SuppressWarnings("serial")
public class RectButton extends BaseButton {
	public RectButton(int buttonSize,Query query){
		super("Rect");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.addShape(new RectShape());
			}
		});
	}
}
