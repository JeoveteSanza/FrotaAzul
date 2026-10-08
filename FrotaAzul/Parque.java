
import java.util.ArrayList;
public class Parque
{
    private String nome;
    private String morada;
    private ArrayList<Lugar> lugares;
    private int numDeLugares;
    
    public Parque(){
    }
    
    public Parque(String nome, String morada, int numDeLugares){
        this.nome = nome;
        this.morada = morada;
        this.lugares = new ArrayList<Lugar>();
        this.numDeLugares = numDeLugares;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getMorada(){
        return morada;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMorada(String morada){
        this.morada = morada;
    }
    
    public int getNumDeLugares(){
        return numDeLugares;
    }
    
    public void setNumDelugares(int numDeLugares){
        this.numDeLugares = numDeLugares;
    }
    
    public ArrayList<Lugar> getLugares(){
        return lugares;
    }
    
    public void adicionarLugar(Lugar novoLugar){
        if(lugares.size() < numDeLugares){
            lugares.add(novoLugar);
        } else {
            System.out.println("O parque está cheio");
        }
    }
    
    public boolean lugaresAvailable() {
        for(int i = 0; i < lugares.size() ; i++) {
            if(lugares.get(i).getOcupado() == true) {
                return true;
            }
        }
        return false;
    }
    
    public void 
    
}