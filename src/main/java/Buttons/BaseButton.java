package buttons;


import javax.swing.JButton;

import buttonsControllers.EllipseButtonListener;
import buttonsControllers.LoadButtonListener;
import buttonsControllers.PencilButtonListener;
import buttonsControllers.PolygonButtonListener;
import buttonsControllers.PolylineButtonListener;
import buttonsControllers.RectangleButtonListener;
import buttonsControllers.SaveButtonListener;
import buttonsControllers.SavePngButtonListener;


@SuppressWarnings("serial")
public class BaseButton extends JButton{
	public BaseButton(String s){
		super(s);
		if (s.equals("Ellipse")) {
			this.addActionListener(new EllipseButtonListener());
		} else if (s.equals("Rectangle")) {
			this.addActionListener(new RectangleButtonListener());
		}else if (s.equals("Polyline")) {
			this.addActionListener(new PolylineButtonListener());
		}else if (s.equals("Polygon")) {
			this.addActionListener(new PolygonButtonListener());
		}else if (s.equals("Pencil")) {
			this.addActionListener(new PencilButtonListener());
		}else if (s.equals("Save")) {
			this.addActionListener(new SaveButtonListener());
		}else if (s.equals("Load")) {
			this.addActionListener(new LoadButtonListener());
		}else if (s.equals("SaveAsPNG")) {
			this.addActionListener(new SavePngButtonListener());
		}
		
	}

}
