	/**
 * 
 */
package view;

import java.awt.*;
import javax.swing.JPanel;

import canvasControllers.CanvasMouseListener;
import canvasControllers.CanvasMouseMotionListener;
import model.Model;
import model.Settings;

@SuppressWarnings("serial")
public class Canvas extends JPanel {
	private Model model;
	private Canvas me;
	private int buttonSize;
	
	public Canvas() {
		me=this;
		Settings settings = Settings.getSettings();
		int width = settings.getDimension().width;
		int heigth = settings.getDimension().height;
		this.buttonSize = settings.getButtonSize();
		this.model=Model.getModel();
		this.setBounds(0, settings.getPanelCount()*buttonSize, width, heigth);
		this.repaint();
		this.addMouseListener(new CanvasMouseListener(model));
		this.addMouseMotionListener(new CanvasMouseMotionListener(model));
	}
	
	public void paint(Graphics g) {
		g.drawImage(model.getBuf(),0,0,me);
	}

}
