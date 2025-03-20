package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.*;

import java.util.ArrayList;
import java.util.List;

public class RectFactory
{
    public static ComplexCommand createRectangle(Job2dDriver driver)
    {
        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(0, 0, driver));
        commands.add(new OperateToCommand(100, 0, driver));
        commands.add(new OperateToCommand(100, 100, driver));
        commands.add(new OperateToCommand(0, 100, driver));
        commands.add(new OperateToCommand(0, 0, driver));

        return new ComplexCommand(commands);
    }
}