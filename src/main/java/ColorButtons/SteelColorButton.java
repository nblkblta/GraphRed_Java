package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class SteelColorButton  extends BaseColorButton {
	
	Color color = new Color(70, 130, 180);
	
	public SteelColorButton(Query query){
		super();
		this.setBackground(color);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (query.getLast()!=null) {
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
