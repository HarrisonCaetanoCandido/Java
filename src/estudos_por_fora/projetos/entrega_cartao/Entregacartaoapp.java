package estudos_por_fora.projetos.entrega_cartao;

import estudos_por_fora.projetos.entrega_cartao.classes.Endereco;
import estudos_por_fora.projetos.entrega_cartao.classes.Cliente;

public class Entregacartaoapp {

    public static void main(String[] args) {
        Endereco endereco = new Endereco(); // dados do endereço
        endereco.cep = "0000000";

        Cliente cliente = new Cliente(); // dados do cliente

        try {
            cliente.adicionaEndereco(endereco); // Conceito de Associação de Classes, adiciona um novo endereço na Lista de endereços sempre que chamado
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage()); // Aqui é mais para tratamento do erro, fica mais apresentável
        }
    }

}