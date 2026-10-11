public class TesteLugar
{
    public static void main(String[] agrs) {
        System.out.println("A classe lugar esta a funcionar");
        
        // 1. Criar um novo objeto do tipo Lugar
        Lugar l1 = new Lugar(1);
        
        // 2. Testar o get e o set numLugar
        
        int numl1 = l1.getNumLugar();
        
        if(numl1 == 1) {
            System.out.println("Este teste é desnecessário mas pronto esta correto");
        } else {
            System.out.println("Deu errado");
        }
        
        if(numl1 != 2) {
            System.out.println("Este teste é desnecessário mas pronto esta correto");
        } else {
            System.out.println("Deu errado");
        }
        
        l1.setNumLugar(2);
        
        int numl2 = l1.getNumLugar();
        
        if(numl2 == 2) {
            System.out.println("Este teste é desnecessário mas pronto esta correto");
        } else {
            System.out.println("Deu errado");
        }
        
        // 3.Testar o metodo isOcupado
        boolean ocupado1 = l1.getIsOcupado();
        
        if(!ocupado1) {
            System.out.println("Este teste é desnecessário mas pronto esta correto");
        } else {
            System.out.println("Deu errado");
        }
        
        l1.setOcupado(true);
        
        boolean ocupado2 = l1.getIsOcupado();
        
        if(ocupado2) {
            System.out.println("Este teste é desnecessário mas pronto esta correto");
        } else {
            System.out.println("Deu errado");
        }
        
        l1.setOcupado(false);
        
        // 4.Testar o metodo desocuparLugar e toString
        Autocarro a1 = new Autocarro("xx-xx-xx", "#xxxx", 101, true, 101.00);
        
        l1.estacionarAutocarro(a1);
        
        String autocarro1 = l1.toString();
        
        System.out.println(autocarro1);
        
        l1.desocuparLugar();
        
        String autocarro2 = l1.toString();
        
        System.out.println(autocarro2);
        
        
    }
}