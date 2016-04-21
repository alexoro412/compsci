package com.zyacir.gdx.ecs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;

/**
 * Created by alexoro on 3/6/16.
 */
public class GameRenderer {

    private GameWorld world;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    private SpriteBatch batch;

    public GameRenderer(GameWorld world){
        this.world = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(false, 400, 240);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render(){
        Gdx.app.log("GameRenderer", "update");

        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(0.1f,0.7f,0.1f,1);
        shapeRenderer.rect(world.getRect().x, world.getRect().y, world.getRect().width, world.getRect().height);
        shapeRenderer.end();

        shapeRenderer.begin(ShapeType.Line);
        shapeRenderer.setColor(0.7f,0.1f,0.1f,1);
        shapeRenderer.rect(world.getRect().x, world.getRect().y, world.getRect().width, world.getRect().height);
        shapeRenderer.end();

        batch.begin();
//        batch.
        batch.end();
    }

}
