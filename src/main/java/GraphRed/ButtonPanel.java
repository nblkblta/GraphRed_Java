package GraphRed;

import java.awt.Color;
import javax.swing.JPanel;
import Buttons.EllipseButton;
import Buttons.PencilButton;
import Buttons.PolygonButton;
import Buttons.PolylineButton;
import Buttons.RectButton;
import Buttons.RefreshButton;

@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
	ButtonPanel(Model model, Settings settings){
		super();
		int buttonSize = settings.getButtonSize();
		this.setBounds(0, 0, settings.getDimension().width, 40);
		this.setBackground(Color.black);
		this.add(new RectButton(buttonSize,model));
		this.add(new EllipseButton(buttonSize,model));
		this.add(new PolylineButton(buttonSize,model));
		this.add(new PolygonButton(buttonSize,model));
		this.add(new PencilButton(buttonSize,model));
		this.add(new RefreshButton(buttonSize,model));
	}
	
}
