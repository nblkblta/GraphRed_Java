package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class GreenColorButton extends BaseColorButton {
	public GreenColorButton(Query query){
		super();
		this.setBackground(Color.green);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (query.getSize()>0) {
					query.getLast().setColor(Color.green);
				}
				query.setCurrColor(Color.green);
			}
		});
	}

	@Override
	public Color getColor() {
		return Color.green;
	}
}
