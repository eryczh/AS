package ex15;

public class Main {
    public static void main(String[] args) {
        // criando uma estrutura hierárquica //
        Composite form = new Composite();
        form.add(new Leaf("Campo de Nome: "));
        form.add(new Leaf("Campo de Email: "));

        Composite buttonGroup = new Composite();
        buttonGroup.add(new Leaf("Botão de Envio: "));
        buttonGroup.add(new Leaf("Botão de Cancelamento: "));

        Composite mainPanel = new Composite();
        mainPanel.add(form);
        mainPanel.add(buttonGroup);

        // renderizando a estrutura //
        mainPanel.render();
    }
}
