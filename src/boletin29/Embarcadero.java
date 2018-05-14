package boletin29;

import java.util.ArrayList;
import java.util.List;

public class Embarcadero {
    List <Barco> listaBarcos = new ArrayList();
    
    public void crearArray(){
        Barco velero = new Veleros(5,"1234BBB", (float) 10.5);
        listaBarcos.add(velero);
        Barco barcoMotor = new Motor(50,"1234WWW", (float) 25.5);
        listaBarcos.add(barcoMotor);
        Barco yate = new Yate(7,100,"1234YYY", (float) 100.5);
        listaBarcos.add(yate);
    }
    
    public void factura(Barco b, int numDias){
        b.aluguer(numDias);
    }
}
