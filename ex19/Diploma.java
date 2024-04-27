package ex19;

public class Diploma {
  public Diploma() {
  }

  public Factory criarDiploma(String local, String tipoCurso) {
     if (tipoCurso.equalsIgnoreCase("Gradua\u00e7\u00e3o Presencial")) {
        return new Presencial(local);
     } else if (tipoCurso.equalsIgnoreCase("Gradua\u00e7\u00e3o Ead")) {
        return new Ead(local);
     } else {
        return tipoCurso.equalsIgnoreCase("P\u00f3s Gradua\u00e7\u00e3o") ? new Pos(local) : null;
     }
  }
}
