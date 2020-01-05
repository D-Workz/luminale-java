package output;

import util.LFrame;

import java.awt.*;
import java.util.List;
import javax.swing.*;

public class OutputStream extends LFrame {
    private List wordsToShow;
    public MarqeuePanel marqeuePanel;
    private Color fontColor;
    private Color backgroundColor;
    private int fontSize;
    private int scrollSpeed;


    public OutputStream(Dimension d) {
        super(d);
        this.setTitle("Output");
        this.initOutputStream();
//        this.fontColor = new Color();
//        this.backgroundColor;
//        this.fontSize;

    }



    private void initOutputStream() {
        this.marqeuePanel = new MarqeuePanel(this.contentDim,"hans");
        this.content.add(this.marqeuePanel);//adding button in JFrame
        JTextField textField = new JTextField();
//        textField.setBounds(128, 128, 86, 20);
        textField.setPreferredSize(new Dimension(86, 20));
        this.options.add(textField);
        textField.setColumns(10);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(120, 31, 46, 14);
        this.options.add(lblName);



    }

}