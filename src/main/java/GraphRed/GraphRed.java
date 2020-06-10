package GraphRed;

import javax.swing.JFrame;

public class GraphRed extends JFrame implements Observer{
	
	private static final long serialVersionUID = 2L;
	GraphRed(Query query,Settings settings){
		super("GraphRedactor");
		setLocationByPlatform(true);
		this.setSize(settings.getDimension().width, settings.getDimension().height);
		this.setVisible(true);
		
		this.add(new ButtonPanel(query, settings));
		this.add(new ColorButtonPanel(query, settings));
		this.add(new Canvas(query, settings));
	}
	@Override
	public void handleEvent() {
		repaint();
	}
	

}
