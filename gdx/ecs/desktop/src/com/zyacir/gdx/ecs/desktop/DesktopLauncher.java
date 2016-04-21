package com.zyacir.gdx.ecs.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.zyacir.gdx.ecs.GdkEcs;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "HEYO!";
		config.width = 800;
        config.height = 480;
		new LwjglApplication(new GdkEcs(), config);
	}
}
