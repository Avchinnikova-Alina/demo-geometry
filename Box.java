public class Box {
    double wigth;
    double height;
    double depth;
    Box(){
        System.out.println("Конструирование объекта Box");
        wigth=10;
        height=10;
        depth=10;
    }
    double volume(){
        return  wigth*height*depth;
    }
}
