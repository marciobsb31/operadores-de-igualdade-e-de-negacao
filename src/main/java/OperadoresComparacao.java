// 3.2. Operadores de comparação
public class OperadoresComparacao {
    public static void main(String[] args) {

        int pesoProdutos = 1000;
        int limitePesoCaminhao = 1000;

        boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
        System.out.printf("Carga Excedida: %b%n", cargaExcedida);

        //boolean cargaLiberada = pesoProdutos = limitePesoCaminhao;
        //boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;
        boolean cargaLiberada = limitePesoCaminhao >= pesoProdutos;
        System.out.printf("Carga Liberada: %b%n", cargaLiberada);


    }
}
