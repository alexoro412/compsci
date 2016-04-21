package com.zyacir.gdx.ecs;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
/**
 * Created by alexoro on 3/6/16.
 */
public class GameWorld {

    private Rectangle rect = new Rectangle(0, 0, 17, 12);

    public void update(float dt){
        Gdx.app.log("GameWorld", "Update");
        rect.x++;
        if (rect.x > 400) {
            rect.x = 0;
        }
    }

    public Rectangle getRect(){
        return rect;
    }

}
