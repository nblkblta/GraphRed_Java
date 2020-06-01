package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class SkyColorButton extends BaseColorButton {
	
	Color color = new Color(135, 206, 235);
	
	public SkyColorButton(Query query){
		super();
		this.setBackground(color);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (query.getSize()>0) {
					query.getLast().setColor(color);
				}
				query.setCurrColor(color);
			}
		});
	}

	@Override
	public Color getColor() {
		return color;
	}

}
