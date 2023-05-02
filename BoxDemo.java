public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1=new Box();
        Box mybox2=new Box();
        double vol;
        mybox1.wigth=10;
        mybox1.height=20;
        mybox1.depth=15;
        mybox2.wigth=3;
        mybox2.height=6;
        mybox2.depth=9;
        vol= mybox1.wigth* mybox1.height* mybox1.depth;
        System.out.println("Объем равен " + vol);
        vol= mybox2.wigth* mybox2.height*mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}
