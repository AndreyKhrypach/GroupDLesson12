public class Rectangle extends Figure{
    private float width;
    private float height;

    // конструктор зі зверненням до конструктора класа Figure
    Rectangle(float x, float y, float width, float height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimeter(){
        return width * 2 + height * 2;
    }

    @Override
    public float getArea(){
        return width * height;
    }
}
