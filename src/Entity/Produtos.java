package Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produtos {
    private String DataHora;
    private String Descricao;
    private int Id;
    private Double Preco;
    private String Marca;
    private String Nome;
    private int Quantia;
    private Double Total;

    public Produtos() {}

    public Produtos(int id, String nome, Double preco, int quantia, String marca, String descricao) {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        this.Id = id;
        this.Nome = nome;
        this.Preco = preco;
        this.Quantia = quantia;
        this.Marca = marca;
        this.Descricao = descricao;
        this.DataHora = dataFormatada.format(new Date());
    }

    public int getId()
    {
        return Id;
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
    public void setNome(String nome)
    {
        this.Nome = nome;
    }
    public void setDescricao(String descricao)
    {
        this.Descricao = descricao;
    }
    public void setQuantia(int quantia)
    {
        this.Quantia = quantia;
    }
    public void setPreco(Double preco)
    {
        this.Preco = preco;
    }
    public void setMarca(String marca)
    {
        this.Marca = marca;
    }
    public void setTotal(Double total)
    {
        this.Total = total;
    }
}