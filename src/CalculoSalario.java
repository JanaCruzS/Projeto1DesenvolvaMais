public class CalculoSalario {

    public static double calcularINSS (double baseINSS) {
        if (baseINSS <= 1212.00) {
            return baseINSS * 0.075;
        } else if (baseINSS <= 2427.00) {
            return baseINSS * 0.09;
        } else if (baseINSS <= 3641.03) {
            return baseINSS * 0.12;
        } else {
            return 7087.22 * 0.14;
        }
    }
        // metodo para calcular imposto de renda

       public static double calcularIR (double baseIR){
            if( baseIR <= 1903.98 ) {
                return 0.0;
            } else if (baseIR <= 2826.65) {
                return baseIR * 0.075;
            } else if (baseIR <= 3751.05) {
                return baseIR * 0.15;
        } else if (baseIR <= 4664.68) {
                return baseIR * 0.225;
            } else {
               return baseIR * 0.275;
            }
        }
}
