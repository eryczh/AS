package lista;

import modelo.Produto;

/*
 *  Professor Gerson Risso
 */
public class Lista {

    private Celula inicio, atual, aux;

    public boolean isVazia() {
        return inicio == null;
    }

    public void inserir(Object objeto) {
        if (isVazia()) {
            inicio = new Celula(objeto, null);
            aux = inicio;
        } else {
            atual = new Celula(objeto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir() {
        Celula e = inicio;
        while (e != null) {
            System.out.println(e.getDados());
            e = e.getProx();
        }
    }

    /**
     * Realiza a pesquisa linear na lista simplesmente ligada.
     *
     * @param id int
     * @return Produto
     */
    public Object pesquisar(int id) {
        Celula pesq = inicio;
        Produto prod;
        while (pesq != null) {
            prod = (Produto) pesq.getDados();
            if (id == prod.getId()) {
                return prod;
            }
            pesq = pesq.getProx();
        }
        return null;
    }

    /**
     * Pesquisa uma c�lula na lista simplesmente ligada,por id, para remov�-lo.
     *
     * @param id int
     * @param remove Celula
     * @return Celula[]
     */
    private Celula[] pesquisar(int id, Celula remove) {
        Produto prod;
        Celula[] v = new Celula[2];
        Celula auxRemove = null;
        while (remove != null) {
            prod = (Produto) remove.getDados();
            if (id == prod.getId()) {
                v[0] = remove;
                v[1] = auxRemove;
                return v;
            }
            auxRemove = remove;
            remove = remove.getProx();
        }
        return null;
    }

    /**
     * Remove um n� da lista simplesmente ligada.
     *
     * @param id int
     * @return boolean
     */
    public boolean remover(int id) {
        Celula[] v = pesquisar(id, inicio);
        if (v != null) {
            //Remove a c�lula
            Celula remove = v[0];
            Celula auxRemove = v[1];
            if (remove == inicio) {//Remo��o do primeiro n�
                inicio = inicio.getProx();
                remove.setProx(null);
            } else if (remove == atual) {//Remo��o do �ltimo n�
                atual = auxRemove;
                aux = atual;
                auxRemove.setProx(null);
            } else {//Remo��o de um n� qualquer
                auxRemove.setProx(remove.getProx());
                remove.setProx(null);
            }
            return true;
        }
        return false;
    }

}
