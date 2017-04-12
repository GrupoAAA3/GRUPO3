package MisClases;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class DireccionBD {
    private static GenericoBD gbd;
    
    public DireccionBD() {
    
    }
    
    public static ArrayList<Direccion> obtenerDirecciones() {
        ArrayList<Direccion> dir = new ArrayList();
        try {
            gbd = new GenericoBD();
            Statement sentencia = gbd.abrirConexion().createStatement();
            ResultSet resultado = sentencia.executeQuery("select * from direcciones");
            while (resultado.next()) {
                Direccion dire = new Direccion(resultado.getInt("id_dir"),resultado.getString("provincia"),resultado.getString("ciudad"),resultado.getString("calle"),resultado.getInt("numero"),resultado.getInt("piso"),resultado.getString("mano"),resultado.getInt("codigo_postal"));
                dir.add(dire);
            }
            gbd.cerrarConexion();
            return dir;
        } 
        catch (Exception e) {javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en obtenerDirecciones " + e.getMessage());
            return dir;
        } 
    }
    
    public static Direccion obtenerDireccionId(int id) {
        Direccion dir = new Direccion();
        try {
            gbd = new GenericoBD();
            Statement sentencia = gbd.abrirConexion().createStatement();
            ResultSet resultado = sentencia.executeQuery("select * from direcciones where id_dir='"+id+"'");
            while (resultado.next()) {
                dir = new Direccion(resultado.getInt("id_dir"),resultado.getString("provincia"),resultado.getString("ciudad"),resultado.getString("calle"),resultado.getInt("numero"),resultado.getInt("piso"),resultado.getString("mano"),resultado.getInt("codigo_postal"));
            }
            gbd.cerrarConexion();
            return dir;
        } 
        catch (Exception e) {javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en obtenerDireccionId " + e.getMessage());
            return dir;
        } 
    }
    
    public static void registrarDireccionTrabajador(Direccion dir) {
        try {
            gbd = new GenericoBD();
            Statement sentencia = gbd.abrirConexion().createStatement();
            //String hola = "insert into direcciones(id_dir,calle,numero,piso,mano) values (0,'Juan Carlos I',24,4,'izq')";
            //javax.swing.JOptionPane.showMessageDialog(null, hola);
            //javax.swing.JOptionPane.showMessageDialog(null, "insert into direcciones(id_dir,calle,numero,piso,mano) values ("+dir.getId()+",'"+dir.getCalle()+"',"+dir.getNumero()+","+dir.getPiso()+",'"+dir.getMano()+"')");
            sentencia.executeUpdate("insert into direcciones (id_dir,calle,numero,piso,mano) values (" + dir.getId() +",'"+dir.getCalle()+"',"+dir.getNumero()+","+dir.getPiso()+",'"+dir.getMano()+"')");
            //int n= sentencia.executeUpdate(hola);
            gbd.cerrarConexion();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Problemas en registrarDireccionTrabajador "+e.getMessage());
        }
    }
}
