public class Rectangle {
    float width;
    float height;

    public Rectangle(float width, float height){
        this.height = height;
        this.width = width;
    }

    public float Area(){
        return height*width;
    }

    public float Perimeter(){
        return 2*(height+width);
    }
}
