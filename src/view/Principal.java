package ObserverYoutebu.src.view;

import java.util.ArrayList;
import java.util.List;

import ESIIIObserver.src.controller.CriadorConteudo;
import ESIIIObserver.src.controller.Inscrito;

public class Principal {
  public static void main(String[] args) {
    List<Inscrito> inscritos = new ArrayList<>();

    Inscrito ins1 = new Inscrito();
    ins1.setNome("João Pedro");
    inscritos.add(ins1);

    Inscrito ins2 = new Inscrito();
    ins2.setNome("Ana Júlia");
    inscritos.add(ins2);

    Inscrito ins3 = new Inscrito();
    ins3.setNome("Marina Oliveira");
    inscritos.add(ins3);

    CriadorConteudo criadorConteudo = new CriadorConteudo(inscritos);
    criadorConteudo.publicarPostagem("Viagem para Porto Seguro");
    criadorConteudo.publicarPostagem("Comi Césio 137: Deu ruim??");
    criadorConteudo.publicarPostagem("Fim do canal");

  }
}
