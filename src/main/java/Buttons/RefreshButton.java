package Buttons;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GraphRed.Query;

@SuppressWarnings("serial")
public class RefreshButton extends BaseButton{
	public RefreshButton(int buttonSize,Query query) {
		super("Refresh");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.refresh();
			}
		});
	}

}
