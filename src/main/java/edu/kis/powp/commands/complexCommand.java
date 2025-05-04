package edu.kis.powp.commands;

import java.util.List;

public class complexCommand
{
    private List<driverCommand> driverCommandList;

    public complexCommand(List<driverCommand> driverCommandList)
    {
        this.driverCommandList = driverCommandList;
    }

    public void start()
    {
        this.driverCommandList.forEach((driverCommand) -> driverCommand.start());
    }
}
