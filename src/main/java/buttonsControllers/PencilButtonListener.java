package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import shapes.PencilShape;


public class PencilButtonListener implements ActionListener {
	
	public PencilButtonListener() {
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Model.getModel().addShape(new PencilShape());
	}
}
