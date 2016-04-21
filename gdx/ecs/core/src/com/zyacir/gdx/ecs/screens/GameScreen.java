package com.zyacir.gdx.ecs.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.zyacir.gdx.ecs.GameRenderer;
import com.zyacir.gdx.ecs.GameWorld;

/**
 * Created by alexoro on 3/6/16.
 */
public class GameScreen implements Screen {

    private final String TAG = "GameScreen";

    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen(){
//        super();
        Gdx.app.log(TAG, "Attached");
        world = new GameWorld();
        renderer = new GameRenderer(world);
    }

    @Override
    public void show() {
        Gdx.app.log(TAG, "show called");
    }

    @Override
    public void render(float delta) {
        // Sets a Color to Fill the Screen with (RGB = 10, 15, 230), Opacity of 1 (100%)
        Gdx.gl.glClearColor(10/255.0f, 15/255.0f, 230/255.0f, 1f);
        // Fills the screen with the selected color
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.app.log("GameScreen FPS", (1/delta)+"");
        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(TAG, "resizing");
    }

    @Override
    public void pause() {
        Gdx.app.log(TAG, "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log(TAG, "resume called");
    }

    @Override
    public void hide() {
        Gdx.app.log(TAG, "hide called");
    }

    @Override
    public void dispose() {

    }
}
