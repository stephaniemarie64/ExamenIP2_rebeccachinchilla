public class Androide extends Robot{
    
    //Constructor.
    public Androide(String ID, Posicion posicion, boolean cargado, int anioFabricacion){
        super(ID, posicion, cargado, anioFabricacion);
    }
    
    @Override
    public void mnt() {
        if(this.getCarga() < 2){
            super.mnt();
        }else{
            System.out.println("\n¡Ha superado el límite de carga!");
        }
    }
    
    
}
