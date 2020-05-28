package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;
import Shapes.PolygonShape;
import Shapes.RectShape;

public class PolygonButton extends BaseButton {
	public PolygonButton(int buttonSize,Query query){
		super("Polygon");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.addShape(new PolygonShape());
			}
		});
		
	}
}
