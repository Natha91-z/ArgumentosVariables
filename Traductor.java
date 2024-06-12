public interface Traductor {

        // metodos publicos y abstractos

       void traducir();

        //Metodos con implementacion por default
        default void iniciarTraductor(){
            System.out.println("Iniciando traductor...");
        }
    class Ingles implements Traductor{
            public void traducir(){
                System.out.println("Tradusco al idioma Ingles");
            }
    }

    class Frances implements Traductor{
            public void traducir(){
                System.out.println("Traduzco a Frances");
            }

            public void iniciarTraductor(){
                System.out.println(" Traductor en Frances");
            }
    }


    class PruebaTraductor{
            public static void main(String[] args) {
                Traductor ingles = new Ingles();
                ingles.traducir();
            }
    }
}
