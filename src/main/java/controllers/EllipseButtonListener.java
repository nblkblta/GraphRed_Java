package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import shapes.EllipseShape;

public class EllipseButtonListener implements ActionListener {
	private Model model;
	public EllipseButtonListener(Model model) {
		this.model = model;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.addShape(new EllipseShape());
	}
}
