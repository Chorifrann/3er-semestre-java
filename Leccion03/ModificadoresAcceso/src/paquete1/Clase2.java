
package paquete1;


class Clase2 {
    String atributoDefault = "Valor del atributo default";
    
   // Clase2(){
        //System.out.println("Constructor Default");
    //}
    
    public Clase2(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    
    void motodoDefault(){
        System.out.println("Metodo Default");
    }

    private void metodoDefault() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
