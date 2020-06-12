package buttonsControllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import model.Model;
import shapes.EllipseShape;
import shapes.PencilShape;
import shapes.PolygonShape;
import shapes.PolylineShape;
import shapes.RectShape;


public class ButtonListener implements ActionListener{
	private String action;
	public ButtonListener(String action){
		this.action=action;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (action.equals("Ellipse")) {
			Model.getModel().addShape(new EllipseShape());
		} else if (action.equals("Rectangle")) {
			Model.getModel().addShape(new RectShape());
		}else if (action.equals("Polyline")) {
			Model.getModel().addShape(new PolylineShape());
		}else if (action.equals("Polygon")) {
			Model.getModel().addShape(new PolygonShape());
		}else if (action.equals("Pencil")) {
			Model.getModel().addShape(new PencilShape());
		}else if (action.equals("Save")) {
			try {
				Model.getModel().save();
			} catch (IOException e) {
				// TODO Автоматически созданный блок catch
				e.printStackTrace();
			}
		}else if (action.equals("Load")) {
			try {
				Model.getModel().load();
			} catch (ClassNotFoundException e) {
				// TODO Автоматически созданный блок catch
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Автоматически созданный блок catch
				e.printStackTrace();
			}
		}else if (action.equals("SaveAsPNG")) {
			try {
				Model.getModel().savePng();
			} catch (IOException e) {
				// TODO Автоматически созданный блок catch
				e.printStackTrace();
			}
			
		}else throw new RuntimeException(action+"is unknown action");
		
	}

}
