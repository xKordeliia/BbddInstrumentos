package Modelo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class InstrumentosDAO {
    public void insertarInstrumento(Modelo.Instrumentos instrumento) {
    	 SessionFactory mf = Modelo.ManejoSession.getmf();
         Session ms = mf.openSession();
        try {
            System.out.println("Un momento, estamos iniciando la conexión con la Base de Datos para introducir los datos a la tabla de instrumentos");
            ms.beginTransaction();
            System.out.println("Estamos enviando sus datos al servidor de la base de datos.");
            ms.save(instrumento);
            ms.getTransaction().commit();
            System.out.println("Datos de pedido de instrumentos introducidos de forma correcta.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	 ms.close();
             mf.close();
        }
        try {
            System.out.println("Un momento, estamos iniciando la conexión con la Base de Datos para proceder a su lectura");
            ms.beginTransaction();
            System.out.println("Procedemos a mostrar los datos del pedido para la ID de pedido: " + instrumento.getVidpedido());
            Modelo.Instrumentos nuevopedidoinstrumento = ms.get(Modelo.Instrumentos.class, instrumento.getVidpedido());
            System.out.println("El pedido en Clave de Sol es el siguiente " + nuevopedidoinstrumento);
            ms.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	 ms.close();
             mf.close();
        }  }  }
