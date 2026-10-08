
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
    
    public int getNumLugar() {
        return this.numLugar;
    }
    
    public void setNumLugar(int NumLugar) {
        this.numLugar = NumLugar;
    }
    
    public boolean getIsOcupado() {
        return this.isOcupado;
    }
    
    public void setOcupado(boolean isOcupado) {
        this.isOcupado = isOcupado;
    }
    
    public Autocarro getAutocarro() {
        return autocarroEstacionado;
    }
    
    public boolean estacionarAutocarro(Autocarro a) {
        if(this.isOcupado){
            this.isOcupado = true;
            this.autocarroEstacionado = a;
            
            return true;
        }
        
        return false;
    }
    
    public boolean desocuparLugar() {
        if(this.isOcupado) {
            this.isOcupado = false;
            this.autocarroEstacionado = null;
            
            return true;
        }
        
        return false;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String resultado = "";
        sb.append("\n--------------------------------------------------------\n");
        sb.append("N.Lugar: " + this.numLugar);
        sb.append("\nOcupado: " +this.isOcupado);
        sb.append("\nAutocarro Estacionado: " + this.autocarroEstacionado);
        sb.append("\n----------------------------------------------------------");
        
        resultado = sb.toString();
        
        return resultado;
    }
    
}