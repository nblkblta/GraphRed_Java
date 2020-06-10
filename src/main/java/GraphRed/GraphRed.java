package GraphRed;

import javax.swing.JFrame;

public class GraphRed extends JFrame implements Observer{
	
	private static final long serialVersionUID = 2L;
	GraphRed(Model model,Settings settings){
		super("GraphRedactor");
		setLocationByPlatform(true);
		this.setSize(settings.getDimension().width, settings.getDimension().height);
		this.setVisible(true);
		
		this.add(new ButtonPanel(model, settings));
		this.add(new ColorButtonPanel(model, settings));
		this.add(new Canvas(model, settings));
	}
	@Override
	public void handleEvent() {
		repaint();
	}
	

}
