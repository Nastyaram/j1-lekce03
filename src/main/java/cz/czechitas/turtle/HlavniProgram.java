package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

       ctverec(100, Color.GREEN);

       zofka.penUp();
       zofka.turnLeft(90);
       zofka.move(300);
       zofka.turnRight(90);
       zofka.penDown();

       ctverec(200, Color.MAGENTA);



    }

    public void ctverec(double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
         zofka.move(delkaStrany);
         zofka.turnRight(90);
        }
    }



    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
