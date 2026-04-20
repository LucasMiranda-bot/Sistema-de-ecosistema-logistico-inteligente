public class DronTransporte extends Vehiculo implements IConectable{
    
    public DronTransporte(int id) {
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("El dron" + getId() + " despega y avanza en linea recta");
    }

    @Override
    public void sincronizarGps() {
        System.out.println("El dron" + " esta sincronizado con el gps");
    }
}
