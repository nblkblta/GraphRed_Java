package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class DarkgreenColorButton extends BaseColorButton{
	
	Color color = new Color(0, 100, 0);
	
	public DarkgreenColorButton(Query query){
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
