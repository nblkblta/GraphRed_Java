package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import shapes.PolylineShape;

public class PolylineButtonListener implements ActionListener {
	private Model model;
	public PolylineButtonListener(Model model) {
		this.model = model;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.addShape(new PolylineShape());
	}
}
