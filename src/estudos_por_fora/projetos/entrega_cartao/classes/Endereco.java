package estudos_por_fora.projetos.entrega_cartao.classes;

public class Endereco {
    public enum TipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO}
    
    public String endereco, numero,complemento, bairro, estado, cep;
    public TipoEndereco tipo;

    public Endereco() { // construtor padrão definido por questão de boas práticas

    }
}
