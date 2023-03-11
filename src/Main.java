public class Main {
    public static void main(String[] args) {
        System.out.println("-------------First Point----------");
        Point point = new Point();
        point.setXY(3, 4);
        System.out.println("First point "+ point);

        MovablePoint movablePoint= new MovablePoint();
        movablePoint.setXY(3,4);
        movablePoint.setSpeed(5,6);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());


    }
}