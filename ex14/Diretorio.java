package ex14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Diretorio implements ArquivoComponent {
   private String nomeDiretorio;
   private List<ArquivoComponent> arquivos;

   public Diretorio(String nomeDiretorio) {
      this.nomeDiretorio = nomeDiretorio;
      this.arquivos = new ArrayList();
   }

   public void addArquivo(ArquivoComponent arquivo) {
      this.arquivos.add(arquivo);
   }

   public void removeArquivo(ArquivoComponent arquivo) {
      this.arquivos.remove(arquivo);
   }

   public String getNomeArquivo() {
      return this.nomeDiretorio;
   }

   public float getTamanho() {
      float tamanhoTotal = 0.0F;

      ArquivoComponent arquivo;
      for(Iterator var2 = this.arquivos.iterator(); var2.hasNext(); tamanhoTotal += arquivo.getTamanho()) {
         arquivo = (ArquivoComponent)var2.next();
      }

      return tamanhoTotal;
   }
}
