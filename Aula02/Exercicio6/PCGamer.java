package Aula02.Exercicio6;

public class PCGamer {
    private String processador;
    private int memoriaRAM;
    private boolean rgbLigado;

    public PCGamer(String processador, int memoriaRAM, boolean rgbLigado) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.rgbLigado = rgbLigado;
    }
    
    public PCGamer() {
        this.processador = "AMD Ryzen 5 5600GT";
        this.memoriaRAM = 16;
        this.rgbLigado = false;
    }
    
    public void ativarModoOverclock() {
        this.rgbLigado = true;
        
        System.out.println("Você liga as luzinhas do computador e percebe magicamente a framerate da sua gameplay de tetris aumentando em 100 FPS");
    }

    @Override
    public String toString() {
        return "PCGamer{" + "processador=" + processador + ", memoriaRAM=" + memoriaRAM + ", rgbLigado=" + rgbLigado + '}';
    }
    
    
}
