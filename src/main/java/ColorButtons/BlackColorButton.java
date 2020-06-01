package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class BlackColorButton extends BaseColorButton {
	public BlackColorButton(Query query){
		super();
		this.setBackground(Color.black);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (query.getSize()>0) {
					query.getLast().setColor(Color.black);
				}
				query.setCurrColor(Color.black);
			}
		});
	}

	@Override
	public Color getColor() {
		return Color.black;
	}
}
