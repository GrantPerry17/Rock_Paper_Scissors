/**
 * A strategy that chooses the move that will beat the player's move.
 */
public class Cheat implements Strategy
{
    /**
     * Determines the computer's move based on the player's move.
     *
     * @param playerMove the player's move
     * @return the move that beats the player's move
     */
    @Override
    public String getMove(String playerMove)
    {
        String computerMove = "";

        switch (playerMove)
        {
            case "R":
                computerMove = "P";
                break;
            case "P":
                computerMove = "S";
                break;
            case "S":
                computerMove = "R";
                break;
            default:
                computerMove = "X";
                break;
        }

        return computerMove;
    }
}