package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, o);
            System.out.println("resultado =" +resultado);
        }catch (Exception e){
            System.out.println("Ocurrio un error: "+ e);
        }
    }
}
