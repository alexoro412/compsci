/**
 * Created by alexoro on 9/23/15.
 */

import java.applet.Applet;
//We are also using Point and a class called Graphics, so import this too
import java.awt.*;

public class StickFigureFam extends Applet{

    public void paint(Graphics g){

//        StickFigurePrimitive alex = new StickFigurePrimitive(5,1);
//        StickFigurePrimitive ale = new StickFigurePrimitive(50,1);

        StickFigurePrimitive a = new StickFigurePrimitive(50,1);
        a.setColor(255, 0, 0);

        StickFigurePrimitive b = a.duplicate();
        b.getDarker();
        b.translate(50);

        StickFigurePrimitive c = b.duplicate();
        c.getDarker();
        c.translate(50);

        StickFigurePrimitive d = c.duplicate();
        d.getDarker();
        d.translate(50);

        StickFigurePrimitive e = d.duplicate();
        e.getDarker();
        e.translate(50);

        StickFigurePrimitive f = e.duplicate();
        f.getDarker();
        f.translate(50);

        StickFigurePrimitive g1 = e.duplicate();
        g1.getDarker();
        g1.translate(50);

        StickFigurePrimitive h = g1.duplicate();
        h.getDarker();
        h.translate(50);


        a.draw(g);
        b.draw(g);
        c.draw(g);
        d.draw(g);
        e.draw(g);
        f.draw(g);
        g1.draw(g);
        h.draw(g);


        StickFigurePrimitive fam3 = new StickFigurePrimitive(600,1);
        StickFigurePrimitive fam1 = new StickFigurePrimitive(460,1.5);
        StickFigurePrimitive fam2 = new StickFigurePrimitive(540,1.2);
        StickFigurePrimitive fam4 = new StickFigurePrimitive(650,0.75);
        StickFigurePrimitive fam5 = new StickFigurePrimitive(700,0.5);
        StickFigurePrimitive fam6 = new StickFigurePrimitive(750,0.1);

        fam1.draw(g);
        fam2.draw(g);
        fam3.draw(g);
        fam4.draw(g);
        fam5.draw(g);
        fam6.draw(g);




//        g.drawOval(30, 30, 30, 30);
//        alex.draw(g);
//        ale.draw(g);
//        c.draw(g);
        b.draw(g);
//        d.draw(g);

    }

}
