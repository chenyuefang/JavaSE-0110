package demo.day04;

public class Division {

    private int x;
    private int y;

    public Division(int x, int y) {
        this.x = x;
        // TODO: 1/14/2019
        this.y = y;
    }

    public int div() {
        return x / y;
    }

    public void setY(int y) {
        if (y == 0) {
            // TODO: 1/14/2019
            System.out.println("Error");
            System.exit(1);
        } else {
            this.y = y;
        }
    }
}
