package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Model;
import Shapes.PolygonShape;


@SuppressWarnings("serial")
public class PolygonButton extends BaseButton {
	public PolygonButton(int buttonSize,Model model){
		super("Polygon");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				model.addShape(new PolygonShape());
			}
		});
		
	}
}
