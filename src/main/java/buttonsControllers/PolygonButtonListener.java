package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import shapes.PolygonShape;

public class PolygonButtonListener implements ActionListener {
	public PolygonButtonListener() {
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Model.getModel().addShape(new PolygonShape());
	}
}