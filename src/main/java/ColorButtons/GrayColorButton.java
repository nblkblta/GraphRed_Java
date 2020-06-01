package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class GrayColorButton extends BaseColorButton{
	
	public GrayColorButton(Query query){
		super();
		this.setBackground(Color.gray);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (query.getSize()>0) {
					query.getLast().setColor(Color.gray);
				}
				query.setCurrColor(Color.gray);
			}
		});
	}

	@Override
	public Color getColor() {
		return Color.gray;
	}

}
