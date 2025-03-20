package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand
{
    private final int x;
    private final int y;

    private Job2dDriver driver;

    public OperateToCommand(int x, int y, Job2dDriver driver)
    {
        this.x = x;
        this.y = y;

        this.driver = driver;
    }

    @Override
    public void execute()
    {
        driver.operateTo(x, y);
    }
}
