package com.zyacir.gdx.ecs;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.zyacir.gdx.ecs.screens.GameScreen;

public class GdkEcs extends Game{

	@Override
	public void create() {
		Gdx.app.log("GdkEcs", "created");
		setScreen(new GameScreen());
	}
}
