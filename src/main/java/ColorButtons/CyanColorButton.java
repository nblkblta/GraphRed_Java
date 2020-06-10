package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class CyanColorButton extends BaseColorButton{

	public CyanColorButton(Query query){
		super();
		this.setBackground(Color.cyan);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (query.getLast()!=null) {
					query.getLast().setColor(Color.cyan);
				}
				query.setCurrColor(Color.cyan);
			}
		});
	}
	
	@Override
	public Color getColor() {
		return Color.cyan;
	}

}
