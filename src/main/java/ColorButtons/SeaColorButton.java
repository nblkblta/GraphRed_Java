package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class SeaColorButton extends BaseColorButton{
	
	Color c = new Color(46, 139, 87);
	
	public SeaColorButton(Query query){
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
