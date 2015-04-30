/*
 */
package daos;

import modelos.Chofer;
import modelos.Vehiculo;
import modelos.VehiculoHasChofer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class VehiculoChoferDao {
    
    public boolean registrarVehiculoChofer(Vehiculo vehiculo, Chofer chofer){
        boolean aux = false;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        try{
            VehiculoHasChofer vehiChof = new VehiculoHasChofer();
            vehiChof.setChofer(chofer);
            vehiChof.setVehiculo(vehiculo);            
            sesion.save(vehiChof);
            sesion.beginTransaction().commit();
            sesion.close();
            aux = true;
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return aux;
    }
}