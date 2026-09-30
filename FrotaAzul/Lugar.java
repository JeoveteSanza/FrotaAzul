
/**
 * Escreva uma descrição da classe Lugar aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lugar
{
    private int numLugar;
    private boolean isOcupado;
    private Autocarro autocarroEstacionado;
    
    public Lugar() {}
    
    public Lugar(int numLugar) {
        this.numLugar = numLugar;
        this.isOcupado = false ;
        this.autocarroEstacionado = null;
    }
    
}