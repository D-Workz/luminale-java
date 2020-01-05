package util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LFrame extends JFrame {

    private Dimension frameSize;
    protected Dimension contentDim;
    protected Dimension optionsDim;
    protected JPanel mainPanel = new JPanel();
    protected JPanel content = new JPanel();
    protected JPanel options = new JPanel();

    public LFrame(Dimension d){
        initProperties(d);
        initFrame(d);
        initPanels();
        this.setVisible(true);
    }

    private void initProperties(Dimension d){
        this.frameSize = d;
        int contentHeight = (this.frameSize.height / 3) * 2;
        int optionHeight = this.frameSize.height - contentHeight;
        this.contentDim = new Dimension(this.frameSize.width, contentHeight);
        this.optionsDim = new Dimension(this.frameSize.width, optionHeight);
    }

    private void initFrame (Dimension d) {
        this.setPreferredSize(this.frameSize);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
    }

    private void initFullscreenButton(){
        JButton b = new JButton("fullscreen");//creating instance of JButton
        b.setBounds(0, 0, 150, 40);//x axis, y axis, width, height
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                toogleFullScreen();
            }
        });
        this.options.add(b);
    }

    private void initPanels(){
        this.add(mainPanel, BorderLayout.CENTER);
        mainPanel.setPreferredSize(this.frameSize);
        content.setBackground(Color.GRAY);
        content.setPreferredSize(this.contentDim);
        content.setOpaque(true);
        options.setBackground(Color.DARK_GRAY);
        options.setPreferredSize(this.optionsDim);
        options.setOpaque(true);
        mainPanel.add(content);
        mainPanel.add(options);
        this.pack();
        initFullscreenButton();
    }

    private void toogleFullScreen () {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Dimension d = env.getMaximumWindowBounds().getSize();
        this.setUndecorated(true);
        this.setExtendedState( getExtendedState() | JFrame.MAXIMIZED_VERT | Frame.MAXIMIZED_HORIZ);
    }

}
