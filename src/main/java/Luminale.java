import input.InputStream;
import output.OutputStream;

import javax.swing.*;
import java.awt.*;

public class Luminale extends JFrame {
    private OutputStream output;
    private InputStream input;

    public Luminale(){

        output = new OutputStream(new Dimension(400, 600));
        input = new InputStream(new Dimension(400, 400), this.output);

    }


    public static void main(String args[])
    {

        new Luminale();

//        InputStream inputStream = new InputStream();
//        JButton b=new JButton("click");//creating instance of JButton
//        b.setBounds(130,100,100, 40);//x axis, y axis, width, height
//
//        this.f.add(b);//adding button in JFrame
//
//        this.f.setSize(400,500);//400 width and 500 height
//        f.setLayout(null);//using no layout managers
//        f.setVisible(true);//making the frame visible
//
//
//        System.out.println("Hello, World");
    }
}
