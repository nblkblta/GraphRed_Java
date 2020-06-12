package view;

import java.awt.Color;

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
