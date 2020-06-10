package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class YellowColorButton extends BaseColorButton {
	public YellowColorButton(Query query){
		super();
		this.setBackground(Color.yellow);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (query.getLast()!=null) {
					query.getLast().setColor(Color.yellow);
				}
				query.setCurrColor(Color.yellow);
			}
		});
	}

	@Override
	public Color getColor() {
		return Color.yellow;
	}
}
