package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class VioletColorButton extends BaseColorButton{
	
	Color color = new Color(75, 0, 130);
	
	public VioletColorButton(Query query){
		super();
		this.setBackground(color);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLast().setColor(color);
				query.setCurrColor(color);
			}
		});
	}

	@Override
	public Color getColor() {
		return color;
	}

}