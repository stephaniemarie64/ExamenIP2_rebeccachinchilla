
import java.util.Scanner;

public class RobotPesado extends Robot {
    
    //Constructor.
    public RobotPesado(String ID, Posicion posicion, boolean cargado, int anioFabricacion){
        super(ID, posicion, cargado, anioFabricacion);
    }
    
    @Override
    public void mnt() {
        
        Scanner leer = new Scanner(System.in);
        
        if(this.getCarga() < 5){
            while(this.getCarga() < 5){
                super.mnt();
            }
        }else{
            System.out.print("\n1 -> para cargar UN elemento más: ");
            int opcion = leer.nextInt();
            if(opcion == 1){
                super.mnt();
            }else{
                System.out.println("\n¡No se ha cargado nada!");
            }
        }
    }
}
