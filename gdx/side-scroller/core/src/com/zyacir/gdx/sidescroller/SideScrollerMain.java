package com.zyacir.gdx.sidescroller;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.uwsoft.editor.renderer.SceneLoader;

public class SideScrollerMain extends ApplicationAdapter {


	private SceneLoader sceneLoader;

	@Override
	public void create () {
		Viewport viewport = new FitViewport(266, 160);

		sceneLoader = new SceneLoader();
		sceneLoader.loadScene("MainScene", viewport);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


		sceneLoader.getEngine().update(Gdx.graphics.getDeltaTime());
	}
}
