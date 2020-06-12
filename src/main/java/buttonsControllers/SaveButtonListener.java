package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import model.Model;

public class SaveButtonListener implements ActionListener {
	
	public SaveButtonListener() {
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Model.getModel().save();
		} catch (IOException e) {
			// TODO Автоматически созданный блок catch
			e.printStackTrace();
		}
	}
}