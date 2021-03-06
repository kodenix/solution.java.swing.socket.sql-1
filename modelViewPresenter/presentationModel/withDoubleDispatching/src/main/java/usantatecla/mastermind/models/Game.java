package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final int MAX_LONG = 10;

    private SecretCombination secretCombination;

    private List<ProposedCombination> proposedCombinations;

    private List<Result> results;

    private int attempts;

    public Game() {
        this.reset();
    }

    public void reset() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ArrayList<>();
        this.results = new ArrayList<>();
        this.attempts = 0;
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposedCombinations.add(proposedCombination);
        this.results.add(this.secretCombination.getResult(proposedCombination));
        this.attempts++;
    }

    public boolean isLooser() {
        return this.attempts == Game.MAX_LONG;
    }

    public boolean isWinner() {
        return this.attempts > 0 && this.results.get(this.attempts - 1).isWinner();
    }

    public int getAttempts() {
        return this.attempts;
    }

    public ProposedCombination getProposedCombination(int position) {
        assert position < this.proposedCombinations.size();

        return this.proposedCombinations.get(position);
    }

    public Result getResult(int position) {
        assert position < this.results.size();

        return this.results.get(position);
    }

}
