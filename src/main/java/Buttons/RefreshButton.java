package Buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GraphRed.Canvas;
import GraphRed.Query;

@SuppressWarnings("serial")
public class RefreshButton extends BaseButton{
	public RefreshButton(int buttonSize,Query query,Dimension dim,Canvas jp) {
		super("Refresh");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				query.refresh();
				jp.buffer.setColor(Color.white);
				jp.buffer.fillRect(0, 80, dim.width, dim.height-80);
				jp.paintToBuffer(jp.buffer);
				jp.repaint();
			}
		});
	}

}
