package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class DarkgreenColorButton extends BaseColorButton{
	
	Color c = new Color(0, 100, 0);
	
	public DarkgreenColorButton(Query query){
		super();
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLast().setColor(c);
				query.setCurrColor(c);
			}
		});
	}

	@Override
	public Color getColor() {
		return c;
	}

}
