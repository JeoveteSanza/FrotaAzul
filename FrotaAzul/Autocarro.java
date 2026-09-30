
/**
 * Escreva uma descrição da classe Autocarro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Autocarro
{
    private String matricula;               // "xx-xx-xx ou xxxxxx"
    private String cor;                    //  "#xxxxxx"
    private int numLugares;               // 
    private boolean arCondicionado;
    private double kms;                  // 123.09
    
    
    public Autocarro(){
        
    }
    
    public Autocarro(String matricula, String cor, int numLugares,boolean arCondicionado, double kms)
    {
        this.matricula = matricula;
        this.cor = cor;
        this.numLugares = numLugares;
        this.arCondicionado = arCondicionado;
        this.kms = kms;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String m) {
        this.matricula = m;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String c) {
        this.cor = c;
    }
    
    public int getNumLugares() {
        return this.numLugares;
    }
    
    public void setNumLugares(int nl) {
        this.numLugares = nl;
    }
    
    public boolean getArCondicionado() {
        return arCondicionado;
    }
    
    public void setArCondicionado(boolean ac){
        this.arCondicionado = ac;
    }
    
    public double getKms() {
        return  kms;
    }
    
    public void setKms(double kilo) {
        this.kms = kilo;
    }
    
    public String toString() {
        String resultado = "";
        
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------\n");
        sb.append("Matricula: " + this.matricula);
        sb.append("\nCor: " +this.cor);
        sb.append("\nNum. Lugares: " + this.numLugares);
        sb.append("\nTem AC: " +this.arCondicionado);
        sb.append("\nKilometros: "+ this.kms);
        sb.append("------------------------------");
        
        resultado = sb.toString();
        
        return resultado;
    }
}