package ex14;

public class Arquivo implements ArquivoComponent {
  private String nomeArquivo;
  private float tamanho;

  public Arquivo(String nomeArquivo, float tamanho) {
     this.nomeArquivo = nomeArquivo;
     this.tamanho = tamanho;
  }

  public String getNomeArquivo() {
     return this.nomeArquivo;
  }

  public float getTamanho() {
     return this.tamanho;
  }
}

