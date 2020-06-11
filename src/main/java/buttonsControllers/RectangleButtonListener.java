package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import shapes.RectShape;

public class RectangleButtonListener implements ActionListener {
	private Model model;
	public RectangleButtonListener(Model model) {
		this.model = model;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.addShape(new RectShape());
	}
}
