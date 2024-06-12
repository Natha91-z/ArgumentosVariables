public class ArgumentosVariables {
    public static void main(String[] args) {
       // imprimirNumeros(1,2,3);
        variosParametros("Juan", 1,2,3,4,5);
    }
    static void variosParametros(String nombre, int... nunmeros){
        System.out.println("nombre ="+ nombre);
        imprimirNumeros(nunmeros);
    }



    static void imprimirNumeros(int... numeros){
        for (int i=0; i< numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
