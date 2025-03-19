package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

import edu.kis.powp.jobs2d.features.DrawerFeature; // added

/**
 * driver adapter to drawer with several bugs.
 */
public class MyAdapter extends DrawPanelController implements Job2dDriver
{
	private int startX = -120;
	private int startY = -120;

	public MyAdapter()
	{
		super();
	}

	@Override
	public void setPosition(int x, int y)
	{
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y)
	{
		ILine line = LineFactory.getBasicLine();

		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		drawLine(line);

		DrawerFeature.getDrawerController().drawLine(line);

		setPosition(x, y); // to change our picture
	}

	@Override
	public String toString()
	{
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
