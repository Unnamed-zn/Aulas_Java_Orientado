/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05_Heranca.Exercicio05;

/**
 *
 * @author Pietro
 */
public class PlanoPremium extends Assinatura {
    private boolean qualidade4k;
    
    public PlanoPremium(String email, double mensalidade, boolean qualidade4k) {
        super(email, mensalidade);
        this.plano = "premium";
        this.qualidade4k = qualidade4k;
    }
    
    
    
    @Override
    public void exibirBeneficios() {
        System.out.println("Email do Assinante: "+email);
        System.out.println("Plano assinado: "+plano);
        System.out.println("Mensalidade: "+mensalidade);
        System.out.println("Benefícios:\n"+
                "- Acesso a mais de 50 mil títulos;\n"+
                "- Abrangência de mais de 10 serviços de streaming distintos;\n"+
                "- Dublagem em todos os títulos (algumas geradas por IA);");
        if (qualidade4k) {
            System.out.println("- Qualidade de vídeo 4k em todos os títulos.");
        } else {
            System.out.println("- Qualidade de vídeo HD em todos os títulos.");
        }
    }
}
