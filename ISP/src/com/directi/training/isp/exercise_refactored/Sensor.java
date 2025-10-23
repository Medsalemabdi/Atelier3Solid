package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(ProximityClient client)
    {
        while (true) {
            if (isPersonClose()) {
                client.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
