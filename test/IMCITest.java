
import br.engII.imc.Pessoa;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class IMCITest {

    //ALTURA É PESO VALIDOS!!! (NÃO PASSA)
    /*
     @Test
     public void testarAlturaPesoÑ() {
     //altura
     Pessoa p1 = new Pessoa(0.53, 60, "F");
     assertEquals(p1.calcularImc(), "1233,5");

     Pessoa p3 = new Pessoa(2.91, 70, "F");
     assertEquals(p3.calcularImc(), "38,2");
        
     Pessoa p2 = new Pessoa(-1, 50, "F");
     assertEquals(p2.calcularImc(), "250");
        
     //peso
     Pessoa p4 = new Pessoa(1.60, -10, "F");
     assertEquals(p4.calcularImc(), "1233,5");
        
     Pessoa p5 = new Pessoa(1.8, 650, "M");
     assertEquals(p5.calcularImc(), "250");
        
     Pessoa p6 = new Pessoa(1.8, 0, "M");
     assertEquals(p6.calcularImc(), "250");
     }
     */
    //ALTURA E PESO VALIDOS!!! (PASSA)
    @Test
    public void testarAlturaPesoS() {
        //altura
        Pessoa p1 = new Pessoa(1.70, 60, "F");
        assertEquals(p1.calcularImc(), "20,8");

        Pessoa p2 = new Pessoa(2.90, 130, "F");
        assertEquals(p2.calcularImc(), "15,5");

        Pessoa p3 = new Pessoa(0.54, 300, "F");
        assertEquals(p3.calcularImc(), "1028,8");

        //peso
        Pessoa p4 = new Pessoa(1.00, 20, "F");
        assertEquals(p4.calcularImc(), "20");

        Pessoa p6 = new Pessoa(1.70, 300, "M");
        assertEquals(p6.calcularImc(), "103,8");

        Pessoa p7 = new Pessoa(1.70, 597, "M");
        assertEquals(p7.calcularImc(), "206,6");
    }

     //-------------------------------------
    //testar  o segundo metodo
    /*
     //ESSE AQUI NÃO PASSA PQ AS INFORMAÇÕES ESTÃO ERRADAS!
     @Test
     public void TestarAvalicaoFeminina() {        
     Pessoa p1 = new Pessoa(1.00, 20, "F");
     assertTrue(p1.avaliacao() == "Você está abaixo do peso recomendado.");
         
     Pessoa p2 = new Pessoa(1.00, 70, "f");
     assertTrue(p2.avaliacao() == "Você está abaixo do peso recomendado.");
         
     Pessoa p3 = new Pessoa(1.00, 50, "f");
     assertTrue(p1.avaliacao() == "Você está acima do peso recomendado. Cuidado!");
         
     Pessoa p4 = new Pessoa(1.00, 20, "F");
     assertTrue(p4.avaliacao() == "Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");         
     }
      
     
     //ESSE AQUI NÃO PASSA PQ AS INFORMAÇÕES ESTÃO ERRADAS!
     @Test
     public void TestarAvalicaoMasculino() {        
     Pessoa p1 = new Pessoa(1.00, 20, "m");
     assertTrue(p1.avaliacao() == "Você está abaixo do peso recomendado.");
         
     Pessoa p2 = new Pessoa(1.00, 70, "M");
     assertTrue(p2.avaliacao() == "Você está abaixo do peso recomendado.");
         
     Pessoa p3 = new Pessoa(1.00, 20, "M");
     assertTrue(p1.avaliacao() == "Você está acima do peso recomendado. Cuidado!");
         
     Pessoa p4 = new Pessoa(1.00, 20, "M");
     assertTrue(p4.avaliacao() == "Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");         
     }     
     */
    //VERIFICA SE AS MENSAGENS ESTÃO CORRETAS
    @Test
    public void TestarAvalicaoFemininaS() {
        Pessoa p1 = new Pessoa(2.90, 130, "F"); //15,5
        assertTrue(p1.avaliacao() == "Você está abaixo do peso recomendado.");

        Pessoa p2 = new Pessoa(1.70, 60, "F");
        assertTrue(p2.avaliacao() == "Você está muito bem! Continue assim!"); //20,8

        Pessoa p3 = new Pessoa(1.70, 77, "f"); //26,6
        assertTrue(p3.avaliacao() == "Você está acima do peso recomendado. Cuidado!");

        Pessoa p4 = new Pessoa(1.54, 100, "F"); //42,2
        assertTrue(p4.avaliacao() == "Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");

    }

    //VERIFICA SE AS MSGS ENTÃO CORRETAS
    @Test
    public void TestarAvalicaoMasculinoS() {

        Pessoa p1 = new Pessoa(1.80, 60, "m"); //18,5
        assertTrue(p1.avaliacao() == "Você está abaixo do peso recomendado.");

        Pessoa p2 = new Pessoa(1.70, 60, "M");
        assertTrue(p2.avaliacao() == "Você está muito bem! Continue assim!"); //20,8

        Pessoa p3 = new Pessoa(1.70, 77, "M"); //26,6
        assertTrue(p3.avaliacao() == "Você está acima do peso recomendado. Cuidado!");

        Pessoa p4 = new Pessoa(1.54, 100, "m"); //42,2
        assertTrue(p4.avaliacao() == "Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");

    }

    //AQUI DEVE RETORNAR QUE O SEXO É INVALIDO!!!
    /*
    @Test
    public void VerificaSexo() {
        Pessoa p1 = new Pessoa(1.70, 77, "Mioiooi");
        assertTrue(p1.avaliacao() == "Você está acima do peso recomendado. Cuidado!");
    }
    */

}
