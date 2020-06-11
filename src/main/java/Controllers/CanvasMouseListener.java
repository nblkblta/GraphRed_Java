package controllers;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.Model;

public class CanvasMouseListener implements MouseListener {
	private Model model;
	public CanvasMouseListener(Model model){
		this.model = model;
	}
	@Override
	public void mouseClicked(MouseEvent event) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	
	@Override
	public void mousePressed(MouseEvent event) {
			if(model.getLast()!=null) {
				model.addCoordinates(event.getPoint());
				}
	}
	@Override
	public void mouseReleased(MouseEvent event) {
		
			if(model.getLast()!=null) {
				model.addCoordinates(event.getPoint());
				}
	}

}
