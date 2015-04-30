/*
 */
package daos;

import modelos.Servicio;
import modelos.VehiculoHasChofer;
import modelos.VehiculoHasChoferHasServicio;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class VehiculoChoferServicioDao {
    
    
    
    public boolean registrarVehiculoServicio(VehiculoHasChofer vehiculoHasChofer, Servicio servicio){
        boolean aux = false;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        try{            
            VehiculoHasChoferHasServicio vehiSer = new VehiculoHasChoferHasServicio();
            vehiSer.setVehiculoHasChofer(vehiculoHasChofer);
            vehiSer.setServicio(servicio);
            vehiSer.setObservaciones("");
            sesion.save(vehiSer);
            sesion.beginTransaction().commit();
            sesion.close();
            aux = true;
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return aux;
    }
}