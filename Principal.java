import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();

        int n = 0;
        System.out.println("Ingrese la cantidad de celdas de su parqueadero");
        n = sc.nextInt();
        ObjVehiculo[] r = new ObjVehiculo[n];
        r = m.LlenarRegistro(r);
        r = m.CalcularNuevoPago(r);
        m.MostrarRegistros(r);
    }
}
