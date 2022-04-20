package Primitive;

public class NConnectConf extends Primitive{

    private final int adrReponde;


    public NConnectConf(int adrReponde) {
        this.adrReponde = adrReponde;
    }



    @Override
    public String toString() {
        return "NConnectConf { " +
                " adrReponde = " + adrReponde +
                " }";
    }
}
