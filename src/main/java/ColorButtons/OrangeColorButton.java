package ColorButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Query;

@SuppressWarnings("serial")
public class OrangeColorButton extends BaseColorButton{
	
	public OrangeColorButton(Query query){
		super();
		this.setBackground(Color.orange);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (query.getSize()>0) {
					query.getLast().setColor(Color.orange);
				}
				query.setCurrColor(Color.orange);
			}
		});
	}

	@Override
	public Color getColor() {
		return Color.orange;
	}

}
