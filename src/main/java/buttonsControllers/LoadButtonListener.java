package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import model.Model;

public class LoadButtonListener implements ActionListener {
	private Model model;
	public LoadButtonListener(Model model) {
		this.model = model;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			model.load();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}