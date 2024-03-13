import java.awt.*;
import java.awt.event.*;
import javax.swing.event.MouseInputAdapter;

public class XOgame extends Frame
{
    Panel p1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button reset,newgame;
    public Label l1,l2,l3;
    int play=1;

    public XOgame()
    {
        l1=new Label("Player 1 = O *");
        l2=new Label("Player 2 = X");
        l3=new Label("");
        add(l1);
        add(l2);
        add(l3);

	Font f2=new Font("Arial",Font.BOLD,30);
	l1.setBounds(700,100,220,50);
	l2.setBounds(700,200,220,50);
	l3.setBounds(700,300,220,50);
	l1.setFont(f2);
	l2.setFont(f2);
	
	Font f3=new Font("Italic",Font.BOLD,24);
	l3.setFont(f3);

        //game buttons

        b1=new Button("");
        b2=new Button("");
        b3=new Button("");
        b4=new Button("");
        b5=new Button("");
        b6=new Button("");
        b7=new Button("");
        b8=new Button("");
        b9=new Button("");

	Font f1=new Font("Italic",Font.BOLD,80);
	b1.setFont(f1);
	b2.setFont(f1);
	b3.setFont(f1);
	b4.setFont(f1);
	b5.setFont(f1);
	b6.setFont(f1);
	b7.setFont(f1);
	b8.setFont(f1);
	b9.setFont(f1);

        //special buttons

        reset=new Button("Reset");
        newgame=new Button("Close");
        p1=new Panel();
        p1.setLayout(new GridLayout(3,3));
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.setSize(500,500);
        p1.setLocation(30,80);
        setLayout(null);
        add(p1);
        add(reset);
        add(newgame);
	reset.setBounds(700,500,100,50);
	newgame.setBounds(850,500,100,50);

	newgame.setForeground(new Color(139,0,0));
	reset.setForeground(new Color(139,0,0));
	b1.setForeground(new Color(0,124,128));
	b2.setForeground(new Color(0,124,128));
	b3.setForeground(new Color(0,124,128));
	b4.setForeground(new Color(0,124,128));
	b5.setForeground(new Color(0,124,128));
	b6.setForeground(new Color(0,124,128));
	b7.setForeground(new Color(0,124,128));
	b8.setForeground(new Color(0,124,128));
	b9.setForeground(new Color(0,124,128));

	Font f=new Font("Arial",Font.BOLD,20);
	reset.setFont(f);
	newgame.setFont(f);

        b1.addMouseListener(new Event());
        b2.addMouseListener(new Event());
        b3.addMouseListener(new Event());
        b4.addMouseListener(new Event());
        b5.addMouseListener(new Event());
        b6.addMouseListener(new Event());
        b7.addMouseListener(new Event());
        b8.addMouseListener(new Event());
        b9.addMouseListener(new Event());

        reset.addMouseListener(new ResetAndNewGame());
        newgame.addMouseListener(new ResetAndNewGame());
    }
    class Event extends MouseAdapter
    { 
        public void check(String s)
        {
            if(s==b1.getLabel() && s==b2.getLabel() && s==b3.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b4.getLabel() && s==b5.getLabel() && s==b6.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b7.getLabel() && s==b8.getLabel() && s==b9.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b1.getLabel() && s==b4.getLabel() && s==b7.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b2.getLabel() && s==b5.getLabel() && s==b8.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b3.getLabel() && s==b6.getLabel() && s==b9.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b1.getLabel() && s==b5.getLabel() && s==b9.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b3.getLabel() && s==b5.getLabel() && s==b7.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b1.getLabel() && s==b2.getLabel() && s==b3.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
        }
        public void mouseClicked(MouseEvent me)
        {
            Button btn=(Button)me.getComponent();
            if(play==1)
            {
                btn.setLabel("O");
                l1.setText("Player 1 =>O");
                l2.setText("Player 2 => X *");
                play=0;
                check("O");
            }
            else{
                btn.setLabel("X");
                l1.setText("Player 1 =>O *");
                l2.setText("Player 2 => X");
                play=1;
                check("X");
            }
            btn.setEnabled(true);
        }
    }
    class ResetAndNewGame extends MouseAdapter
    {
        public void mouseClicked(MouseEvent me)
        {
            Button btn=(Button)me.getComponent();
            if(btn==reset)
            {
                b1.setEnabled(true);
                b1.setLabel("");
                b2.setEnabled(true);
                b2.setLabel("");
                b3.setEnabled(true);
                b3.setLabel("");
                b4.setEnabled(true);
                b4.setLabel("");
                b5.setEnabled(true);
                b5.setLabel("");
                b6.setEnabled(true);
                b6.setLabel("");
                b7.setEnabled(true);
                b7.setLabel("");
                b8.setEnabled(true);
                b8.setLabel("");
                b9.setEnabled(true);
                b9.setLabel("");l3.setText("");
                l1.setText("Player 1 =>O *");
                l2.setText("Player 2 => X");

            }
            else{
                dispose();
            }
        }
    }
    public static void main(String a[])
    {
        XOgame t1=new XOgame();
        t1.setVisible(true);
        t1.setTitle("XO GAME");
        t1.setSize(990,650);
        t1.setBackground(new Color(139,0,139));
    }
}