package edu.kis.powp.legacy.drawer;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

/**
 * Drawer test.
 * 
 * @author Dominik
 */
public class TestDrawer
{
	/**
	 * Drawer test.
	 */
	public static void main(String[] args) {
		DrawPanelController controller = new DrawPanelController();
		DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(-100, -60);
		line.setEndCoordinates(60, 130);
		controller.drawLine(line);
	}
}
