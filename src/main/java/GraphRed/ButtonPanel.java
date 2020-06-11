package GraphRed;

import java.awt.Color;
import javax.swing.JPanel;

import Buttons.BaseButton;
import Buttons.EllipseButton;
import Buttons.LoadButton;
import Buttons.PencilButton;
import Buttons.PolygonButton;
import Buttons.PolylineButton;
import Buttons.RectButton;
import Buttons.RefreshButton;
import Buttons.SaveButton;
import Buttons.SavePngButton;

@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
	
	enum Button{
		Rectangle{
			public RectButton createButton(int buttonSize, Model model) {return new RectButton(buttonSize,model);}
		},
		Ellipse{
			public EllipseButton createButton(int buttonSize, Model model) {return new EllipseButton(buttonSize,model);}
		},
		Polygon{
			public PolygonButton createButton(int buttonSize, Model model) {return new PolygonButton(buttonSize,model);}
		},
		Polyline{
			public PolylineButton createButton(int buttonSize, Model model) {return new PolylineButton(buttonSize,model);}
		},
		Pencil{
			public PencilButton createButton(int buttonSize, Model model) {return new PencilButton(buttonSize,model);}
		},
		Refresh{
			public RefreshButton createButton(int buttonSize, Model model) {return new RefreshButton(buttonSize,model);}
		},
		Save{
			public SaveButton createButton(int buttonSize, Model model) {return new SaveButton(buttonSize,model);}
		},
		SaveAsPNG{
			public SavePngButton createButton(int buttonSize, Model model) {return new SavePngButton(buttonSize,model);}
		},
		Load{
			public LoadButton createButton(int buttonSize, Model model) {return new LoadButton(buttonSize,model);}
		};
		
		public abstract BaseButton createButton(int buttonSize, Model model);
	}
	
	ButtonPanel(Model model, Settings settings){
		super();
		int buttonSize = settings.getButtonSize();
		this.setBounds(0, 0, settings.getDimension().width, 40);
		this.setBackground(Color.black);
		
		Button[] button = Button.values();
		for(Button i: button) {
			this.add(i.createButton(buttonSize,model));
		}
		
	}
	
}
