package equipamento;

import java.time.LocalDate;

import ferramentas.Calendario;
import ferramentas.Clima;
import ferramentas.Investimentos;
import ferramentas.Ferramenta;

public class Iphone implements ReprodutorMidia, AparelhoTelefonico, NavegadorInternet, Ferramenta {
  private double peso;
  private double preco;
  private String tamanho;
  private LocalDate dataLancamento;
  private String sistemaOperacional;

  public Iphone() {
    this.peso = 0.135;
    this.preco = 599;
    this.tamanho = "115 x 61 x 11,6 mm";
    this.dataLancamento = LocalDate.of(2007, 6, 29);
    this.sistemaOperacional = "Mac OS X";
  }

  public double getPeso() {
    return peso;
  }

  public double getPreco() {
    return preco;
  }

  public String getTamanho() {
    return tamanho;
  }

  public LocalDate getDataLancamento() {
    return dataLancamento;
  }

  public String getSistemaOperacional() {
    return sistemaOperacional;
  }

  public void ligar() {
  }

  public void desligar() {
  }

  public void aumentarVolume() {
  }

  public void diminuirVolume() {
  }

  public void irParaTelaInicial() {
  }

  @Override
  public void exibirPagina() {
  }

  @Override
  public void atualizarPagina() {
  }

  @Override
  public void adicionarNovaAba() {
  }

  @Override
  public void removerAba() {
  }

  @Override
  public void fazerChamada() {
  }

  @Override
  public void atenderChamada() {
  }

  @Override
  public void ignorarChamada() {
  }

  @Override
  public void encerrarChamada() {
  }

  @Override
  public void iniciarCorreioDeVoz() {
  }

  @Override
  public void removerCorreioDeVoz() {
  }

  @Override
  public void ouvirCorreioDeVoz() {
  }

  @Override
  public void favoritarContato() {
  }

  @Override
  public void verLigacoes() {
  }

  @Override
  public void mandarMensagem() {
  }

  @Override
  public void selecionarMusica() {
  }

  @Override
  public void selecionarVideo() {
  }

  @Override
  public void selecionarFoto() {
  }

  @Override
  public void tocarVideo() {
  }

  @Override
  public void tocarMusica() {
  }

  @Override
  public void pausar() {
  }

  @Override
  public void exibirFoto() {
  }

  @Override
  public void sincronizarMidia() {
  }

  @Override
  public void exibirCapaAlbum() {
  }

  @Override
  public Calendario getCalendario() {
    Calendario calendario = new Calendario();
    return calendario;
  }

  @Override
  public Clima getClima() {
    Clima clima = new Clima();
    return clima;
  }

  @Override
  public Investimentos getInvestimentos() {
    Investimentos investimentos = new Investimentos();
    return investimentos;
  }

}
