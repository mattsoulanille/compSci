/**
  * GraphicBoard.java program
  * @author Matthew Soulanille
  * @version 2014-12-03
*/
import javax.swing.JFrame;

public class GraphicBoard
{
    public GraphicBoard(int x, int y)
    {
	JFrame board = new JFrame();
	board.setTitle("Game of Life");
	board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	board.setSize(x*10,y*10);


    }
    public static void draw()
    {
	board.draw();
    }

}
