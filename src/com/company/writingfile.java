package com.company;
import java.io.FileWriter;
import java.io.IOException;

public class writingfile {
    public static void main(String[] args)
    {
        try
        {
            FileWriter myWriter = new FileWriter("Fisier.txt");
            myWriter.write("Mesaj Test");
            myWriter.close();
            System.out.println("S-a scris.");
        }
        catch (IOException e)
        {
            System.out.println("Eroare.");
            e.printStackTrace();
        }
    }
}
