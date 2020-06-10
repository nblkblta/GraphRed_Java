package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Model;
import Shapes.PencilShape;

@SuppressWarnings("serial")
public class PencilButton extends BaseButton{
	public PencilButton(int buttonSize, Model model) {
		super("Pencil");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				model.addShape(new PencilShape());
				
			}
			
		});
	}
}
