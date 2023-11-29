public class Entrada {

    public static void main(String[] args) {
        // Este es el bindo
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*98)+1;
            // ahora quiero que los numeros no se repitan
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
