package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import GraphRed.Model;

@SuppressWarnings("serial")
public class SaveButton extends BaseButton {

	public SaveButton(int buttonSize,Model model) {
		super("Сохранить");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					model.save();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

}
