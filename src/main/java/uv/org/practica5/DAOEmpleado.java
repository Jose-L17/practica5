/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.org.practica5;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author kali
 */
public class DAOEmpleado implements IDAOGeneral<Object, Object>{

    @Override
    public Object create(Object p) {
        Session session = HibernateUtil.getSession();
        Transaction t = session.beginTransaction();
        
        session.save(p);
        
        
        t.commit();
        session.close();
        return p;
    }

    @Override
    public boolean delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object update(Object p, Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Object> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object findById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
