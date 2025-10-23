package com.directi.training.lsp.exercise;

public class ElectronicDuck implements Quackable, Swimmable, Switchable
{
    private boolean _on = false;
    public void quack()
    {
        System.out.println("Electronic Quack...");
    }

    public void swim()
    {
        System.out.println("Electronic Duck is swimming...");
    }

    public boolean isOn()
    {
        return _on;
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
