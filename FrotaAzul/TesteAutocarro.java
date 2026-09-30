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
        
    }
    }
    
    
  
}