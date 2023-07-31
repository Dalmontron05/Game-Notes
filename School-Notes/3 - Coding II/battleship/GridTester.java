public class GridTester extends Thread
{
    public void run()
    {
        // Your test code here.
        Grid test = new Grid();
        test.setShip(2, 3, true);
        test.markHit(2, 3);
        test.markHit(5, 7);
        test.printStatus();
    }
}