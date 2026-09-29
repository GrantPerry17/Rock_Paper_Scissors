/**
 * A strategy that randomly chooses Rock, Paper, or Scissors.
 */
public class Random implements Strategy
{
    private java.util.Random random;

    /**
     * Creates a Random strategy.
     */
    public Random()
    {
        random = new java.util.Random();
    }

    /**
     * Randomly determines the computer's move.
     *
     * @param playerMove the player's move
     * @return a randomly selected Rock, Paper, or Scissors move
     */
    @Override
    public String getMove(String playerMove)
    {
        int move = random.nextInt(3);

        if (move == 0)
        {
            return "R";
        }
        else if (move == 1)
        {
            return "P";
        }
        else
        {
            return "S";
        }
    }
}