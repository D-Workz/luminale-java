package output;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarqeuePanel extends JPanel implements Runnable
{
    private boolean IsStoped = false;
    private JLabel label;
    public MarqeuePanel(Dimension d,String text)
    {
        super();
        label = new JLabel();
        label.setText(text);
        label.setForeground(new Color(255,255,255));

        add(label);
        setPreferredSize(d);
        setOpaque(true);
        setBackground(new Color(0,0,0));
        label.setLocation(this.getWidth()/2,0);
        Thread t = new Thread(this);
        t.start();
    }

    public void setNewDimensions (Dimension d){
        this.setSize(d);
    }

    @Override
    public void run() 
    {
        //Marqueue
        label.setLocation(this.getWidth()/2,0);
        while(!IsStoped)
        {
            if(label.getLocation().y > this.getHeight())
            {
                label.setLocation(this.getWidth()/2,0);
            }
            else
            {
                int x = this.getWidth()/2;
                int y = label.getLocation().y + 1;
                label.setLocation(x,y);
            }
            try{Thread.sleep(50);}catch(Exception exc){}
        }
    }

    public void StopMarque()
    {
        IsStoped = true;
    }
}