/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package uv.org.practica5;

/**
 *
 * @author kali
 */

import org.hibernate.Session;

public class Practica5 {

    public static void main(String[] args) {
        Session session = null;
        session = HibernateUtil.getSession();
        
        DAOEmpleado dao = new DAOEmpleado();
        Empleado emp = new Empleado();
        emp.setClave("01");
        emp.setNombre("Owen");
        emp.setDireccion("Barrio nuevo");
        emp.setTelefono("1234567891");
        
        dao.create(emp);
        
        System.out.println("Hello World!");
    }
}
