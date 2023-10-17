package ferramentas;

import java.time.LocalDate;

public class Investimentos {
  private String nome;
  private double valorMercado;
  private LocalDate data;

  public Investimentos() {
  };

  public Investimentos(String nome, double valorMercado, LocalDate data) {
    this.nome = nome;
    this.valorMercado = valorMercado;
    this.data = data;
  }

  public void exibirGrafico() {
  }

  public String exibirInvestimentos() {
    return this.data + " " + this.nome + " " + this.valorMercado;
  }

  public String mostrarValorMercado() {
    return this.nome + " " + this.valorMercado;
  }
}
