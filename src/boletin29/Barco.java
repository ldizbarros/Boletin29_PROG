package boletin29;

public abstract class Barco {
    
    private String matricula;
    private float eslora;

    public Barco() {
    }

    public Barco(String matricula, float eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "Eslora: " + eslora;
    }
    
    public float moduloBase(){
        return (eslora*10);
    }
    
    public abstract void aluguer(int numDias);
}
