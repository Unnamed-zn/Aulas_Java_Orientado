/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05_Heranca.Exercicio05;

/**
 *
 * @author Pietro
 */
public class Assinatura {
    protected String email;
    protected double mensalidade;
    protected String plano = "Padrão"; 

    public Assinatura(String email, double mensalidade) {
        this.email = email;
        this.mensalidade = mensalidade;
    }

    public String getEmail() {
        return email;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public String getPlano() {
        return plano;
    }
    
    
    
    public void exibirBeneficios() {
        System.out.println("Email do Assinante: "+email);
        System.out.println("Plano assinado: "+plano);
        System.out.println("Mensalidade: "+mensalidade);
        System.out.println("Benefícios:\n"+
                "- Acesso a mais de 50 mil títulos;\n"+
                "- Abrangência de mais de 10 serviços de streaming distintos;\n"+
                "- Qualidade de vídeo duvidosa.");
    }
}
