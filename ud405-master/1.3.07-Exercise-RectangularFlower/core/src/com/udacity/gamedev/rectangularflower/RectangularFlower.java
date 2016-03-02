package com.udacity.gamedev.rectangularflower;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

/**
 * TODO: Start Here
 *
 * In this exercise, we're going to draw a flower using only rectangles! We've already started off
 * with a green rectline for the stem. First you'll draw a couple leaves using rotated rectangles.
 *
 * Then you'll draw the head of the flower by drawing a a bunch of rotated squares!
 */

public class RectangularFlower extends ApplicationAdapter {

    ShapeRenderer shapeRenderer;

    @Override
    public void create () {
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    public void dispose() {
        super.dispose();
        shapeRenderer.dispose();
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(Color.GREEN);
        shapeRenderer.rectLine(100, 0, 100, 300, 20);

        // TODO: Draw two leaves on the stem
//        shapeRenderer.setColor(Color.PURPLE);
        shapeRenderer.rect(100,200,0,0,40,40,2,1,135);
        shapeRenderer.rect(100,200,0,0,40,40,1,2,-45);
        // TODO: Set the active color to yellow

        // TODO: Use a loop to draw 20 of these petals in a circle

        float petalAngle = 45.0f;
//        shapeRenderer.rect(80, 320, 20, 20, 40, 40, 1, 1, petalAngle);
        for (int i = 0; i < 20; i++) {
            shapeRenderer.rect(100, 300, 0, 0, 40, 40, 1, 1, 360.0f * i / 20);
//            petalAngle+=5;
//            shapeRenderer.setColor(0x001100);
//            shapeRenderer.rect(80, 320, 20, 20, 40, 40, 1, 1, petalAngle);
        }
        shapeRenderer.end();
    }
}
