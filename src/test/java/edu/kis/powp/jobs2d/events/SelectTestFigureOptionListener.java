package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.constants.TestFigureActionNames;

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
		String command = e.getActionCommand();
		if (TestFigureActionNames.FIGURE_JOE_1.equals(command))
		{
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else if (TestFigureActionNames.FIGURE_JOE_2.equals(command))
		{
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
    }
}
