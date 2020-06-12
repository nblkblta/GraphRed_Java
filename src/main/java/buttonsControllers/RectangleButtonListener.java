package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import shapes.RectShape;

public class RectangleButtonListener implements ActionListener {
	
	public RectangleButtonListener() {
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Model.getModel().addShape(new RectShape());
	}
}
