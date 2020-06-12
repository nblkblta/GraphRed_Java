package view;

import javax.swing.JFrame;
import model.Settings;
import patterns.Observer;

public class GraphRed extends JFrame implements Observer{
	
	private static final long serialVersionUID = 2L;
	public GraphRed(){
		super("GraphRedactor");
		setLocationByPlatform(true);
		this.setSize(Settings.getSettings().getDimension().width, Settings.getSettings().getDimension().height);
		this.add(new ButtonPanel());
		this.add(new ColorButtonPanel());
		this.add(new Canvas());
		this.setVisible(true);
	}
	@Override
	public void handleEvent() {
		repaint();
	}
	

}
