package view;

import java.awt.Color;
import javax.swing.JPanel;

import buttons.BaseButton;
import controllers.EllipseButtonListener;
import controllers.LoadButtonListener;
import controllers.PencilButtonListener;
import controllers.PolygonButtonListener;
import controllers.PolylineButtonListener;
import controllers.RectangleButtonListener;
import controllers.SaveButtonListener;
import controllers.SavePngButtonListener;
import model.Model;
import model.Settings;

@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
	
	ButtonPanel(Model model, Settings settings){
		super();
		int buttonSize = settings.getButtonSize();
		this.setBounds(0, 0, settings.getDimension().width, buttonSize);
		this.setBackground(Color.black);
		this.add(new BaseButton("Ellipse",new EllipseButtonListener(model)));
		this.add(new BaseButton("Rectangle",new RectangleButtonListener(model)));
		this.add(new BaseButton("Polyline",new PolylineButtonListener(model)));
		this.add(new BaseButton("Polygon",new PolygonButtonListener(model)));
		this.add(new BaseButton("Pencil",new PencilButtonListener(model)));
		this.add(new BaseButton("Save",new SaveButtonListener(model)));
		this.add(new BaseButton("Load",new LoadButtonListener(model)));
		this.add(new BaseButton("SaveAsPNG",new SavePngButtonListener(model)));
		
	}
	
}
