package usantatecla.mastermind.views;

import usantatecla.utils.Console;

class AttemptsView {

    private int attempts;

    AttemptsView(int attempts) {
        this.attempts = attempts;
    }

    void writeln() {
        Console.getInstance().writeln(Message.ATTEMPTS.getMessage().replace("#attempts", "" + this.attempts));
    }
}