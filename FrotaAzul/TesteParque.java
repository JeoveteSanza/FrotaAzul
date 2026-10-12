import java.util.ArrayList;
public class TesteParque
{
    public static void main(String[] agrs) {
   System.out.println("A classe TesteParque está a funcionar");

   Parque p1 = new Parque("'Democracia' José Gonçalves", "Loures", 3);
   
   //1.Testar os sets e gets

   String nomeP = p1.getNome();
   
   if(nomeP == "'Democracia' José Gonçalves") {
            System.out.println("Este teste é desnecessário mas pronto esta correto");
   } else {
            System.out.println("Deu errado");
   }
        
   p1.setNome("Democracia José Gonçalves");
   
   String nomeP2 = p1.getNome();
   
   if(nomeP2 == "Democracia José Gonçalves") {
            System.out.println("Este teste é desnecessário mas pronto esta correto");
   } else {
            System.out.println("Deu errado");
   }
   
   int numP = p1.getNumDeLugares();
   
   if(numP == 3) {
            System.out.println("Este teste é desnecessário mas pronto esta correto");
   } else {
            System.out.println("Deu errado");
   }
   
   p1.setNumDelugares(4);
   
   int numP2 = p1.getNumDeLugares();
   
   if(numP2 == 4) {
            System.out.println("Este teste é desnecessário mas pronto esta correto");
   } else {
            System.out.println("Deu errado");
   }
   
   p1.setNumDelugares(3);
   
   ArrayList<Lugar> lugares = p1.getLugares();
   
   System.out.println(lugares);
   
   //2.Testar o metodo estacionarAutocarro
   
   Autocarro a1 = new Autocarro("xx-xx-xx", "#xxxx", 101, true, 101.00);
   
   p1.estacionar(a1);
   
   System.out.println(lugares);
   
   //3.Testar ometodo lugaresAvailable 
   
   int espacoLivre = p1.lugaresAvailable();
   System.out.println(espacoLivre);
   
   //4.Testar remover Autocarro
   
   p1.removerAutocarro(a1);
   System.out.println(lugares);
   
   //5.Testar ver lugarAutocarro
   p1.estacionar(a1);
   Autocarro a2 = new Autocarro("11-11-11", "#0000", 101, true, 105.00);
   p1.estacionar(a2);
   p1.lugarDoAutocarro(a2);
   System.out.println(lugares);
   
   
   
}
}