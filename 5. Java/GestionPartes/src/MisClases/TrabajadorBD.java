package MisClases;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TrabajadorBD {
     private static GenericoBD gbd;

    public TrabajadorBD() {
        
    }
    
    public static void registrarTrabajador(Trabajador tra) {
        try {
            gbd = new GenericoBD();
            Statement sentencia = gbd.abrirConexion().createStatement();
            sentencia.executeUpdate("insert into trabajador values ('"+tra.getDni()+"','"+tra.getNombre()+"','"+tra.getApeuno()+"','"+tra.getApedos()+"',"+tra.getDireccion().getId()+","+tra.getTelefonoEmpresa()+","+tra.getTelefonoPersonal()+","+tra.getSalario()+",TO_DATE('"+tra.getFechaNac()+"','yyyy/mm/dd'),'"+tra.getTipo()+"',"+tra.getCodigo().getCodigo()+")");
          //sentencia.executeUpdate("INSERT INTO TRABAJADOR VALUES ('  12312312A     ','  Asier            ','  Suárez           ','  Ubierna          ',  01                          ,  945945945                 ,  688688688                  ,  2000.00           ,TO_DATE('  1997/01/01         ','yyyy/mm/dd'),'  administracion ',  01                           )
            javax.swing.JOptionPane.showMessageDialog(null, "Trabajador "+tra.getNombre()+" insertado en la base de datos");
            LoginBD.crearLogin(tra.getNombre(), tra.getApeuno(), tra.getApedos(), tra.getDni());
            
            gbd.cerrarConexion();
        } 
        catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en registrarTrabajador " + e.getMessage());
        }
    
    }
    
    public static ArrayList<Trabajador> listaTrabajadores() {
        try {
            ArrayList<Trabajador> lista = new ArrayList();
            gbd = new GenericoBD();
            Statement sentencia = gbd.abrirConexion().createStatement();
            ResultSet resultado = sentencia.executeQuery("select * from trabajador");
            while (resultado.next()) {
                Trabajador tra = new Trabajador(resultado.getString("dni"),resultado.getString("nombre"),resultado.getString("apellido1"),resultado.getString("apellido2"),DireccionBD.obtenerDireccionId(resultado.getInt("direccion")),resultado.getString("tel_per"),resultado.getString("tel_emp"),resultado.getDouble("Salario"),resultado.getString("fecha_nac"),resultado.getString("tipo"),CentroBD.buscarPorId(resultado.getInt("id_Centro")));
                lista.add(tra);
            }
            return lista;
        }
        catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en listaTrabajadores " + e.getMessage());
        }
        return null;
    }
    
    public static void eliminarTrabajador(String dni) {
        try {
            gbd = new GenericoBD();
            Statement sentencia = gbd.abrirConexion().createStatement();
            sentencia.executeUpdate("delete from trabajador where lower(dni) = '"+dni+"'");
            gbd.cerrarConexion();
        }
        catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en eliminarTrabajador " + e.getMessage());
        }
    }
}
