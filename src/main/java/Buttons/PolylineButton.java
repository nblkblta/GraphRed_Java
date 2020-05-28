package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;
import Shapes.PolylineShape;

@SuppressWarnings("serial")
public class PolylineButton extends BaseButton{
	public PolylineButton(int buttonSize,Query query){
		super("Polyline");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.addShape(new PolylineShape());
			}
		});
	}
}
