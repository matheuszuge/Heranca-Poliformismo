class Main {
  public static void main(String[] args) {

//Sequência Simples
    double num1 = 0;
    double num2 = 0;
    int cont = 0;
    double operacao = 0;
    
    System.out.println(" Sequência Simples");
    while (cont !=10) {
      operacao = num1+1;
      num1 = operacao;
      cont = cont+1;
      System.out.println(cont + "º Seq.: " + num1);
      if (cont ==9) {
        num2 = operacao;
      }
    }

    System.out.println("");
    System.out.println("Sequência Final: " + num1);
    System.out.println("Sequência Anterior: " + num2);
    System.out.println("Sequência Próxima: " + (num1+1));
    System.out.println("Sequências Geradas: " + cont);
    System.out.println("");
   
// Sequência cúbica
    System.out.println("Sequência Cúbica");
    num1 = 1;
    num2 = 2;
    cont = 0;
    operacao = 0;

    while (cont != 10) {
      operacao = num1 + num1 + num1;
      num1 = operacao;
      cont = cont +1; // Contador
      System.out.println(cont + "º Seq.: " + num1);
      if (cont == 9) {
        num2 = operacao;
      }
    }
    System.out.println("");
    System.out.println("Sequência Final: " + num1);
    System.out.println("Sequência Anterior: " + num2);
    System.out.println("Sequência Próxima: " + (num1+num1+num1));
    System.out.println("Sequências Geradas: " + cont);
    System.out.println("");

  }
}