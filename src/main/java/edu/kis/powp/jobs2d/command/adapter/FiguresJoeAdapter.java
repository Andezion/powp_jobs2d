package edu.kis.powp.jobs2d.command.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.*;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.util.ArrayList;
import java.util.List;

public class FiguresJoeAdapter
{
    public static ComplexCommand fromFiguresJoe(Job2dDriver driver)
    {
        List<DriverCommand> commands = new ArrayList<>();
        FiguresJoe.figureScript1(new Job2dDriver()
        {
            @Override
            public void operateTo(int x, int y)
            {
                commands.add(new OperateToCommand(x, y, driver));
            }

            @Override
            public void setPosition(int x, int y)
            {
                commands.add(new SetPositionCommand(x, y, driver));
            }
        });

        return new ComplexCommand(commands);
    }
}