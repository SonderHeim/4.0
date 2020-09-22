import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class main extends JFrame
{
    int Millan = 0, Spain = 0;
    JButton Madrid = new JButton("Real Madrid");
    JButton ACMillan = new JButton("AC Millan");
    JLabel Score = new JLabel("Result 0 X 0");
    JLabel LastScorer = new JLabel("Last Scorer: N/A");
    Label Winner = new Label("Winner:Match shoud be started");

    public main()
    {

        super("Football Score Register");
        setSize(500, 500);
        setLayout(null);
        Font fontForScore = new Font("Times new Roman", Font.BOLD, 20);

        Madrid.setBounds(290, 330, 180, 40);
        ACMillan.setBounds(30, 330, 180, 40);
        Score.setBounds(220,200,100,40);
        Score.setText(Millan + " vs " + Spain);
        Score.setFont(fontForScore);
        Winner.setBounds(100,120,300,25);
        Winner.setFont(fontForScore);
        LastScorer.setBounds(185,380,250,20);

        add(ACMillan);
        add(Madrid);
        add(Score);
        add(LastScorer);
        add(Winner);

        ACMillan.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a)
            { }

            public void mouseClicked(MouseEvent a)
            {
                Winner.setBounds(160,120,300,25);
                Millan++;
                Score.setText(Millan + " vs " + Spain);
                LastScorer.setText("Last Scorer: AC Millan");
                winnerUpdate();

            }

            public void mouseEntered(MouseEvent a)
            { }

            public void mouseReleased(MouseEvent a)
            { }

            public void mousePressed(MouseEvent a)
            { }
        });

        Madrid.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a)
            { }

            public void mouseClicked(MouseEvent a)
            {
                Winner.setBounds(160,120,300,25);
                Spain++;
                Score.setText(Millan + " vs " + Spain);
                LastScorer.setText("Last Scorer: Real Madrid");
                winnerUpdate();
            }

            public void mouseEntered(MouseEvent a)
            { }

            public void mouseReleased(MouseEvent a)
            { }

            public void mousePressed(MouseEvent a)
            { }
        });

    }

    private void winnerUpdate()
    {
        if (Millan > Spain)
        {
            Winner.setText("Winner: AC Millan");
        } else if (Millan < Spain)
        {
            Winner.setText("Winner: Real Madrid");
        } else if (Millan == Spain)
        {
            Winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args)
    {
        main run = new main();
        run.setVisible(true);
    }
}