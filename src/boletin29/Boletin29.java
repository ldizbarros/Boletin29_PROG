package boletin29;

/**
 * Supon que temos unha empresa de aluguer de barcos . 
 * Para calcular o precio do aluguer multiplicamos o número de días de ocupación 
 * por un módulo que reflicte o tamaño do barco ( este módulo calcúlase multiplicando 10 * eslora .
 * Agora pretendemos diferenciar a información de alguns tipos de barcos :
 *      Número de mástiles para veleros 
 *      Potencia, en CV, para embarcacions deportivas a motor
 *      Potencia, en CV, e número camarotes para yates
 * O módulo dos barcos dun tipo especial obtense como o módulo normal máis :
 *      1- Número mástiles para veleros
 *      2- Potencia, para embarcacions deportivas
 *      3- Potencia e nº camarotes para yates
 * Crea unha clase abstracta Barco e as subclases correspondentes .
 * Fai un esquema da xerarquia de clases.
 * Utilizando Herdanza e polimorfismo.Codifica un programa quea cree un ArrayList  
 * de tipo barcos  nos permita calcular o aluguer de calquera tipo de barco .  
 * Na factura debe ir a matricula do barco , eslora e precio aluguer.  
 * @author ldizbarros
 */
public class Boletin29 {

    public static void main(String[] args) {
        Barco velero = new Veleros(5,"1234BBB", (float) 10.5);
        Barco barcoMotor = new Motor(50,"1234WWW", (float) 25.5);
        Barco yate = new Yate(7,100,"1234YYY", (float) 100.5);
        
        Embarcadero obx = new Embarcadero();
        
        obx.factura(yate, 7);
        obx.factura(barcoMotor, 3);
        obx.factura(velero, 1);
    }
    
}
