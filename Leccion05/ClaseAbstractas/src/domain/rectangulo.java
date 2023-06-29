
package domain;

public class rectangulo extends FiguraGeometrica{
    //Constructor
    public rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime un: "+this.getClass() .getSimpleName());
    }
}
