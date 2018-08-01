package org.tyaa.springcontextdemo2.implementations;

import org.tyaa.springcontextdemo2.interfaces.IPlayField;

public class PlayField implements IPlayField {
	
	public PlayField() {
		show();
	}

	@Override
	public void show() {
		System.out.println("The playing field is shown");
	}

}
