package com.directi.training.lsp.exercise;

public class Duck implements Quackable, Swimmable
{
    public void quack()
    {
        System.out.println("Quack...");
    }

    public void swim()
    {
        System.out.println("Swim...");
    }
}
