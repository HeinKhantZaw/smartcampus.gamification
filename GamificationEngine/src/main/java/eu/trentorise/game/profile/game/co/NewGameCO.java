package eu.trentorise.game.profile.game.co;

import eu.trentorise.game.profile.game.model.Game;

/**
 *
 * @author Luca Piras
 */
public class NewGameCO {
    
    protected Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "NewGameCO{" + "game=" + game + '}';
    }
}