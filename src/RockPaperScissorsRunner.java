import java.awt.Dimension;
import java.awt.Toolkit;

public class RockPaperScissorsRunner
{
    public static void main(String[] args)
    {
        RockPaperScissorsFrame frame = new RockPaperScissorsFrame();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int width = (int)(screenSize.width * 0.75);
        int height = (int)(screenSize.height * 0.75);

        frame.setSize(width, height);
        frame.setLocation((screenSize.width - width) / 2,
                          (screenSize.height - height) / 2);

        frame.setVisible(true);
    }
}