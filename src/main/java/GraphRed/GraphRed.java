package GraphRed;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class GraphRed extends JFrame{

	
	private int buttonSize = 40;
	
	private static final long serialVersionUID = 2L;
	GraphRed(){
		super("GraphRedactor");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); 
		setLocationByPlatform(true);
		this.setSize(screenSize.width, screenSize.height);
		this.setVisible(true);
		Settings settings  = new Settings(screenSize,buttonSize);
		Query query = new Query(settings);
		this.add(new ButtonPanel(query, settings));
		this.add(new ColorButtonPanel(query, settings));
		this.add(new Canvas(query, settings));
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(() ->
		{
		GraphRed gr = new GraphRed();
		gr.setDefaultCloseOperation(EXIT_ON_CLOSE);
		});

	}

}
