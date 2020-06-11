package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import shapes.PolygonShape;

public class PolygonButtonListener implements ActionListener {
	private Model model;
	public PolygonButtonListener(Model model) {
		this.model = model;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.addShape(new PolygonShape());
	}
}