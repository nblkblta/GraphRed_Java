package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import model.Model;

public class SavePngButtonListener implements ActionListener {
	private Model model;
	public SavePngButtonListener(Model model) {
		this.model = model;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			model.savePng();
		} catch (IOException e) {
			// TODO Автоматически созданный блок catch
			e.printStackTrace();
		}
	}
}
