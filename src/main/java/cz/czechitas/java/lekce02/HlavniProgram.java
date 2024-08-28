package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

import java.awt.*;
import java.util.Random;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();


       /* var pozdrav = "Hello world!";
        System.out.println(pozdrav);


        var random = new Random();
        var cislo = random.nextInt(6) + 1;
        while (cislo != 6) {
            System.out.println("Padlo číslo " + cislo + ". Hoď ještě jednou.");
            cislo = random.nextInt(6) + 1;
        }
        System.out.println("Hodil jsi 6, nasaď figurku a hraj.");


        for (int i = 0; i < ; i++) {      //fori + tab = kostra for cyklu + tab procházím místa doplnění

        }

        nakresliCtverec();

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliCtverec();

    }

    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        } */

        zofka.setLocation(100,100);

        for (int i = 0; i < 6; i++) {
            nakresliDomecek();

            zofka.turnLeft(45);
            zofka.penUp();
            zofka.move(50);
            zofka.penDown();
            zofka.turnLeft(90);
        }

        zofka.setLocation(400,350);

        nakresliPrasatko();


    }

    private void nakresliPrasatko() {
        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(45);
        zofka.move(120);
        zofka.turnRight(90);
        zofka.move(100);

        zofka.turnLeft(40);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(100);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);

        zofka.turnLeft(130);
        zofka.move(120);

        zofka.turnLeft(130);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(100);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);

        zofka.turnLeft(40);
        zofka.move(100);
    }

    private void nakresliDomecek() {
        zofka.turnRight(90);
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(70.7106781);
        zofka.turnRight(90);
        zofka.move(70.7106781);
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
