package edu.kis.powp.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class operateToCommand implements driverCommand
{
    private Job2dDriver driver;
    private final int x;
    private final int y;

    public operateToCommand(int x, int y, Job2dDriver driver)
    {
        this.x = x;
        this.y = y;

        this.driver = driver;
    }

    public void setDriver(Job2dDriver driver)
    {
        this.driver = driver;
    }

    @Override
    public void start()
    {
        driver.operateTo(this.x, this.y);
    }
}
