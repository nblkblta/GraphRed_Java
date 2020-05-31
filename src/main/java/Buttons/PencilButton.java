package Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;
import Shapes.PencilShape;

@SuppressWarnings("serial")
public class PencilButton extends BaseButton{
	public PencilButton(int buttonSize, Query query) {
		super("Pencil");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				query.addShape(new PencilShape());
				
			}
			
		});
	}
}
