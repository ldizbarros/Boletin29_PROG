package boletin29;

public class Yate extends Motor{

    private int numCamarotes;

    public Yate(int numCamarotes, float potencia) {
        super(potencia);
        this.numCamarotes = numCamarotes;
    }

    public Yate(int numCamarotes, float potencia, String matricula, float eslora) {
        super(potencia, matricula, eslora);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public void aluguer(int numDias) {
        float prezo = numDias * ( super.moduloBase() + super.getPotencia() + numCamarotes );
        System.out.println("O aluguer do Yate a motor con matricula "+super.getMatricula()+" e eslora de "+super.getEslora()+" metos: \n"
                + numDias + " dias ---> "+prezo+"€");
    }
}
