package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import GraphRed.Model;

@SuppressWarnings("serial")
public class LoadButton extends BaseButton {

	public LoadButton(int buttonSize,Model model) {
		super("Загрузить");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					try {
						model.load();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

}
