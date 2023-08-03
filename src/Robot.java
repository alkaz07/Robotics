class Robot{
    private int x, y;
    private int direction;

    public Robot(){
        x=0; y=0; direction = 0;
    }

    public void moveForward()
    {
        if (direction == 0)
            y++;
        if (direction == 90)
            x++;
        if (direction == 180)
            y--;
        if (direction == 270)
            x--;
    }

    public void turnLeft(){
        direction -= 90;
        if( direction <0)
            direction += 360;
    }

    public void turnRight(){
        direction += 90;
        if( direction >=360)
            direction -= 360;
    }

    public String toString()
    {
        return "робот в точке "+x+"; "+y+" смотрит в направлении "+direction+" градусов";
    }

}