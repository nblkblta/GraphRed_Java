package view;

import java.awt.Color;

import javax.swing.JPanel;

import buttons.ColorButton;
import model.Model;
import model.Settings;


@SuppressWarnings("serial")
public class ColorButtonPanel extends JPanel{
	
	enum Paint{
		
		Violet (new Color(75, 0, 130)),
		Purple (new Color(148, 0, 211)),
		Pink (Color.pink),
		Magenta (Color.magenta),
		Red (Color.red),
		Brown (new Color(139, 69, 19)),
		Ginger (new Color(255, 100, 0)),
		Orange (Color.orange),
		Yellow (Color.yellow),
		Apple (new Color(173, 255, 47)),
		Green (Color.green),
		Forest (new Color(0, 100, 0)),
		Sea (new Color(46, 139, 87)),
		Cyan (Color.cyan),
		Sky (new Color(135, 206, 235)),
		Steel (new Color(70, 130, 180)),
		Blue (Color.blue),
		Black (Color.black),
		Gray (Color.gray),
		White (Color.white);
		
		private Color color;
		
		Paint(Color color){
			this.color=color;
		}
		public Color getColor() {
			return this.color;
		};
	}
	
	ColorButtonPanel(Model model, Settings settings){
		super();
		int buttonSize = settings.getButtonSize();
		int width = settings.getDimension().width;
		this.setBounds(0, buttonSize, width, buttonSize);
		this.setBackground(Color.black);
		
		for(Paint i: Paint.values()) {
			this.add(new ColorButton(model, i.getColor()));
		}
	}
}

