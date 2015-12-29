package JavaGame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;




public class Game extends StateBasedGame {


    public static final String gamename = "Ham Blaster";
    public static final int menu = 0;
    public static final int play = 1;


    public Game(String gamename) {
        super(gamename);
        this.addState(new MenuState(menu));
        this.addState(new Play(play));

    }

    public static void main(String[] args) {

        AppGameContainer appGameContainer; //this is basically my screen

        try {

            appGameContainer = new AppGameContainer(new Game(gamename));
            appGameContainer.setDisplayMode(1000, 1000, false);
            appGameContainer.start();


        }catch (Exception ex ){

            ex.printStackTrace();
        }


    }



    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {

        this.getState(menu).init(gameContainer, this);
        this.getState(play).init(gameContainer, this);
        this.enterState(menu); //choose the state to enter



    }
}