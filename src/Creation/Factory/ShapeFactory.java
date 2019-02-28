package Creation.Factory;

public class ShapeFactory {

    public Shape getShape(String shape){
        if(shape.equalsIgnoreCase("square")){
            return new Square();
        }else if(shape.equalsIgnoreCase("triangle")){
            return new Triangle();
        }else{
            return new Circle();
        }
    }
}
