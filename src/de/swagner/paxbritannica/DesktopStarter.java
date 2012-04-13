package de.swagner.paxbritannica;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

import de.swagner.paxbritannica.mainmenu.MainMenu;

public class DesktopStarter extends Game {
	
	public static void main(String[] args) {
		new LwjglApplication(new DesktopStarter(),
				"Pax Britannica", 1024, 550,false);
	}
	
	@Override 
	public void create () {
		setScreen(new MainMenu(this));
	}

}
