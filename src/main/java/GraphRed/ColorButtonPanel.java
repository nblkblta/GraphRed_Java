package GraphRed;

import java.awt.Color;
import javax.swing.JPanel;

import ColorButtons.ColorButton;


@SuppressWarnings("serial")
public class ColorButtonPanel extends JPanel{
	
	ColorButtonPanel(Model model, Settings settings){
		super();
		int buttonSize = settings.getButtonSize();
		int width = settings.getDimension().width;
		this.setBounds(0, buttonSize, width, buttonSize);
		this.setBackground(Color.black);
		
		this.add(new ColorButton(model, new Color(75, 0, 130)));
		this.add(new ColorButton(model, new Color(148, 0, 211)));
		this.add(new ColorButton(model, Color.pink));
		this.add(new ColorButton(model, Color.magenta));
		this.add(new ColorButton(model, Color.red));
		this.add(new ColorButton(model, new Color(139, 69, 19)));
		this.add(new ColorButton(model, new Color(255, 100, 0)));
		this.add(new ColorButton(model, Color.orange));
		this.add(new ColorButton(model, Color.yellow));
		this.add(new ColorButton(model, new Color(173, 255, 47)));
		this.add(new ColorButton(model, Color.green));
		this.add(new ColorButton(model, new Color(0, 100, 0)));
		this.add(new ColorButton(model, new Color(46, 139, 87)));
		this.add(new ColorButton(model, Color.cyan));
		this.add(new ColorButton(model, new Color(135, 206, 235)));
		this.add(new ColorButton(model, new Color(70, 130, 180)));
		this.add(new ColorButton(model, Color.blue));
		this.add(new ColorButton(model, Color.black));
		this.add(new ColorButton(model, Color.gray));
		this.add(new ColorButton(model, Color.white));
	}
}

