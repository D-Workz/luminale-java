package input;

import output.OutputStream;
import util.LFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputStream extends LFrame {
    OutputStream output;
    DragableText[] allWords;
    DragableText[] displayedWords;

    public InputStream(Dimension d, OutputStream out) {
        super(d);
        this.setTitle("Input");
        this.output = out;
        this.output.marqeuePanel.run();

    }

}


