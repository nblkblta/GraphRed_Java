package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

public class BlackColorButton extends BaseColorButton {
	public BlackColorButton(Query query){
		super("Black");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLastShape().setColor(Color.black);
				query.setDefaultColor(Color.black);
			}
		});
	}

}
