package ObserverYoutebu.src.controller;

import java.util.List;

public class CriadorConteudo implements IObservavel {
  private List<Inscrito> inscritos;

  public CriadorConteudo(List<Inscrito> inscritos) {
    this.inscritos = inscritos;
  }

  public void publicarPostagem(String nomePostagem) {
    System.out.println("Publicando postagem " + nomePostagem);

    notificaMudanca(nomePostagem);
  }

  @Override
  public void notificaMudanca(String nomePostagem) {
    inscritos.forEach((inscrito) -> {
      inscrito.update("O criador fez uma nome postagem: " + nomePostagem);
    });
  }

}
