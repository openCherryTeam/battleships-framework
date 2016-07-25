package de.cherry;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main
{

    public static void main(String[] args)
    {
        try
        {
            URLClassLoader bot = URLClassLoader.newInstance(new URL[]{new URL(args[0]), new URL(args[1])});

        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }



        SchiffeversenkenBot schiffeversenkenBot1 = new SchiffeversenkenBot1();
        SchiffeversenkenBot schiffeversenkenBot2 = new SchiffeversenkenBot2();

        String[] st = {"","","",""};

        Arena arena = new Arena();
        arena.startGame(schiffeversenkenBot1, schiffeversenkenBot2);


    }
}
