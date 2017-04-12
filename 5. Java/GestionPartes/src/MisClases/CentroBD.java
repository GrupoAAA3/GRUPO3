package MisClases;

import java.sql.ResultSet;
import java.util.ArrayList;
//import java.sql.CallableStatement;
import java.sql.Statement;
//import java.sql.Types;

public class CentroBD {
    private static GenericoBD gbd;
    
    public CentroBD() {
    
    }
    
    public static ArrayList<Centro> listaCentros() {
        ArrayList<Centro> listaCen = new ArrayList();
        try {
            gbd = new GenericoBD();
            Statement sentencia = gbd.abrirConexion().createStatement();
            /*CallableStatement datos = gbd.abrirConexion().prepareCall("call visualizar_lista_centro");
            datos.registerOutParameter(0,Types.INTEGER);
            datos.registerOutParameter(1, Types.VARCHAR);
            datos.registerOutParameter(2, Types.INTEGER);
            datos.registerOutParameter(3, Types.INTEGER);*/
            ResultSet resultado = sentencia.executeQuery("select * from centro");
            while (resultado.next()) {
                Direccion dir = DireccionBD.obtenerDireccionId(resultado.getInt("direccion"));
                Centro centro = new Centro(resultado.getInt("id_centro"),resultado.getString("nombre"),dir,resultado.getString("telefono"));
                listaCen.add(centro);
            }
            return listaCen;
        } 
        catch (Exception e) {javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en ListaCentros " + e.getMessage());
        return listaCen;
        }
    
    }
    
    public static Centro idPorNombre(String nom) {
        try {
            Centro devolverid = new Centro();
            int x=0;
            ArrayList<Centro> listaCentros= new ArrayList();
            String resu = "Lista de centros encontrados, teclee el numero del que desee:";
            nom=nom.toLowerCase();
            gbd = new GenericoBD();
            Statement sentencia = gbd.abrirConexion().createStatement();
            ResultSet resultado = sentencia.executeQuery("select * from centro where lower(nombre) = '"+nom+"'");
            while (resultado.next()) {
                x=x+1;
                resu = resu+"\n"+x+". Nombre: "+resultado.getString("nombre")+", Telefono: "+resultado.getString("telefono");
                devolverid=new Centro(resultado.getInt("id_centro"),resultado.getString("nombre"),DireccionBD.obtenerDireccionId(resultado.getInt("direccion")),resultado.getString("Telefono"));
                listaCentros.add(devolverid);
            }
            if (x>=2) {
                boolean salir=false;
                do {
                    try {
                        devolverid= listaCentros.get((Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, resu)))-1);
                        salir=true;
                    }
                    catch (NumberFormatException e) {
                        javax.swing.JOptionPane.showMessageDialog(null ,"Por favor introduzca un numero");
                    }
                } while (salir==false);
            }
            return devolverid;
        }
        
        catch (Exception e) {javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en idPorNombre " + e.getMessage());
        
        }
        return null;
    }
    
    public static Centro buscarPorId(int id) {
        try {
            Centro devolverid = new Centro();
            gbd = new GenericoBD();
            Statement sentencia = gbd.abrirConexion().createStatement();
            ResultSet resultado = sentencia.executeQuery("select * from centro where id_centro = '"+id+"'");
            while (resultado.next()) {
                devolverid=new Centro(resultado.getInt("id_centro"),resultado.getString("nombre"),DireccionBD.obtenerDireccionId(resultado.getInt("direccion")),resultado.getString("Telefono"));
            }
            return devolverid;
        }
        
        catch (Exception e) {javax.swing.JOptionPane.showMessageDialog(null ,"Problemas en idPorNombre " + e.getMessage());
        
        }
        return null;
    }
}
