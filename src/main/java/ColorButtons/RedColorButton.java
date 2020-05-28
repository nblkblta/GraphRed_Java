package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;
import Shapes.RectShape;

public class RedColorButton extends BaseColorButton {
	
	public RedColorButton(Query query){
		super("Red");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLastShape().setColor(Color.red);
				query.setDefaultColor(Color.red);
			}
		});
	}

}
