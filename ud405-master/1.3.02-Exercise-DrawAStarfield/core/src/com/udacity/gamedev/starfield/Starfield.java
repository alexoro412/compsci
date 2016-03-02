package com.udacity.gamedev.starfield;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

import java.util.Random;

/**
 * TODO: Start here!
 *
 * In this exercise we'll draw a star field of white points on a black background. The number of
 * points will be defined by a density parameter that states what proportion of the pixels should be
 * white.
 *
 * TODO: Run what you've got before making any changes
 *
 * One thing to note is we're using two new LibGDX classes, Array, and Vector2. We're using a custom
 * Array type so LibGDX can control the memory, and avoid unfortunate garbage collection events.
 * Vector2 is a super simple class for holding a 2D position. You can find more information in the
 * LibGDX Javadocs, or just by right clicking on the class name, and selecting Go To > Declaration.
 *
 * One new utility class we'll be using in this exercise is com.badlogic.gdx.math.Vector2. You can
 * find more information in the LibGDX Javadocs.
 *
 * Remember you can set up a Desktop run configuration using the dropdown in the toolbar, or you can
 * open the terminal at the bottom of the screen and run
 *
 * $ ./gradlew desktop:run
 */


public class Starfield extends ApplicationAdapter {

    private static final float STAR_DENSITY = 0.01f;
    private static final String TAG = Starfield.class.getName();
    ShapeRenderer shapeRenderer;
    Array<Vector2> stars;

    @Override
    public void create() {
        // TODO: Initialize a shapeRenderer
        this.shapeRenderer = new ShapeRenderer();

        // TODO: Call initStars
        this.initStars(STAR_DENSITY);
    }

    public void initStars(float density) {
        // TODO: Figure out how many stars to draw. You'll need the screen dimensions, which you can get using Gdx.graphics.getWidth() and Gdx.graphics.getHeight().
        float numStars = (Gdx.graphics.getWidth() * Gdx.graphics.getHeight() * density);
        Gdx.app.log(TAG, "" + numStars);
        // TODO: Create a new array of Vector2's to hold the star positions
        stars = new Array<Vector2>();
        // TODO: Use java.util.Random to fill the array of star positions
        Random r = new Random();
//        Vector2 a = new Vector2(0.0, 0.0);
        //            Gdx.app.log(TAG, "(" + stars.get(i).)
        for (int i = 0; i < (int)(numStars); i++) {
            stars.add(new Vector2(r.nextInt(Gdx.graphics.getWidth()), r.nextInt(Gdx.graphics.getHeight())));
        }
    }
    @Override
    public void render() {
        // TODO: Make the night sky black
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        initStars(STAR_DENSITY);
        // TODO: Begin a shapeRenderer batch using ShapeType.Point
        shapeRenderer.begin(ShapeType.Line);
//        shapeRenderer.point(100,100,0);
        // TODO: Loop through the star positions and use shapeRenderer to draw points
        for(int i = 0;i+1<stars.size;i+=2){
            shapeRenderer.line(stars.get(i).x, stars.get(i).y, stars.get(i + 1).x, stars.get(i + 1).y, Color.DARK_GRAY, Color.LIGHT_GRAY);
        }
        // TODO: End the shapeRenderer batch
//        shapeRenderer.setColor(Color.BLUE);
//        float[] vertices = {100, 200, 300, 300, 200, 300, 300, 200};
//        shapeRenderer.polyline(vertices);

        shapeRenderer.end();
        shapeRenderer.begin(ShapeType.Point);
        shapeRenderer.setColor(Color.WHITE);
        for(int i = 0;i<stars.size;i++){
            shapeRenderer.point(stars.get(i).x,stars.get(i).y,0);
        }
        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        // TODO: Dispose of our ShapeRenderer
        shapeRenderer.dispose();
        super.dispose();
    }
}
