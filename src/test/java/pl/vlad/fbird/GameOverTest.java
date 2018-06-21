package pl.vlad.fbird;

import org.junit.Test;

import static org.junit.Assert.*;


public class GameOverTest {
    @Test
    public void check() throws Exception {
        GameOver game = new GameOver();
        assertFalse(game.check());

    }

}