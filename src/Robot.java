public class Robot {
    
    //Constructor.
    public Robot(String ID, Posicion posicion, boolean cargado, int anioFabricacion){
        this.ID = ID;
        this.posicion = posicion;
        this.cargado = cargado;
        this.anioFabricacion = anioFabricacion;
        this.carga = 0;
    }
    
    //Atributos.
    private String ID;
    private Posicion posicion;
    private boolean cargado;
    private int anioFabricacion;
    private int carga;

    //Getters y setters.
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public boolean isCargado() {
        return cargado;
    }

    public void setCargado(boolean cargado) {
        this.cargado = cargado;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void mov(){
        
    }
    
    public void mnt(){
        this.carga++;
    }
    
    public void unmnt(){
        this.carga = 0;
    }
    
    public void rot(){
        
    }
    
    
    /*
    mov
mnt
unmnt
rot
*/
}
