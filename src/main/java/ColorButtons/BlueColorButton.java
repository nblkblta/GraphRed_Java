package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

public class BlueColorButton extends BaseColorButton{
	public BlueColorButton(Query query){
		super("Blue");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLastShape().setColor(Color.blue);
				query.setDefaultColor(Color.blue);
			}
		});
	}
}
