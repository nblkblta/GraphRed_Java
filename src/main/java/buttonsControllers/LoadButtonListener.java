package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import model.Model;

public class LoadButtonListener implements ActionListener {

	public LoadButtonListener() {
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Model.getModel().load();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}