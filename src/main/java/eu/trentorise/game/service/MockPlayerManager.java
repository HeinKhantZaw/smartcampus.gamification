package eu.trentorise.game.service;

import eu.trentorise.game.model.player.Player;
import eu.trentorise.game.response.MockResponder;
import eu.trentorise.game.response.SuccessResponse;
import org.springframework.stereotype.Service;


@Service("mockPlayerManager")
public class MockPlayerManager extends MockResponder implements IPlayerManager {

    @Override
    public SuccessResponse add(Player player) {
        return this.getPositiveResponse();
    }
}