public class Main {
    public static void main(String[]args) {
        double preco = 29.99;
                int quantidade = 3;
                int calculo = (int) (preco * quantidade);
                String mensagem = "O valor total da compra foi de R$: ";
        System.out.println(mensagem+calculo);
        double valorEmReais = 89.99;
                double valorDoDolar = 5.01;
                String mensagemDoValorEmDolar = "O produto em Dolar vai custar $: ";
                double resultadoDoValorEmDolar =valorEmReais / valorDoDolar;
        System.out.println(mensagemDoValorEmDolar + resultadoDoValorEmDolar);
    }
}