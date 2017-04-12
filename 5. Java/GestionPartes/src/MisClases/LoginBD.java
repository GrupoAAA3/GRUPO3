package MisClases;

import java.sql.ResultSet;
import java.sql.Statement;

public class LoginBD {
    private static GenericoBD gbd;

    public LoginBD() {
        
    }
    
    public static String logearUsuario(String nombre, String contraseña) {
        try {
            gbd = new GenericoBD();
            nombre = nombre.toLowerCase();
            contraseña = contraseña.toLowerCase();
            String a = "No se ha encontrado el usuario";
            Statement sentencia = gbd.abrirConexion().createStatement();
            ResultSet resultado = sentencia.executeQuery("select * from Login");
            while (resultado.next()) {
                if (resultado.getString("usuario").equalsIgnoreCase(nombre)&&resultado.getString("contraseña").equals(contraseña)) {
                    ResultSet dni = sentencia.executeQuery("select t.tipo from Login l, Trabajador t where t.dni=l.dni and lower(l.usuario)='"+nombre+"' and lower(contraseña)='"+contraseña+"'");
                    while (dni.next()) {
                        a = dni.getString("tipo");
                    }
                }
            }
            gbd.cerrarConexion();
            return a;
        } 
        catch (Exception e) {javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en logearUsuario " + e.getMessage());
        return "Error";
        }
    
    }
    
    public static String obtenerNombre(String nombre, String contraseña) {
        try {
            gbd = new GenericoBD();
            nombre = nombre.toLowerCase();
            contraseña = contraseña.toLowerCase();
            String a = "No se ha encontrado el usuario";
            Statement sentencia = gbd.abrirConexion().createStatement();
            ResultSet resultado = sentencia.executeQuery("select t.nombre from Login l, Trabajador t where t.dni=l.dni and lower(l.usuario)='"+nombre+"' and lower(contraseña)='"+contraseña+"'");
            while (resultado.next()) {
                a = resultado.getString("nombre");
            }
            gbd.cerrarConexion();
            return a;
        } 
        catch (Exception e) {javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en obtenerNombre " + e.getMessage());
        return "Error";
        }
    
    }
    
    public static void crearLogin (String nombre, String apeuno, String apedos,String dni) {
        try {
            String cadena = nombre.charAt(0)+apeuno;
            gbd = new GenericoBD();
            Statement sentencia = gbd.abrirConexion().createStatement();
            ResultSet resultado = sentencia.executeQuery("select * from Login");
            while (resultado.next()) {
                if (cadena.equalsIgnoreCase(resultado.getString("nombre")))
                    cadena = cadena+apedos;
            }
            sentencia.executeUpdate("insert into login values ('"+cadena+"','"+cadena+"','"+dni+"')");
            javax.swing.JOptionPane.showMessageDialog(null, "Login generado.\n Usuario :"+cadena+"\nContraseña: "+cadena);
            gbd.cerrarConexion();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en crearLogin " + e.getMessage());
        }
    }
}
