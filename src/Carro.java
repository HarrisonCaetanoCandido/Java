class Carro {
    String cor;
    String modelo;
    int capacidade_tanque;

    // --------------------- Construtor aqui - Sempre abaixo dos atributos ----------------------------
    
    Carro() { // Construtor padrão, bem básico, com valores padrão inicializados pela linguagem

    }

    Carro(String cor, String modelo, int capacidade_tanque) { // Construtor com Sobrecarga, com valores inicializados pelo programador
        this.cor = cor;
        this.modelo = modelo;
        this.capacidade_tanque = capacidade_tanque;
    }

    // ------------------------------------------------------------------------
    // --------------------- Métodos para encher o tanque ---------------------

    void setCor(String cor) { // "set" coloca um valor no atributo
        this.cor = cor;
    }

    String getCor() { // "get" retorna o valor do atributo
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidade_tanque) {
        this.capacidade_tanque = capacidade_tanque;
    }

    int getCapacidadeTanque() {
        return capacidade_tanque;
    }

    double totalPrecoTanque(double valorCombustivel) {
        return capacidade_tanque * valorCombustivel;
    }
     // ------------------------------------------------------------------------
}
