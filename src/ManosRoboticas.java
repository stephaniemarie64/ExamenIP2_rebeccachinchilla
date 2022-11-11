public class ManosRoboticas extends Robot {
    
    //Constructor.
    public ManosRoboticas(String ID, Posicion posicion, boolean cargado, int anioFabricacion){
        super(ID, posicion, cargado, anioFabricacion);
    }
    
    @Override
    public void mnt() {
        if(this.getCarga() < 1){
            super.mnt();
        }else{
            System.out.println("\n¡Ha superado el límite de carga!");
        }
    }
}
