package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;

public class RefreshButtonListener implements ActionListener {
	private Model model;
	public RefreshButtonListener(Model model) {
		this.model = model;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.refresh();
	}
}
