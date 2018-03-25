//Brandon Shearrer
//60968
//Program 7 - First GUI


import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class GUI extends JFrame implements ActionListener
{
	public JPanel gridPanel;	
	private boolean showImage = false;
	private boolean showOval = true;
    private boolean showCenter = true;
    private JButton name;
    private JButton center;
    private JButton oval;
    private JButton image;
    private boolean color = true;
    public DrawPanel drawPanel;


	public GUI()
    {
        // Shows Hello GUI! in the title bar
        super("Brandon Shearrer");    

        // Sets the starting size for the frame
        this.setSize(1280,720);  

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = this.getContentPane();
        contentPane.setLayout( new BorderLayout() );

        // Create 4 buttons at top of frame
        gridPanel = new JPanel();
        gridPanel.setLayout( new GridLayout(1,4) );
        contentPane.add(gridPanel, BorderLayout.NORTH);
        contentPane.setBackground(Color.CYAN);

        image = new JButton("Image");
        image.setPreferredSize(new Dimension(100, 100));
        image.setFont(new Font("Arial", Font.PLAIN, 40));
        gridPanel.add(image);
        image.addActionListener(this);

        name = new JButton("Brandon");
        name.setPreferredSize(new Dimension(100, 100));
        name.setFont(new Font("Arial", Font.PLAIN, 40));
        gridPanel.add(name);
        name.addActionListener(this);

        center = new JButton("Center");
        center.setPreferredSize(new Dimension(100, 100));
        center.setFont(new Font("Arial", Font.PLAIN, 40));
        gridPanel.add(center);
        center.addActionListener(this);

        oval = new JButton("Oval");
        oval.setPreferredSize(new Dimension(100, 100));
        oval.setFont(new Font("Arial", Font.PLAIN, 40));
        gridPanel.add(oval);
        oval.addActionListener(this);

        drawPanel = new DrawPanel();
        contentPane.add(drawPanel, BorderLayout.CENTER);
        drawPanel.setBackground(Color.CYAN);

	}  

	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
        if (source == oval) 
        {
            showImage = false;
            showOval = true;
            System.out.println("Oval Button Pressed.");
            repaint();   
        } 
        else if (source == image) 
        {
            showOval = false;
            showImage = true;
            System.out.println("Image Button Pressed.");
            repaint();
        }
        else if (source == name)
        {
             if(color)
            {
                image.setBackground(Color.green);
                name.setBackground(Color.red);
                center.setBackground(Color.green);
                oval.setBackground(Color.red);
                color = false;
            }
            else
            {
                image.setBackground(Color.yellow);
                name.setBackground(Color.magenta);
                center.setBackground(Color.yellow);
                oval.setBackground(Color.magenta);
                color = true;
           }
            System.out.println("Name Button Pressed."); 
            repaint();
        }
        else if (source == center)
        {
            System.out.println("Center Button is Pressed.");
            drawPanel.x = drawPanel.getWidth()/2;
            drawPanel.y = drawPanel.getHeight()/2;
            showCenter = true;
            repaint();
        }
    }

	public static void main(String[] args)
    {
        GUI gui = new GUI();
        gui.setVisible(true);
        System.out.println("GUI Running");
        System.out.println("GUI Made By Brandon Shearrer");

         // Get the center point using getCenterPoint() in GraphicsEnvironment class
        Point p=GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        // Print the x co-ordinate
         System.out.println("The center x co-ordinate is "+p.x);
        // Print the y co-ordinate
        System.out.println("The center y co-ordinate is "+p.y);

    } 

    class DrawPanel extends JPanel
    {
        public int x;
        public int y;
        
        @Override
        public void paintComponent(Graphics g)
       {
            if(showOval)
            {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.RED);
                g2d.fillOval(x, y, 60, 60);

            }
            else if(showImage)
            {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.YELLOW);
                g2d.fillRect(x, y, 60, 60);
            }
        }
    }
}