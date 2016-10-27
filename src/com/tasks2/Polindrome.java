package com.tasks2;

import java.security.PublicKey;
import java.util.Scanner;

/**
 * Created by Osipenko on 27.10.2016.
 */
public class Polindrome {
    private String Poli;
    Scanner sc;
    public Polindrome(int Num)
    {
      Poli = Integer.toString(Num);

    }
    public Polindrome(String word)
    {
        Poli = word;
    }


    public boolean Polin()
    {
        for(int start=0, end = Poli.length()-1; start != Poli.length()/2; start++, end-- )
        {
            if(Poli.charAt(start) != Poli.charAt(end)) {
                return false;
                         }
        }
        return true;
    }
}
