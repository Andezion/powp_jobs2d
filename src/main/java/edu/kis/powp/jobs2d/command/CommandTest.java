package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class CommandTest
{
    public static void main(String[] args)
    {
        Job2dDriver driver = new Job2dDriver()
        {
            @Override
            public void operateTo(int x, int y)
            {
                System.out.println("Driver operateTo action...");
            }

            @Override
            public void setPosition(int x, int y)
            {
                System.out.println("Driver setPosition action...");
            }
        };

        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(0, 0, driver));
        commands.add(new OperateToCommand(50, 50, driver));
        commands.add(new OperateToCommand(100, 100, driver));

        for (DriverCommand command : commands)
        {
            command.execute();
        }
    }
}

