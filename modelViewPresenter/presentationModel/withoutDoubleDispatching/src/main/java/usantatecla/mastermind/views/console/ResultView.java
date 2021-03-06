package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.Console;

public class ResultView extends ConsoleView {
	
	private ProposalController proposalController;
	
	public ResultView(ProposalController proposalController){
		this.proposalController = proposalController;
	}

	public void writeln(int position) {
		Console.getInstance().writeln(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + this.proposalController.getBlacks(position))
				.replaceFirst("#whites", "" + this.proposalController.getWhites(position)));
	}

}
