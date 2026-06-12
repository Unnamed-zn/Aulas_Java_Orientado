package Aula02.Exercicio5;

public class MillenniumFalconLego {
    private int totalPecas;
    private int pecasMontadas;
    private boolean manualDisponivel;

    public MillenniumFalconLego(int totalPecas, int pecasMontadas, boolean manualDisponivel) {
        this.totalPecas = totalPecas;
        this.pecasMontadas = pecasMontadas;
        this.manualDisponivel = manualDisponivel;
    }
    
    public MillenniumFalconLego() {
        this.totalPecas = 700;
        this.pecasMontadas = 0;
        this.manualDisponivel = false;
    }

    public int getTotalPecas() {
        return totalPecas;
    }

    public void setTotalPecas(int totalPecas) {
        this.totalPecas = totalPecas;
    }

    public int getPecasMontadas() {
        return pecasMontadas;
    }

    public void setPecasMontadas(int pecasMontadas) {
        this.pecasMontadas = pecasMontadas;
    }

    public boolean isManualDisponivel() {
        return manualDisponivel;
    }

    public void setManualDisponivel(boolean manualDisponivel) {
        this.manualDisponivel = manualDisponivel;
    }
    
    public void exibirProgresso() {
        System.out.println("Você montou "+this.pecasMontadas+" de um total de "+this.totalPecas+".");
    }

    @Override
    public String toString() {
        return "MillenniumFalconLego{" + "totalPecas=" + totalPecas + ", pecasMontadas=" + pecasMontadas + ", manualDisponivel=" + manualDisponivel + '}';
    }
    
    
}
