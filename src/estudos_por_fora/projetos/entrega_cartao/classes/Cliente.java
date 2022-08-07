package estudos_por_fora.projetos.entrega_cartao.classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    public String numCartao;
    private List<Endereco> enderecos; // objeto complexo, necessidade de criar um encapsulamento para os tipos de dados de endereco, que podem possuir diferentes usos

    public Cliente() { // construtor padrão definido por questão de boas práticas

    }

    public void adicionaEndereco(Endereco endereco) {
        if(endereco == null)
            throw new NullPointerException("Endereco nao pode ser nulo");

        if(endereco.cep == null)
            throw new NullPointerException("Cep nao pode ser nulo");

        getEnderecos().add(endereco); // passa pelas validações, então adiciona endereço
    } 

    private List<Endereco> getEnderecos() { // para acessar a lista de endereços, vc precisa passar pelo método antes para que uma nova lista de endereço nao seja adicionada toda vez que for chamada, mas sim um novo endereco na lista de endereços já criada anteriormente
        if(enderecos == null) // se o objeto endereço ainda não foi inicializado, vamos inicializa-lo
            enderecos = new ArrayList<Endereco>();
        
        return enderecos;
    }

}