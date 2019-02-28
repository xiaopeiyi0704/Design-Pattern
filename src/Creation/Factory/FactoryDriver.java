package Creation.Factory;


//factory pattern is more for creating objects
public class FactoryDriver {



    public static void main(String[]args){
        ShapeFactory sf=new ShapeFactory();
        Shape shape;
        shape=sf.getShape("square");
        shape.draw();

        shape=sf.getShape("circle");
        shape.draw();

        shape=sf.getShape("triangle");
        shape.draw();
    }

}
