public class BoxDemo {
    public static void main(String[] args) {
        Box mybox=new Box();
        double vol;
        mybox.wigth=10;
        mybox.height=20;
        mybox.depth=15;
        vol= mybox.wigth* mybox.height* mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
