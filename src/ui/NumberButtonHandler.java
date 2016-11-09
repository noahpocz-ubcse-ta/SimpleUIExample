package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;

public class NumberButtonHandler implements ActionListener {

	/* The ButtonHandler needs to have a association relationship with the Model so that it can notify the model
	 * when the button has been pressed. */
	Model _model;
	
	public NumberButtonHandler(Model m) {
		_model = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		_model.increaseNumber();
	}	
}
