package ferramentas;

public class Clima {
  private String local;
  private String temperatura;
  private String latitude;
  private String longitude;
  private String imagemTempo;

  public Clima() {
  }

  public Clima(String local, String temperatura, String latitude, String longitude, String imagemTempo) {
    this.local = local;
    this.temperatura = temperatura;
    this.latitude = latitude;
    this.longitude = longitude;
    this.imagemTempo = imagemTempo;
  }

  public void exibirClima() {
    this.exibirLocal();
    this.mostrarTemperatura();
    this.mostrarImagemTempo();
    this.mostrarLatitudeLongitude();
  }

  private String exibirLocal() {
    return this.local;
  }

  private String mostrarTemperatura() {
    return this.temperatura;
  }

  private String mostrarImagemTempo() {
    return this.imagemTempo;
  }

  private String mostrarLatitudeLongitude() {
    return this.latitude + " " + this.longitude;
  }
}
