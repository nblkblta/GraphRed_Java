package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Model;
import Shapes.PolylineShape;

@SuppressWarnings("serial")
public class PolylineButton extends BaseButton{
	public PolylineButton(int buttonSize,Model model){
		super("Polyline");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				model.addShape(new PolylineShape());
			}
		});
	}
}
