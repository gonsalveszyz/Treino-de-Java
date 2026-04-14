public class Main {
    public static void main(String[]args) {
        double preco = 29.99;
                int quantidade = 3;
                int calculo = (int) (preco * quantidade);
                String mensagem = "O valor total da compra foi de R$: ";
        System.out.println(mensagem+calculo);
    }
}