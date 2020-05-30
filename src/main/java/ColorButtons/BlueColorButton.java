package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class BlueColorButton extends BaseColorButton{
	public BlueColorButton(Query query){
		super("Blue");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLast().setColor(Color.blue);
				query.setCurrColor(Color.blue);
			}
		});
	}
}
