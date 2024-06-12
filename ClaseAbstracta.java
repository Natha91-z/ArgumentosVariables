public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new FiguraGeometrica() {
            @Override
            public void dibujar() {

            }
        };
        figuraGeometrica.dibujar();

    }
}

// clase abstracta
abstract class FiguraGeometrica{
    public abstract void dibujar();

    class Rectangulo extends FiguraGeometrica{
        @Override
        public void dibujar(){
            System.out.println("Se dibuja un Rectangulo");
        }
    }
}