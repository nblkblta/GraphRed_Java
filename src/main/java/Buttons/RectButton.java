package Buttons;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;
import Shapes.RectShape;

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
