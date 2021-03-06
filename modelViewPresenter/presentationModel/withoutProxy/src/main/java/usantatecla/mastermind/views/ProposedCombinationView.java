package usantatecla.mastermind.views;

import java.util.ArrayList;
import java.util.List;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.types.Color;
import usantatecla.utils.WithConsoleView;

class ProposedCombinationView extends WithConsoleView {
	
	private PlayController playController;
	
	ProposedCombinationView(PlayController playController) {
		this.playController = playController;
	}
	
	void write(int i) {
		for (Color color : this.playController.getColors(i)) {
			new ColorView(color).write();
		}
	}

	List<Color> read() {
		String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}
	
}
