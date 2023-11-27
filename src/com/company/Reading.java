package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args)
    {
        try
        {
            File da = new File("Fisier.txt");
            Scanner Reader = new Scanner(da);
            while (Reader.hasNextLine())
            {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Eroare.");
            e.printStackTrace();
        }
    }
}
