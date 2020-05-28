package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class WhiteColorButton extends BaseColorButton {
	public WhiteColorButton(Query query){
		super("White");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLast().setColor(Color.white);
				query.setDefaultColor(Color.white);
			}
		});
	}

}
