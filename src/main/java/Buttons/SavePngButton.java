package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import GraphRed.Model;


@SuppressWarnings("serial")
public class SavePngButton extends BaseButton {

	public SavePngButton(int buttonSize,Model model) {
		super("Сохранить как PNG");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					model.savePng();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

}
