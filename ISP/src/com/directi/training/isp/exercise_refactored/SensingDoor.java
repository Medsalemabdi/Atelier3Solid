package com.directi.training.isp.exercise;

public class SensingDoor implements Door, ProximityClient
{
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor)
    {
        sensor.register(this); // OK: this is a ProximityClient
    }

    @Override
    public void lock()  { _locked = true; }

    @Override
    public void unlock(){ _locked = false; }

    @Override
    public void open()  { if (!_locked) _opened = true; }

    @Override
    public void close() { _opened = false; }

    // From ProximityClient only
    @Override
    public void proximityCallback()
    {
        _opened = true;
    }
}
