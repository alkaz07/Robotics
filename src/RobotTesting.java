public class RobotTesting {
    public static void main(String[] args) {
        Robot r2d2 = new Robot();
       // System.out.println(r2d2.x +" "+ r2d2.y);
        r2d2.moveForward();
        r2d2.moveForward();
        r2d2.turnLeft();
        r2d2.moveForward();
        r2d2.moveForward();
        r2d2.moveForward();
        r2d2.moveForward();

       // System.out.println(r2d2.x +" "+ r2d2.y);
        System.out.println(r2d2.toString());
        r2d2.turnRight();
        r2d2.moveForward();
        System.out.println(r2d2);
        
    }
}