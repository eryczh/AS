package ex10;

public class ordenacao {
  interface SortingStrategy {
      void sort(int[] array);
  }

  static class InsertionSort implements SortingStrategy {
      public void sort(int v[]) {
          int i, j;
          int temp;
          for (i = 1; i < v.length; i++) {
              temp = v[i];
              j = i;
              while (j > 0 && v[j - 1] >= temp) {
                  v[j] = v[j - 1];
                  j--;
              }
              v[j] = temp;
          }
      }
  }

  static class SelectionSort implements SortingStrategy {
      public void sort(int v[]) {
          int i, j, min, aux;
          for (i = 0; i < v.length - 1; i++) {
              min = i;
              for (j = i + 1; j < v.length; j++)
                  if (v[j] < v[min])
                      min = j;

              aux = v[i];
              v[i] = v[min];
              v[min] = aux;
          }
      }
  }

  static class BubbleSort implements SortingStrategy {
      public void sort(int v[]) {
          int i, j;
          int temp;
          for (j = 0; j < v.length - 1; j++)
              for (i = 0; i < v.length - 1 - j; i++)
                  if (v[i] > v[i + 1]) {
                      temp = v[i];
                      v[i] = v[i + 1];
                      v[i + 1] = temp;
                  }
      }
  }

  static class SortingContext {
      private SortingStrategy strategy;

      public SortingContext(SortingStrategy strategy) {
          this.strategy = strategy;
      }

      public void setStrategy(SortingStrategy strategy) {
          this.strategy = strategy;
      }

      public void executeStrategy(int[] array) {
          strategy.sort(array);
      }
  }

  public static class SortingTest {
      public static void main(String[] args) {
          int[] array = {5, 3, 8, 1, 2, 7, 4, 6};

          SortingContext context = new SortingContext(new InsertionSort());
          context.executeStrategy(array);
          System.out.println("Insertion Sort:");
          printArray(array);

          context.setStrategy(new SelectionSort());
          context.executeStrategy(array);
          System.out.println("Selection Sort:");
          printArray(array);

          context.setStrategy(new BubbleSort());
          context.executeStrategy(array);
          System.out.println("Bubble Sort:");
          printArray(array);
      }

      private static void printArray(int[] array) {
          for (int num : array) {
              System.out.print(num + " ");
          }
          System.out.println();
      }
  }
}
