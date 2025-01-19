public class Salario {
    private double salarioBruto;
    private double descontoINSS;
    private double descontoIR;

    private double salarioLiquido;

    //construtor da classe
    public Salario (double salarioBruto) {
        this.salarioBruto = salarioBruto;
        calcularDescontos();
    }

    //metodo que calcula os descontos
    private void calcularDescontos() {
        System.out.println("Calculando descontos para salário bruto " + salarioBruto);
        this.descontoINSS = CalculoSalario.calcularINSS(salarioBruto);

        this.descontoIR = CalculoSalario.calcularIR(salarioBruto - descontoINSS);
        System.out.println("Desconto IR calculado:  " + descontoIR);

        this.salarioLiquido = salarioBruto - descontoINSS - descontoIR;
        System.out.println("Salário Líquido calculado: " + salarioLiquido);
    }

    // metodos acessores get
    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getDescontoINSS() {
        return descontoINSS;
    }

    public double getDescontoIR() {
        return descontoIR;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }
}
