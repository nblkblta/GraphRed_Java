package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;

public class RefreshButtonListener implements ActionListener {
	
	public RefreshButtonListener() {	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Model.getModel().refresh();
	}
}
