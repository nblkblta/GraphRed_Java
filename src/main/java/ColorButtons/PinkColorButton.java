package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class PinkColorButton extends BaseColorButton{
	
	public PinkColorButton(Query query){
		super();
		this.setBackground(Color.pink);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (query.getSize()>0) {
					query.getLast().setColor(Color.pink);
				}
				query.setCurrColor(Color.pink);
			}
		});
	}

	@Override
	public Color getColor() {
		return Color.pink;
	}

}
