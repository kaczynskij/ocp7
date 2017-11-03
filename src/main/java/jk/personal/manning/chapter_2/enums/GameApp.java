package jk.personal.manning.chapter_2.enums;

public class GameApp {

    Game game = null;
    
    public void startGame() {
	game = new Game();
	game.gameLevel = Level.BEGINNER;
    }
    
}
