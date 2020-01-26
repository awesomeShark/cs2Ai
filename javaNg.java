import java.util.ArrayList;
import java.util.Random;

public class  javaNg implements PlayerInt
{
    private char letter;
    private String name;

    // Pre:		receives a char letter
    // Post: 	sets the name to "Random AI" and the letter to the letter received
    javaNg(char letter)
    {
        name 		= "Hemanth";
        this.letter	= letter;
    }

    public char getLetter()
    {
        return letter;
    }

    // Pre:		method is called
    // Post: 	returns the Location where the player wants to move
    public Location getMove(Board board)
    {

        LocationScore ls = null;
        Location l;
        int score;


        for (int sheet = 0; sheet < 4; sheet++) {
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    l = new Location(sheet,row,col);
                    score = new gradeMove(board, l, letter).getScore();
                    if(board.getLocation(l)!='-')
                        continue;
                    else if(ls==null)
                    {
                        ls = new LocationScore(score, l);
                    }
                    else if(ls.getScore()<=score)
                    {
                        ls = new LocationScore(score,l);
                        System.out.println("changed");
                    }
                }
            }
        }



		/*Random rand = new Random();
		do
		{
			l = new Location(rand.nextInt(4),rand.nextInt(4),rand.nextInt(4));
		}while(!board.isEmpty(l));*/



		/*
		gradeMove grade = new gradeMove(board,ls.getLoc(),letter);
			System.out.println("\nNew Move");
			System.out.println("Score: " + grade.score);
			System.out.println("oneIn: " + grade.oneInARow);
			System.out.println("twoIn: " + grade.twoInARow);
			System.out.println("threeIn: " + grade.threeInARow);
			System.out.println("fourIn: " + grade.fourInARow);
			System.out.println("----Opponent Section----");
			System.out.println("opOne: "+grade.opOne);
			System.out.println("opTwo: "+grade.opTwo);
			System.out.println("opThree: "+grade.opThree);
			System.out.println("opFour: "+grade.opFour);

		 */


        /*try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }*/

        System.out.println(ls.getLoc().toString());

        return ls.getLoc();
    }

    // Pre:		method is called
    // Post: 	returns the name of the player
    public String getName()
    {
        return name;
    }

    public PlayerInt freshCopy()
    {
        return new javaNg(letter);
    }
}