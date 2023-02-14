package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        zofka.setPenColor(Color.black);
        zofka.turnLeft(180);

        for (int i = 0; i < 4; i++) {

            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(225);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);

        zofka.penUp();
        zofka.move(200);

        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnLeft(135);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(45);
        zofka.move(100);
        zofka.turnLeft(135);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(100);

        //TODO tady bude kód
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
