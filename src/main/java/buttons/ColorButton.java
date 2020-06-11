package buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import model.Model;

@SuppressWarnings("serial")
public class ColorButton extends JButton {
	public ColorButton(Model model, Color color){
		super();
		this.setBackground(color);
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (model.getLast()!=null) {
					model.getLast().setColor(color);
				}
				model.setCurrColor(color);
			}
		});
	}
}
