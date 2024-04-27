package ex12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Diretoria implements DepartamentoComponent {
   private String nome;
   private List<DepartamentoComponent> departamentos;

   public Diretoria(String nome) {
      this.nome = nome;
      this.departamentos = new ArrayList();
   }

   public void addDepartamento(DepartamentoComponent departamento) {
      this.departamentos.add(departamento);
   }

   public void removeDepartamento(DepartamentoComponent departamento) {
      this.departamentos.remove(departamento);
   }

   public double getCusto() {
      double custoTotal = 0.0;

      DepartamentoComponent departamento;
      for(Iterator var3 = this.departamentos.iterator(); var3.hasNext(); custoTotal += departamento.getCusto()) {
         departamento = (DepartamentoComponent)var3.next();
      }

      return custoTotal;
   }

   public int getFuncionarios() {
      int funcionariosTotal = 0;

      DepartamentoComponent departamento;
      for(Iterator var2 = this.departamentos.iterator(); var2.hasNext(); funcionariosTotal += departamento.getFuncionarios()) {
         departamento = (DepartamentoComponent)var2.next();
      }

      return funcionariosTotal;
   }
}
