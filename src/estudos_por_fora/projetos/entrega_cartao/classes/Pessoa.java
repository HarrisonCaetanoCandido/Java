package estudos_por_fora.projetos.entrega_cartao.classes;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa {FISICA, JURIDICA}

    public int codigo;
    public String nome;
    private String documento; // cpf ou cnpj
    public TipoPessoa tipo;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {

        if(documento == null || documento.isEmpty()) // nao pode ser nulo nem vazio
            throw new RuntimeException("Documento nao pode ser nulo ou vazio");

        if(documento.length() == TAMANHO_CPF)
            setDocumento(documento, tipo = TipoPessoa.FISICA);

        if(documento.length() == TAMANHO_CNPJ)
            setDocumento(documento, tipo = TipoPessoa.JURIDICA);

        if(documento.length() != TAMANHO_CPF && documento.length() != TAMANHO_CNPJ)
            throw new RuntimeException("Documento invalido para pessoa fisica ou juridica");

    }

    private void setDocumento(String documento, TipoPessoa tipo) {
        this.documento = documento;
        this.tipo = tipo;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }
}