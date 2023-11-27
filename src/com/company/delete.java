package com.company;
import java.io.File;

public class delete {
    public static void main(String[] args)
    {
        File da = new File("Fisier.txt");
        if (da.delete())
        {
            System.out.println("Sters: " + da.getName());
        }
        else
        {
            System.out.println("Eroare");
        }
    }
}
