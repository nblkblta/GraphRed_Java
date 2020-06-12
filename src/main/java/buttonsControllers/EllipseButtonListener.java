package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import shapes.EllipseShape;

public class EllipseButtonListener implements ActionListener {
	
	public EllipseButtonListener() {
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Model.getModel().addShape(new EllipseShape());
	}
}
