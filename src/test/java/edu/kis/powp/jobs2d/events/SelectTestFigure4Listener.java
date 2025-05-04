package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.commands.driverCommand;
import edu.kis.powp.commands.complexCommandFactory;

public class SelectTestFigure4Listener implements ActionListener
{
    private DriverManager driverManager;

    public SelectTestFigure4Listener(DriverManager driverManager)
    {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        DriverCommand triangle = complexCommandFactory.getTriangle();
        triangle.execute();
    }
}