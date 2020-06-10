package Buttons;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Model;

@SuppressWarnings("serial")
public class RefreshButton extends BaseButton{
	public RefreshButton(int buttonSize,Model model) {
		super("Refresh");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				model.refresh();
			}
		});
	}

}
