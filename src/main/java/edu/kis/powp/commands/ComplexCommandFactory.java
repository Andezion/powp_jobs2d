package edu.kis.powp.commands;

import java.util.ArrayList;
import java.util.List;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.MyAdapter;

public class ComplexCommandFactory
{
    public static ComplexCommand getRectangle()
    {
        List<DriverCommand> driverCommandList = new ArrayList<>();
        Job2dDriver driver = new MyAdapter();

        driverCommandList.add(new SetPositionCommand(-120, -120, driver));
        driverCommandList.add(new OperateToCommand(120, -120, driver));
        driverCommandList.add(new OperateToCommand(120, 120, driver));
        driverCommandList.add(new OperateToCommand(-120, 120, driver));
        driverCommandList.add(new OperateToCommand(-120, -120, driver));

        return new ComplexCommand(driverCommandList);
    }

    public static ComplexCommand getTriangle()
    {
        List<DriverCommand> driverCommandList = new ArrayList<>();
        Job2dDriver driver = new MyAdapter();

        driverCommandList.add(new SetPositionCommand(0, 0, driver));
        driverCommandList.add(new OperateToCommand(120, 120, driver));
        driverCommandList.add(new OperateToCommand(0, 240, driver));
        driverCommandList.add(new OperateToCommand(0, 0, driver));

        return new ComplexCommand(driverCommandList);

    }
}
