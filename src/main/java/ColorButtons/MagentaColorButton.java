package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class MagentaColorButton extends BaseColorButton{

	public MagentaColorButton(Query query){
		super();
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.getLast().setColor(Color.magenta);
				query.setCurrColor(Color.magenta);
			}
		});
	}

	@Override
	public Color getColor() {
		return Color.magenta;
	}
	
}
