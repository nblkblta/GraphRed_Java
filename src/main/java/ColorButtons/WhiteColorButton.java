package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

public class WhiteColorButton extends BaseColorButton {
	public WhiteColorButton(Query query){
		super("White");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLastShape().setColor(Color.white);
				query.setDefaultColor(Color.white);
			}
		});
	}

}
