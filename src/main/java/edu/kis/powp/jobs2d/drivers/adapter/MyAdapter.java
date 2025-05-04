package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

import edu.kis.powp.jobs2d.features.DrawFeature; // added

/**
 * driver adapter to drawer with several bugs.
 */
public class MyAdapter extends DrawPanelController implements Job2dDriver
{
	private int startX = 0;
	private int startY = 0;

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

		DrawFeature.getDrawerController().drawLine(line);

		setPosition(x, y); // to change our picture
	}

	@Override
	public String toString()
	{
		return "This is not my Adapter";
	}
}
