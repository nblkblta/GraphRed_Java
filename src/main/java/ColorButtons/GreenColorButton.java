package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

public class GreenColorButton extends BaseColorButton {
	public GreenColorButton(Query query){
		super("Green");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLastShape().setColor(Color.green);
				query.setDefaultColor(Color.green);
			}
		});
	}
}
