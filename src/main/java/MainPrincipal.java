import java.util.Scanner;
import javax.persistence.Column;
import javax.persistence.Id;
import Modelo.Instrumentos;
public class MainPrincipal {
    public static void main(String[] args) {
        String vnumSerieInst, vnInst, vpeso, vfechaRecep, vtransportista, vobservaciones;

        Modelo.InstrumentosDAO instrumentoDAO = new Modelo.InstrumentosDAO();

        Scanner escritura = new Scanner(System.in);

        System.out.println("Vamos a proceder a insertar un nuevo pedido en la tienda Clave de Sol.");
        
		System.out.println("Por favor, introduzca el número de serie del pedido:");
		vnumSerieInst=escritura.nextLine();
		
		System.out.println("Por favor, introduzca el numero de instrumentos que componen el pedido:");
		vnInst=escritura.nextLine();
		
		System.out.println("Por favor, indique el peso total del pedido");
		vpeso=escritura.nextLine();
		
		System.out.println("Por favor, introduzca la fecha de recepción del pedido.");
		System.out.println("El formato debe ser dd-mm-yyyy:");
		vfechaRecep=escritura.nextLine();
		
		System.out.println("Por favor, determine el transportista");
		vtransportista=escritura.nextLine();
		
		System.out.println("Por favor, indiquenos cualquier observación (max 100 digitos con espacios)");
		vobservaciones=escritura.nextLine();
		System.out.println("Un momento, estamos almacenando todos los datos.");
		Modelo.Instrumentos nuevopedidoinstrumento= new Modelo.Instrumentos (vnumSerieInst, vnInst, vpeso, vfechaRecep, vtransportista, vobservaciones);
		System.out.println("Un momento, estamos creando transacción.");
		instrumentoDAO.insertarInstrumento(nuevopedidoinstrumento);

    }
}