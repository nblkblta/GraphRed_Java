package buttons;


import javax.swing.JButton;

import buttonsControllers.ButtonListener;

@SuppressWarnings("serial")
public class BaseButton extends JButton{
	public BaseButton(String s){
		super(s);
		if (s.equals("Ellipse")) {
			this.addActionListener(new ButtonListener(s));
		} else if (s.equals("Rectangle")) {
			this.addActionListener(new ButtonListener(s));
		}else if (s.equals("Polyline")) {
			this.addActionListener(new ButtonListener(s));
		}else if (s.equals("Polygon")) {
			this.addActionListener(new ButtonListener(s));
		}else if (s.equals("Pencil")) {
			this.addActionListener(new ButtonListener(s));
		}else if (s.equals("Save")) {
			this.addActionListener(new ButtonListener(s));
		}else if (s.equals("Load")) {
			this.addActionListener(new ButtonListener(s));
		}else if (s.equals("SaveAsPNG")) {
			this.addActionListener(new ButtonListener(s));
		}else throw new RuntimeException(s+"is unknown button");
		
	}

}
