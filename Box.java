public class Box {
    double wigth;
    double height;
    double depth;
    double volume(){
        return  wigth*height*depth;
    }
    void  setDim(double w,double h,double d){
        wigth=w;
        height=h;
        depth=d;
    }
}
