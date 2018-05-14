package boletin29;

public class Veleros extends Barco{

    private int mastiles;

    public Veleros(int mastiles) {
        this.mastiles = mastiles;
    }

    public Veleros(int mastiles, String matricula, float eslora) {
        super(matricula, eslora);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public void aluguer(int numDias) {
        float prezo = numDias * ( super.moduloBase() + mastiles );
        System.out.println("O aluguer do Veleiro con matricula "+super.getMatricula()+" e eslora de "+super.getEslora()+" metos: \n"
                + numDias + " dias ---> "+prezo+"€");
    }
    
}
