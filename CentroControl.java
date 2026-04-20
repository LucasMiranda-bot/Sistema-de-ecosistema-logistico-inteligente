import java.util.ArrayList;

public class CentroControl {
    private ArrayList<Vehiculo> vehiculos;

    public CentroControl() {
        this.vehiculos = vehiculos;
    }

    public void registrarUnidad(Vehiculo v) {
        vehiculos.add(v);
    }

    public void monitorearFlota() {
        for(int i = 0; i < vehiculos.size(); i++) {
            vehiculos.get(i).patronMovimiento();
        }
    }
}
