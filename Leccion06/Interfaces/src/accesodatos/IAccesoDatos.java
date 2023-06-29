package accesodatos;


public interface IAccesoDatos {
    int MAX_REGISTRO = 10;
    
    //Metodo inssertar es abstracto y sin cuerpo
    void insertar();
    
    void listar ();
    
    void actualizar();
    
    void eliminar();
}
