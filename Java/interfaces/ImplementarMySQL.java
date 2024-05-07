package interfaces;

public class ImplementarMySQL implements BaseDatos {

    @Override
    public void insertar() {
        System.out.println("Se inserto un dato"); 
    }    

    @Override
    public void listar() {
       System.out.println("Se enlitó un dato"); 
    }

    @Override
    public void actualizar() {
        System.out.println("Se actualizó un dato");
    }

    @Override
    public void eliminar() {
        System.out.println("Se eliminó un dato");
    }
}
