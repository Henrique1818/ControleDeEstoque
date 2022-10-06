package Controller;

import java.util.ArrayList;
import Entity.Produtos;

public class Estoque {

  //#region Campos

  private int _id = 0;
  private ArrayList<Produtos> lista = new ArrayList<Produtos>();
  Produtos _dados = new Produtos();

  //#endregion


  //#region Metodos

  public String cadastrarProduto(String nome, Double preco, int quantia, String marca, String descricao) {
    if (nome != "" && preco > 0 && quantia != 0 && marca != "" && descricao != "") {
      _dados = new Produtos(_id, nome, preco, quantia, marca, descricao);
      lista.add(_id, _dados);
      _id++;

      return "\n----------------------\n\nSucesso ao gravar\n\n----------------------\n";
    }
    else {
      return "\n----------------------\n\nNão foi possivel gravar os dados\n\n----------------------\n";
    }
  }

  public void calcularTotal(int id, Double preco, int quantia) {
    for (Produtos produto : lista) {
      double total = 0;
      
      if (produto.getId() == id){
        total = produto.getPreco() * produto.getQuantia();
        produto.setTotal(total);
      }
    }
  }

  public String listarProdutos() {
    StringBuilder sb = new StringBuilder();

    for (Produtos produto : lista) {
      calcularTotal(produto.getId(), produto.getPreco(), produto.getQuantia());
      sb.append(String.format("\n----------------------------------------------------------------------------\nId: %s, Produto: %s, Preços: %s, Quantidade: %s, Total: %s, Data de cadastro: %s, Marca: %s, Descrição: %s \n----------------------------------------------------------------------------\n", produto.getId(), produto.getNome(), produto.getPreco(), produto.getQuantia(), produto.getTotal(), produto.getDataHora(), produto.getMarca(), produto.getDescricao()));
    }

    return sb.toString();
  }

  public String exluirProduto(int id) {
    String mensagem = "";
    
    if (lista.size() > 0) {
      for (Produtos item : lista) {
        if (item.getId() == id) {
          lista.remove(id);
          mensagem = "\n----------------------\n\nProduto excluido com sucesso\n\n----------------------\n";
        }
        else {
          mensagem = "\n----------------------\n\nErro ao tenta excluir produto\n\n----------------------\n";
          break;
        }
      }
    }
    
    return mensagem;
  }

  public String alterarProduto(int id, String nome, Double preco, int quantia, String marca, String descricao) {
    String mensagem = "Erro ao aleterar produto";

    if (lista.size() > 0){
      for (Produtos item : lista) {
        if (item.getId() == id) {
          item.setNome(nome);
          item.setPreco(preco);
          item.setQuantia(quantia);
          item.setMarca(marca);
          item.setDescricao(descricao);
          calcularTotal(item.getId(), item.getPreco(), item.getQuantia());
          mensagem = "Produto alterado com sucesso";
        }
      }
    }

    return mensagem;
  }

  //#endregion
}