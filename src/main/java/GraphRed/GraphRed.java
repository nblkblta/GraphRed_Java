package GraphRed;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GraphRed extends JFrame{

	private int buttonSize = 45;
	private int windowWidth ;
	private int windowHeigth ;
	public void addActionListener(int i) {
		
	}
	private static final long serialVersionUID = 1L;
	GraphRed(){
		super("GraphRedactor");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize(); 
		setLocationByPlatform(true);
		windowWidth=screenSize.width;
		windowHeigth=screenSize.height;
		this.setSize(windowWidth, windowHeigth);
		this.setVisible(true);
		Canvas jp = new Canvas(windowWidth,windowHeigth,buttonSize);
		jp.setBounds(buttonSize, 0, windowWidth - buttonSize, windowHeigth);
		Rectangle rect = new Rectangle(buttonSize,buttonSize);
		JButton jPen = new JButton("P");
		JButton jRect = new JButton("R");
		jRect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	           jp.setMode(2);
	           System.out.println(jp.getMode());
	        }
		});
		jPen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	           jp.setMode(1);
	           System.out.println(jp.getMode());
	        }
		});
		jPen.setBounds(rect);
		jPen.setLocation(0, 0);	
		jRect.setBounds(rect);
		jRect.setLocation(0, buttonSize);	
		this.add(jRect);
		this.add(jPen);
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
