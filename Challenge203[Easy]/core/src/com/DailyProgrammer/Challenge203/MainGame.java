package com.DailyProgrammer.Challenge203;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;

	Texture background;
	Texture square;
	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Texture("BlackBackground.png");
		square = new Texture("RedSquare.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();

		batch.draw(background,0,0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.draw(square, 0, 0);
		batch.end();
	}
}
