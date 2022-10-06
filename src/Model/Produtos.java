package Model;

public class Produtos {
    private String Ativo;
    private String DataHora;
    private String Descricao;
    private int Id;
    private Double Preco;
    private String Marca;
    private String Nome;
    private int Quantia;
    private Double Total;

    public Produtos() {}

    public void InserirProduto(String nome, Double preco, int quantia, String marca) {
        this.Nome = nome;
        this.Preco = preco;
        this.Quantia = quantia;
        this.Marca = marca;
    } 

    public String Listar() {
        String mensagem = String.format("\nProduto: %s \nPreço: %s \nQuantidade: %s \nMarca: %s", Nome, Preco, Quantia, Marca);
        
        if (Nome != "") {
            return mensagem;
        }
        else {
            return "Vazio";
        }
    } 
    public int getId()
    {
        return Id;
    }
    public String getAtivo()
    {
        return Ativo;
    }
    public String getDataHora()
    {
        return DataHora;
    }
    public String getDescricao()
    {
        return Descricao;
    }
    public Double getPreco()
    {
        return Preco;
    }
    public String getNome()
    {
        return Nome;
    }
    public int getQuantia()
    {
        return Quantia;
    }
    public Double getTotal()
    {
        return Total;
    }
    public String getMarca() {
        return Marca;
    }

    public void setId(int id)
    {
        this.Id = id;
    }
    public void setAtivo(String ativo)
    {
        this.Ativo = ativo;
    }
    public void setDataHora(String dataHora)
    {
        this.DataHora = dataHora;
    }
    public void setTotal(Double total)
    {
        this.Total = total;
    }
}