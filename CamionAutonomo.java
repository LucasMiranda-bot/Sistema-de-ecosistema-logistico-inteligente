public class CamionAutonomo extends Vehiculo implements IConectable{
    
    public CamionAutonomo(int id) {
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("El camion" + getId() + " va por carretera");
    }

    @Override
    public void sincronizarGps() {
        System.out.println("El camion" + getId() + " esta sincronizado con el gps");
    }
}
