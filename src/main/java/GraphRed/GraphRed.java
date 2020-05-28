package GraphRed;

import java.awt.Dimension;
import java.awt.EventQueue;

import java.awt.Toolkit;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphRed extends JFrame{

	private int windowWidth ;
	private int windowHeigth ;
	private Query query ;
	
	private static final long serialVersionUID = 2L;
	GraphRed(){
		super("GraphRedactor");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); 
		setLocationByPlatform(true);
		windowWidth=screenSize.width;
		windowHeigth=screenSize.height;
		this.setSize(windowWidth, windowHeigth);
		this.setVisible(true);
		query = new Query();
		JPanel buttonPanel = new ButtonPanel(screenSize,query);
		this.add(buttonPanel);
		JPanel colorButtonPanel = new ColorButtonPanel(screenSize,query);
		this.add(colorButtonPanel);
		Canvas jp = new Canvas(windowWidth,windowHeigth, query);
		jp.setBounds(0, 0, windowWidth, windowHeigth);
		this.add(jp);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(() ->
		{
		GraphRed gr = new GraphRed();
		gr.setDefaultCloseOperation(EXIT_ON_CLOSE);

		});

	}

}
