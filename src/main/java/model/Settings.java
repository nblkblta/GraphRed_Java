package model;

import java.awt.Dimension;



public class Settings {
	private Dimension dimension;
	private int buttonSize ;
	private int panelCount ;
	private static Settings me;

	
	private Settings() {
		
	}
	
	public static Settings getSettings() {
		if (me==null) {
			me=new Settings();
		}
		return me;
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
