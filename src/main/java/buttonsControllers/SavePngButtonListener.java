package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import model.Model;

public class SavePngButtonListener implements ActionListener {
	
	public SavePngButtonListener() {
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Model.getModel().savePng();
		} catch (IOException e) {
			// TODO Автоматически созданный блок catch
			e.printStackTrace();
		}
	}
}
