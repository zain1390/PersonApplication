package ClassAug24This;

public class ThisSample {
    private int i = 20;

    public ThisSample() {
        System.out.println("Def Constrctor");
    }

    public ThisSample(int i) {
        this();
        this.i = i;
        System.out.println(this.i);

    }

    public static void main(String[] args) {
        ThisSample ob = new ThisSample(1);
        ThisSample ob2 = new ThisSample(200);


    }

}
