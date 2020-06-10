package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Model;
import Shapes.EllipseShape;


@SuppressWarnings("serial")
public class EllipseButton extends BaseButton {
	public EllipseButton(int buttonSize, Model model){
		super("Ellipse");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				model.addShape(new EllipseShape());
			}
		});
		
	}
}
