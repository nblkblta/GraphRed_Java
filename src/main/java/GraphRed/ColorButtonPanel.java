package GraphRed;

import java.awt.Color;

import javax.swing.JPanel;

import ColorButtons.ColorButton;


@SuppressWarnings("serial")
public class ColorButtonPanel extends JPanel{
	
	enum Paint{
		Violet {
			public Color getColor() {return new Color(75, 0, 130);}
		},
		Purple {
			public Color getColor() {return new Color(148, 0, 211);}
		},
		Pink {
			public Color getColor() {return Color.pink;}
		},
		Magenta {
			public Color getColor() {return Color.magenta;}
		},
		Red {
			public Color getColor() {return Color.red;}
		},
		Brown {
			public Color getColor() {return new Color(139, 69, 19);}
		},
		Ginger {
			public Color getColor() {return new Color(255, 100, 0);}
		},
		Orange {
			public Color getColor() {return Color.orange;}
		},
		Yellow {
			public Color getColor() {return Color.yellow;}
		},
		Apple {
			public Color getColor() {return new Color(173, 255, 47);}
		},
		Green {
			public Color getColor() {return Color.green;}
		},
		Forest {
			public Color getColor() {return new Color(0, 100, 0);}
		},
		Sea {
			public Color getColor() {return new Color(46, 139, 87);}
		},
		Cyan {
			public Color getColor() {return Color.cyan;}
		},
		Sky {
			public Color getColor() {return new Color(135, 206, 235);}
		},
		Steel {
			public Color getColor() {return new Color(70, 130, 180);}
		},
		Blue {
			public Color getColor() {return Color.blue;}
		},
		Black {
			public Color getColor() {return Color.black;}
		},
		Gray {
			public Color getColor() {return Color.gray;}
		},
		White {
			public Color getColor() {return Color.white;}
		};
		
		public abstract Color getColor();
	}
	
	ColorButtonPanel(Model model, Settings settings){
		super();
		int buttonSize = settings.getButtonSize();
		int width = settings.getDimension().width;
		this.setBounds(0, buttonSize, width, buttonSize);
		this.setBackground(Color.black);
		
		Paint[] paint = Paint.values();
		for(Paint i: paint) {
			this.add(new ColorButton(model, i.getColor()));
		}
	}
}

