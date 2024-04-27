package ex14;

public class Ler {
  public Ler() {
  }

  public static void main(String[] args) {
     Arquivo arquivo1 = new Arquivo("arquivo1.txt", 10.5F);
     Arquivo arquivo2 = new Arquivo("arquivo2.txt", 20.2F);
     Arquivo arquivo3 = new Arquivo("arquivo3.txt", 15.1F);
     Arquivo arquivo4 = new Arquivo("arquivo4.txt", 30.5F);
     Diretorio diretorio1 = new Diretorio("Diretorio1");
     diretorio1.addArquivo(arquivo1);
     diretorio1.addArquivo(arquivo2);
     Diretorio diretorio2 = new Diretorio("Diretorio2");
     diretorio2.addArquivo(arquivo3);
     diretorio2.addArquivo(arquivo4);
     Diretorio diretorioRaiz = new Diretorio("DiretorioRaiz");
     diretorioRaiz.addArquivo(diretorio1);
     diretorioRaiz.addArquivo(diretorio2);
     System.out.println("Tamanho total do sistema de arquivos: " + diretorioRaiz.getTamanho() + " KB");
  }
}

