package com.company;
import java.io.File;
import java.io.IOException;


public class createfile {
    public static void main(String[] args)
    {
        try {
            File da = new File("Fisier.txt");
            if (da.createNewFile()) {
                System.out.println("Fisierul creat: " + da.getName());
            } else {
                System.out.println("Fisierul deja exista.");
            }
        }
        catch (IOException e)
        {
            System.out.println("A aparut o eroare.");
            e.printStackTrace();
        }

    }
}
