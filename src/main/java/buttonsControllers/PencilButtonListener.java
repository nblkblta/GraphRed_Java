package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import shapes.PencilShape;


public class PencilButtonListener implements ActionListener {
	private Model model;
	public PencilButtonListener(Model model) {
		this.model = model;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.addShape(new PencilShape());
	}
}
