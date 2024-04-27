package lista;

/*
 *  Professor Gerson Risso
 */
public class Celula {
 private Object dados;
 private Celula prox;

    public Celula(Object dados, Celula prox) {
        this.dados = dados;
        this.prox = prox;
    }

    public Object getDados() {
        return dados;
    }

    public void setDados(Object dados) {
        this.dados = dados;
    }

    public Celula getProx() {
        return prox;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "Celula{" + "dados=" + dados 
                + ", prox=" + prox + '}';
    }
 
   
}
