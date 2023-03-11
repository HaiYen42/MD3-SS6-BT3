public class MovablePoint extends Point{
    private float xSpeed =0.0f, ySpeed=0.0f;
    public MovablePoint(){
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float [] arr ={this.xSpeed, this.ySpeed};
        return arr;
    }
    public void setSpeed(float xSpeed, float ySpeed){
       setxSpeed(xSpeed);
       setySpeed(ySpeed);
    }
    public String move(){
        float x= super.getX()+ this.getxSpeed();
        float y= super.getY()+ this.getySpeed();
        super.setXY(x,y);
        return "Move to the point {" +
                "x= "+ super.getX()+
                ", y= "+ super.getY()+ "}";
    }

    @Override
    public String toString() {
        return super.toString()+ "Speed { "+
                " xSpeed= "+ xSpeed +
                " ySpeed= "+ ySpeed+ " }";
    }
}
