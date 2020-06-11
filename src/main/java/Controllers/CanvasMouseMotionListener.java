package Controllers;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import GraphRed.Model;

public class CanvasMouseMotionListener implements MouseMotionListener {
	private Model model;
	public CanvasMouseMotionListener(Model model){
		this.model = model;
	}

	@Override
	public void mouseDragged(MouseEvent event) {	
			if(model.getLast()!=null) {
				model.addCurrCoordinates(event.getPoint());
			}
		}
	@Override
	public void mouseMoved(MouseEvent arg0) {}

}
