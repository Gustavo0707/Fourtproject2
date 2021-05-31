package Gustavotestescom.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        float[] nota = {0,0,0,0,0};
        int x;
        float t, media=0;

        for(x=1;x<=4;x++){

            String m = JOptionPane.showInputDialog(null,"Insira a "+x+"º nota");

            t = Integer.parseInt(m);

            nota[x] = t;

        }

        for(x=1;x<=4;x++){

            media = media + nota[x];

        }

        media = media/4;

        JOptionPane.showMessageDialog(null,"As notas foram: \nNota 1: "+nota[1]+"\nNota 2: "+nota[2]+"\nNota 3: "+nota[3]+"\nNota 4: "+nota[4]+"\n\nA média é "+media);

    }
    }

