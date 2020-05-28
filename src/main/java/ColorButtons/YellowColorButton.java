package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

public class YellowColorButton extends BaseColorButton {
	public YellowColorButton(Query query){
		super("Yellow");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLastShape().setColor(Color.yellow);
				query.setDefaultColor(Color.yellow);
			}
		});
	}
}
