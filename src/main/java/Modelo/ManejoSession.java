package Modelo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManejoSession {

    private static final SessionFactory mf;
    static {
        try {
            mf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Modelo.Instrumentos.class).buildSessionFactory();
        } catch(Throwable th){
            System.err.println("Ha ocurriedo un error mientras se creaba SessionFactory"+th);
            throw new ExceptionInInitializerError(th);
        }
    }
    public static SessionFactory getmf(){
        return mf;
    }

}