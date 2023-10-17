package estabelecimento;

import equipamento.Iphone;

public class Fabrica {
  public static void main(String[] args) {
    Iphone celular = new Iphone();

    celular.selecionarMusica();
    celular.tocarMusica();
    celular.aumentarVolume();
    celular.pausar();

    celular.atenderChamada();
    celular.encerrarChamada();
    celular.verLigacoes();
    celular.ouvirCorreioDeVoz();
    celular.removerCorreioDeVoz();

    celular.irParaTelaInicial();

    celular.exibirPagina();
    celular.atualizarPagina();
    celular.adicionarNovaAba();
    celular.removerAba();

    celular.getCalendario().exibirCalendario();
    celular.getClima().exibirClima();
    celular.getInvestimentos().exibirInvestimentos();
  }
}
