package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GraphRed.Query;
import Shapes.EllipseShape;


@SuppressWarnings("serial")
public class EllipseButton extends BaseButton {
	public EllipseButton(int buttonSize,Query query){
		super("Ellipse");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.addShape(new EllipseShape());
				
			}
		});
		
	}
}
