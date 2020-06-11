package model;

import java.awt.Dimension;

public class Settings {
	private Dimension dimension;
	private int buttonSize ;
	private int panelCount ;
	
	public Settings(Dimension dimension, int buttonSize, int panelCount) {
		this.setDimension(dimension);
		this.setButtonSize(buttonSize);
		this.setPanelCount(panelCount);
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public int getButtonSize() {
		return buttonSize;
	}

	public void setButtonSize(int buttonSize) {
		this.buttonSize = buttonSize;
	}

	public int getPanelCount() {
		return panelCount;
	}

	public void setPanelCount(int panelCount) {
		this.panelCount = panelCount;
	}
	
}
