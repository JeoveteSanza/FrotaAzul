public class TesteAutocarro
{
    public static void main(String[] agrs) {
        System.out.println("A classe autocarro está a funcionar");
        /**
       *Funcionalidade para testar o construtor da class Autocarro
       */
    // 1. Criar um novo objeto do tipo Autocarro
    
    Autocarro a1 = new Autocarro("xx-xx-xx", "#xxxx", 101, true, 101.00);
      
    String propsDoObjeto = (a1.toString());
    
    System.out.println(propsDoObjeto);
    
    // 2. Testar o get e o set Matricula
    
    String m1 = a1.getMatricula();
    if(m1 == "xx-xx-xx") {
        System.out.println("O teste ao getMatricula passou");
    } else {
        System.out.println("O teste ao getMatricula não passou");
    }
    
    if(m1 != "RC-15-CG") {
        System.out.println("O teste ao getMatricula passou");
    } else {
        System.out.println("O teste ao getMatricula não passou");
    }
    
    a1.setMatricula("00-00-00");
    String m2= a1.getMatricula();
    if(m2 == "00-00-00") {
        System.out.println("O teste ao getMatricula passou");
    } else {
        System.out.println("O teste ao getMatricula não passou");
    }
    
    if(m2 != "xx-xx-xx") {
        System.out.println("O teste ao getMatricula passou");
    } else {
        System.out.println("O teste ao getMatricula não passou");
    }
    
    System.out.println(m2);
    
    String c1 = a1.getCor();
    if(c1 == "#xxxx")
    {
        System.out.println("O teste ao getCor passou\n");
    } else {
        System.out.println("O teste ao getCor não passou\n");
    }
    
    a1.setCor("#7584");
    String c2 = a1.getCor();
    
    if(c2 != "#7584"){
        System.out.println("O este do setCor não passou\n");
    } else {
        System.out.println("O teste d setCor passou\n");
    }
    
    int nl1 = a1.getNumLugares();
    
    if(nl1 == 101) {
        System.out.println("O passou no teste get");
    } else {
        System.out.println("Não passou no teste");
    }
     
    a1.setNumLugares(102);
    int nl2 = a1.getNumLugares();
    
    if(nl2 == 102) {
        System.out.println("A mudança foi um sucesso");
    } else {
        System.out.println("Não deu certo");
    }
    
    boolean ac = a1.getArCondicionado();
    if(ac == true) {
        System.out.println("Passou no teste de ac");
    } else {
        System.out.println("Não passo no teste de ac");
    }
    
    a1.setArCondicionado(false);
    boolean ac2 = a1.getArCondicionado();
    
    if(ac2 == false) {
        System.out.println("O teste do falso foi um sucesso");
    } else {
        System.out.println("O teste do false nao foi um sucesso");
    }
    
    double kilo1 = a1.getKms();
    
    if(kilo1 == 101.00) {
        System.out.println("O teste do kilo foi um sucesso chefe");
    } else {
        System.out.println("Temos um problema chefe");
    }
    
    a1.setKms(102.00);
    double kilo2 = a1.getKms();
    
    if(kilo2 == 102.00){
        System.out.println("Chefe kilometros corretos");
    } else {
        System.out.println("Chefe kilometros mal contados");
    }
    
    Lugar l1 = new Lugar(12);
    
    String objetoLugar = (l1.toString());
    System.out.println(objetoLugar);
    
    int numLugar1 = l1.getNumLugar();
    if(numLugar1 == 12) {
        System.out.println("O lugar está no sitio certo");
    } else {
        System.out.println("Dr.José o lugar é diferente");
    }
    
    l1.setNumLugar(13);
    int numLugar2 = l1.getNumLugar();
    
    if(numLugar2 == 13) {
        System.out.println("Chefe mais uma vez no sitio certo");
    } else {
        System.out.println("Dr.José esta num lugar diferente denovo");
    }
    
    boolean ocupado1 = l1.getOcupado();
    
    if(ocupado1 == false) {
        System.out.println("Dr.José o lugar esta desocupado");
    } else {
        System.out.println("Dr.José o lugar esta ocupado");
    }
    
    l1.setOcupado(true);
    boolean ocupado2 = l1.getOcupado();
    
    if(ocupado2 == true) {
        System.out.println("Chefe este lugar esta ocupado");
    } else {
        System.out.println("Chefe algo deu errado");
    }
    
    l1.getAutocarro();
    Autocarro autocarroEstacionado1 = l1.getAutocarro();
    
    if(autocarroEstacionado1 == null ) {
        System.out.println("A tua logica deu certo, por incrivel que pareça");
    } else {
        System.out.println("A tua logica nao deu certo");
    }
    
    l1.setAutocarro(a1);
    Autocarro autocarroEstacionado2 = l1.getAutocarro();
    
    
    String objetoLugar2 = l1.toString();
    System.out.println(objetoLugar2);
    
    /*if(autocarroEstacionado2.equals(a1)) {
        System.out.println("Chefe deu todo certo");
    } else {
        System.out.println("Chefe deu errado");
    }*/
    

    
}
}