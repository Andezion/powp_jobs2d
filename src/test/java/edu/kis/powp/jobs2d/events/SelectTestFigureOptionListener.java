package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.factory.RectFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener
{

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager)
	{
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		//FiguresJoe.figureScript1(driverManager.getCurrentDriver()); now we have 2 Joe's

        if (e.getActionCommand().compareTo("Figure Joe1") == 0)
		{
            FiguresJoe.figureScript1(driverManager.getCurrentDriver());
        }
		else if(e.getActionCommand().compareTo("Figure Joe2") == 0)
		{
            FiguresJoe.figureScript2(driverManager.getCurrentDriver());
        }
		else
		{
			RectFactory.createRectangle(driverManager.getCurrentDriver());
		}
    }
}
