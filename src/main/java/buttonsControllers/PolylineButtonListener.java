package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import shapes.PolylineShape;

public class PolylineButtonListener implements ActionListener {
	
	public PolylineButtonListener() {
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Model.getModel().addShape(new PolylineShape());
	}
}
