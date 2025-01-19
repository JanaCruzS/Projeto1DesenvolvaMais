public class Main {
    public static void main(String[] args) {

        double[] salariosBrutos = {2564.00, 1598.00, 3256.00, 4890.00, 5362.00};

        System.out.println("\nResumo dos salários:");

        for (double bruto : salariosBrutos) {
            Salario salario = new Salario(bruto);

            System.out.printf("Salário Bruto: R$ %.2f\n", salario.getSalarioBruto());
            System.out.printf("Desconto INSS: R$ %.2f\n", salario.getDescontoINSS());
            System.out.printf("Desconto IR: R$ %.2f\n", salario.getDescontoIR());
            System.out.printf("Salário Líquido: R$ %.2f\n\n", salario.getSalarioLiquido());
        }
    }



        }

