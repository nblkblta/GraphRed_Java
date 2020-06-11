package view;

import javax.swing.JFrame;

import model.Model;
import model.Observer;
import model.Settings;

public class GraphRed extends JFrame implements Observer{
	
	private static final long serialVersionUID = 2L;
	public GraphRed(Model model,Settings settings){
		super("GraphRedactor");
		setLocationByPlatform(true);
		this.setSize(settings.getDimension().width, settings.getDimension().height);
		this.add(new ButtonPanel(model, settings));
		this.add(new ColorButtonPanel(model, settings));
		this.add(new Canvas(model, settings));
		this.setVisible(true);
	}
	@Override
	public void handleEvent() {
		repaint();
	}
	

}
