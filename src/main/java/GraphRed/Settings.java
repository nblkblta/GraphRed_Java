package GraphRed;

import java.awt.Dimension;

public class Settings {
	private Dimension dimension;
	private int buttonSize ;
	
	public Settings(Dimension dimension, int buttonSize) {
		this.setDimension(dimension);
		this.setButtonSize(buttonSize);
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
	
}
