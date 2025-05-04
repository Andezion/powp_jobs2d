package edu.kis.powp.commands;

import java.util.ArrayList;
import java.util.List;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.MyAdapter;

public class complexCommandFactory
{
    public static complexCommand getRectangle()
    {
        List<driverCommand> driverCommandList = new ArrayList<>();
        Job2dDriver driver = new MyAdapter();

        driverCommandList.add(new setPositionCommand(-120, -120, driver));
        driverCommandList.add(new operateToCommand(120, -120, driver));
        driverCommandList.add(new operateToCommand(120, 120, driver));
        driverCommandList.add(new operateToCommand(-120, 120, driver));
        driverCommandList.add(new operateToCommand(-120, -120, driver));

        return new complexCommand(driverCommandList);
    }

    public static complexCommand getTriangle()
    {
        List<driverCommand> driverCommandList = new ArrayList<>();
        Job2dDriver driver = new MyAdapter();

        driverCommandList.add(new setPositionCommand(0, 0, driver));
        driverCommandList.add(new operateToCommand(120, 120, driver));
        driverCommandList.add(new operateToCommand(0, 240, driver));
        driverCommandList.add(new operateToCommand(0, 0, driver));

        return new complexCommand(driverCommandList);

    }
}
