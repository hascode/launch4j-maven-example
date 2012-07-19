package com.hascode.tutorial;

import javax.swing.JColorChooser;
import javax.swing.JDialog;

public class Main extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JColorChooser cc;

	public Main() {
		setSize(800, 600);
		setTitle("hasCode.com launch4j Maven Tutorial");
		cc = new JColorChooser();
		add(cc);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(final String[] args) {
		new Main();
	}

}
