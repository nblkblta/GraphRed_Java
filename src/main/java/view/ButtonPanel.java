package view;

import java.awt.Color;
import javax.swing.JPanel;

import buttons.BaseButton;
import buttonsControllers.EllipseButtonListener;
import buttonsControllers.LoadButtonListener;
import buttonsControllers.PencilButtonListener;
import buttonsControllers.PolygonButtonListener;
import buttonsControllers.PolylineButtonListener;
import buttonsControllers.RectangleButtonListener;
import buttonsControllers.SaveButtonListener;
import buttonsControllers.SavePngButtonListener;
import model.Settings;

@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
	
	ButtonPanel(){
		super();
		int buttonSize = Settings.getSettings().getButtonSize();
		this.setBounds(0, 0, Settings.getSettings().getDimension().width, buttonSize);
		this.setBackground(Color.black);
		this.add(new BaseButton("Ellipse",new EllipseButtonListener()));
		this.add(new BaseButton("Rectangle",new RectangleButtonListener()));
		this.add(new BaseButton("Polyline",new PolylineButtonListener()));
		this.add(new BaseButton("Polygon",new PolygonButtonListener()));
		this.add(new BaseButton("Pencil",new PencilButtonListener()));
		this.add(new BaseButton("Save",new SaveButtonListener()));
		this.add(new BaseButton("Load",new LoadButtonListener()));
		this.add(new BaseButton("SaveAsPNG",new SavePngButtonListener()));
		
	}
	
}
