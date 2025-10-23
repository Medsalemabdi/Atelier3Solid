package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();

        electricDuck.turnOn();


        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Quackable... ducks)
    {
        for (Quackable duck : ducks) {
            if (duck instanceof Switchable) {
                if ( ! ((Switchable) duck).isOn()){
                    continue;
                }
            }
            duck.quack();
        }
    }

    private void swim(Swimmable... ducks)
    {
        for (Swimmable duck : ducks) {
            if (duck instanceof Switchable) {
                if ( ! ((Switchable) duck).isOn()){
                    continue;
                }
            }
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
