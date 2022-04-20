package Paquet;


public class PaquetAppel extends Paquet{
    private int adrSource,adrDestination;


    public PaquetAppel(int numeroConnexion, String typePaquet, int adrSource, int adrDestination) {
        super(numeroConnexion, typePaquet);
        this.adrSource = adrSource;
        this.adrDestination = adrDestination;
    }

    public int getAdrSource() {
        return adrSource;
    }

    public void setAdrSource(int adrSource) {
        this.adrSource = adrSource;
    }

    public int getAdrDestination() {
        return adrDestination;
    }

    public void setAdrDestination(int adrDestination) {
        this.adrDestination = adrDestination;
    }

    @Override
    public String toString() {
        return  "PaquetAppel { " +
                super.toString()+
                " adrSource = " + adrSource +
                ", adrDestination = " + adrDestination +
                " }";
    }
}
