package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

import edu.kis.powp.jobs2d.features.DrawerFeature; // added

/**
 * driver adapter to drawer with several bugs.
 */
public class BasicLineDrawerAdapter implements Job2dDriver
{
    private int startX = 0;
    private int startY = 0;

    private final DrawPanelController controller;
    private final Supplier<ILine> lineSupplier;

    public BasicLineDrawerAdapter(DrawPanelController controller, Supplier<ILine> lineSupplier)
    {
        this.controller = controller;
        this.lineSupplier = lineSupplier;
    }

    @Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = lineSupplier.get();

        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        controller.drawLine(line);

        setPosition(x, y);
    }

    @Override
    public String toString()
    {
        return "BasicLineDrawerAdapter";
    }
}
