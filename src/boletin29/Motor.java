package boletin29;

public class Motor extends Barco{
    
    private float potencia;

    public Motor(float potencia) {
        this.potencia = potencia;
    }

    public Motor(float potencia, String matricula, float eslora) {
        super(matricula, eslora);
        this.potencia = potencia;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public void aluguer(int numDias) {
        float prezo = numDias * ( super.moduloBase() + potencia );
        System.out.println("O aluguer do Barco a motor con matricula "+super.getMatricula()+" e eslora de "+super.getEslora()+" metos: \n"
                + numDias + " dias ---> "+prezo+"€");
    }

}
