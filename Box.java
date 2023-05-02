public class Box {
    double wigth;
    double height;
    double depth;
    Box(double w, double h, double d){
        wigth=w;
        height=h;
        depth=d;
    }
    double volume(){
        return  wigth*height*depth;
    }
}
