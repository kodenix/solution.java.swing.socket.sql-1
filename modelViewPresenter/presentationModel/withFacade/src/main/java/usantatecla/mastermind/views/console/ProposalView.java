package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.Console;

import java.util.List;

class ProposalView extends Console {

    private Logic logic;
    private SecretCombinationView secretCombinationView;
    private ProposedCombinationView proposedCombinationView;
    private ResultView resultView;

    ProposalView(Logic logic) {
        this.logic = logic;
        this.secretCombinationView = new SecretCombinationView(this.logic);
        this.proposedCombinationView = new ProposedCombinationView(this.logic);
        this.resultView = new ResultView(this.logic);
    }

    boolean interact() {
        Error error;
        do {
            List<Color> colors = this.proposedCombinationView.read();
            error = this.logic.addProposedCombination(colors);
            if (error != Error.NULL) {
                new ErrorView(error).writeln();
            }
        } while (error != Error.NULL);
        Console.getInstance().writeln();
        new AttemptsView(this.logic).writeln();
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.logic.getAttempts(); i++) {
            this.proposedCombinationView.write(i);
            this.resultView.writeln(i);
        }
        if (this.logic.isWinner()) {
            Console.getInstance().writeln(MessageView.WINNER.getMessage());
            return true;
        } else if (this.logic.isLooser()) {
            Console.getInstance().writeln(MessageView.LOOSER.getMessage());
            return true;
        }
        return false;
    }

}
