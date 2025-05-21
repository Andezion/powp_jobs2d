package edu.kis.powp.commands;

import java.util.List;

public class ComplexCommand
{
    private List<DriverCommand> driverCommandList;

    public ComplexCommand(List<DriverCommand> driverCommandList)
    {
        this.driverCommandList = driverCommandList;
    }

    public void start()
    {
        this.driverCommandList.forEach((driverCommand) -> driverCommand.execute());
    }
}
