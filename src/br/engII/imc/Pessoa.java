package br.engII.imc;
import java.text.DecimalFormat;

public class Pessoa {
    
    private double altura;
    private double peso;
    private String sexo;
    private double imcI;

    public Pessoa() {
    }

    public Pessoa(double altura, double peso, String sexo) {
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }
    

    public double getImcI() {
        return imcI;
    }     

    public void setImcI(double imcI) {
        this.imcI = imcI;
    }
      
    
    public String calcularImc() {       
        if ((altura >= 0.54 && altura <= 2.90) && (peso >= 20.00 && peso <= 597)) {           
            this.imcI = (peso/(altura * altura)); //calculo do imc  
            DecimalFormat df = new DecimalFormat("##.#");
            return df.format(imcI);
        }
        return "Verifique o Peso e a Altura digitados!";
    }

    public String avaliacao() {
        
      this.calcularImc();
      
      if( imcI >= 15.0){
          
        if(sexo.equalsIgnoreCase ("F")){
                if ((imcI >= 15.0) && (imcI <= 17.9)) { //abaixo do peso
                    return "Você está abaixo do peso recomendado.";
                } else if ((imcI >= 18.0) && (imcI <= 24.4)) { //peso ideal
                    return "Você está muito bem! Continue assim!";
                } else if ((imcI >= 24.5) && (imcI <= 27.2)) { //acima do peso
                    return "Você está acima do peso recomendado. Cuidado!";
                } else if (imcI >= 27.3) {
                    return "Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
                }
        }

           if(sexo.equalsIgnoreCase("M")){
                if ((imcI >= 17.9) && (imcI <= 18.9)) { //abaixo do peso
                    return ("Você está abaixo do peso recomendado.");
                } else if ((imcI >= 19.0) && (imcI <= 24.9)) { //peso ideal
                    return ("Você está muito bem! Continue assim!");
                } else if ((imcI >= 25.0) && (imcI <= 27.7)) { //acima do peso
                    return("Você está acima do peso recomendado. Cuidado!");
                } else if (imcI >= 27.8) {
                    return ("Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");
                }
           }
        
        return "Sexo Invalido!!!";
    }
      return "Peso e altura Invalidos!!";
      
    }

 
}
