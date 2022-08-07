package estudos_por_fora.aulas.pacotes;

public class Carro {
    public String cor;
    public String modelo;
    public int capacidade_tanque;

    // --------------------- Construtor aqui - Sempre abaixo dos atributos ----------------------------
    
    public Carro() { // Construtor padrão, bem básico, com valores padrão inicializados pela linguagem

    }

    public Carro(String cor, String modelo, int capacidade_tanque) { // Construtor com Sobrecarga, com valores inicializados pelo programador
        this.cor = cor;
        this.modelo = modelo;
        this.capacidade_tanque = capacidade_tanque;
    }

    // ------------------------------------------------------------------------
    // --------------------- Métodos para encher o tanque ---------------------

    public void setCor(String cor) { // "set" coloca um valor no atributo
        this.cor = cor;
    }

    public String getCor() { // "get" retorna o valor do atributo
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCapacidadeTanque(int capacidade_tanque) {
        this.capacidade_tanque = capacidade_tanque;
    }

    public int getCapacidadeTanque() {
        return capacidade_tanque;
    }

    public double totalPrecoTanque(double valorCombustivel) {
        return capacidade_tanque * valorCombustivel;
    }
     // ------------------------------------------------------------------------
}
