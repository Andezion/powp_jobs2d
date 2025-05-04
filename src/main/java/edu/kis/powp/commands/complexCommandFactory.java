package edu.kis.powp.commands;

import java.util.ArrayList;
import java.util.List;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.MyAdapter;

public class complexCommandFactory
{
    public static List<driverCommand> getRectangle()
    {
        List<driverCommand> driverCommandList = new ArrayList<>();
        Job2dDriver driver = new MyAdapter();

        driverCommandList.add(new setPositionCommand(-120, -120, driver));
        driverCommandList.add(new operateToCommand(120, -120, driver));
        driverCommandList.add(new operateToCommand(120, 120, driver));
        driverCommandList.add(new operateToCommand(-120, 120, driver));
        driverCommandList.add(new operateToCommand(-120, -120, driver));

        return driverCommandList;
    }
}
