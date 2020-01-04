package output;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.*;
import javax.swing.Timer;

public class OutputStream extends JFrame {
    private List wordsToShow;
    private MarqeuePanel marqeuePanel;
    private Color fontColor;
    private Color backgroundColor;
    private int fontSize;
    private int scrollSpeed;


    public OutputStream() {
        super();
        Dimension d = new Dimension(400, 400);
        this.marqeuePanel = new MarqeuePanel(d,"hans");
        this.runInputStream();
//        this.fontColor = new Color();
//        this.backgroundColor;
//        this.fontSize;

        this.marqeuePanel = new MarqeuePanel(d, "hans");
        this.add(this.marqeuePanel);
    }

    private void toogleFullScreen () {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Dimension d = env.getMaximumWindowBounds().getSize();
        this.setUndecorated(true);
        this.setExtendedState( getExtendedState() | JFrame.MAXIMIZED_VERT | Frame.MAXIMIZED_HORIZ);
    }

    private void runInputStream() {
        System.out.println("Hello, World");
        JPanel nav = new JPanel();
        JPanel content = new JPanel();
        JPanel mainPanel = new JPanel();








//        mainPanel.setSize(400,600);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        content.setSize(400,400);
        content.setLayout(null);
        content.setLocation(0,0);


        content.add(this.marqeuePanel);//adding button in JFrame

        nav.setSize(400,200);
        nav.setLayout(null);
//        nav.setLocation(200, content.getHeight());

        JTextField textField = new JTextField();
        textField.setBounds(128, 128, 86, 20);
        nav.add(textField);
        textField.setColumns(10);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(120, 31, 46, 14);
        nav.add(lblName);


        JButton b = new JButton("fullscreen");//creating instance of JButton
        b.setBounds(250, 160, 150, 40);//x axis, y axis, width, height
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                toogleFullScreen();
            }
        });

        nav.add(b);//adding button in JFrame


        mainPanel.add(content);
        mainPanel.add(nav);


//        this.f.setSize(400,500);//400 width and 500 height
//        f.setLayout(null);//using no layout managers
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);



        this.setSize(400,600);
        this.add(mainPanel);

        this.setVisible(true);//making the frame visible


        this.marqeuePanel.run();//        this.f.add(b);//adding button in JFrame

    }

}