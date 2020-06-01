package GraphRed;

import java.awt.Dimension;
import java.awt.EventQueue;

import java.awt.Toolkit;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphRed extends JFrame{

	private int windowWidth ;
	private int windowHeigth ;
	private int buttonSize = 40;
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
		Canvas jp = new Canvas(windowWidth,windowHeigth, query,buttonSize);
		jp.setBounds(0, 80, windowWidth, windowHeigth);
		JPanel buttonPanel = new ButtonPanel(screenSize,query,buttonSize,jp);
		this.add(buttonPanel);
		JPanel colorButtonPanel = new ColorButtonPanel(screenSize,query, buttonSize);
		this.add(colorButtonPanel);
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
