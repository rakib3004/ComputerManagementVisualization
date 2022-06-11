package Data;

public class Box {
    double height;
    double width;
    double depth;
String name;
    public Box(){

        this.name="Red Box";

    }

    public Box(double height, double width){
        this.name="Blue Box";
        this.height= height;
        this.width=width;
    }


    public Box(double height, double width, double depth){
        this.height= height;
        this.width=width;
        this.depth=depth;
    }


    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(2,4);
        Box box3 = new Box(2,4,3);

        System.out.println(box1.name);
        System.out.println(box2.depth);
        System.out.println(box3.depth);






    }
}

class Pen{


}

class Book{


}