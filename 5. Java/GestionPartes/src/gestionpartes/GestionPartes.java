package gestionpartes;

import MisClases.*;
import MisExcepciones.*;
import MisVentanas.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestionPartes {

    private static DModificar dmodificar;
    private static DParte dparte;
    private static VentanaInicial vinicial;
    private static DLogin login;
    private static Trabajador trabajadorActual;
    private static VAdministrador vadministra;
    private static VLogistica vlogistica;
    
    public static void main(String[] args) {
        vinicial = new VentanaInicial();
        vinicial.setVisible(true);
        login = new DLogin(vinicial,true);
        login.setVisible(true);
    }
    
    public static void cerrarAdministrador() {
        vadministra.dispose();
        login.setVisible(true);
    }
    
    public static void mostrarTrabajadores() {
        dmodificar = new DModificar(vadministra, true);
        dmodificar.setVisible(true);
    }
    
    public static void cerrarTrabajadores() {
        dmodificar.dispose();
    }
    
    public static void crearTrabajadorNuevo(String dni, String nombre, String apeUno, String apeDos, String calle, String portal, String piso, String mano, String tPersonal, String tEmpresa, String salario, String tipo, String fecha, String centro) {
        if (salario.equals("")) {
            salario=null;
        }
        else {
            
        }
        if (tPersonal.equals("")) {
            tPersonal = null;
        }
        else {
            
        }
        int portali = Integer.parseInt(portal);
        int pisoi = Integer.parseInt(piso);
        Direccion dir = registrarDireccion(calle, portali, pisoi, mano);
        Centro cen = CentroBD.idPorNombre(centro);
        try {
            if (cen==null)
                throw new VacioException("Problemas en reconocer el centro");
            JOptionPane.showMessageDialog(null, fecha);
            
            Trabajador tra = new Trabajador(dni,nombre,apeUno,apeDos,dir,tPersonal,tEmpresa,Double.parseDouble(salario),fecha,tipo,cen);
            TrabajadorBD.registrarTrabajador(tra);
        }
        catch (VacioException e) {
            JOptionPane.showMessageDialog(null, VacioException.getMensaje());
        }
    }
    
    public static Direccion registrarDireccion(String calle, int portal, int piso, String mano) {
        ArrayList<Direccion> dir = DireccionBD.obtenerDirecciones();
        boolean salir=false;
        int z=0;
        for (int x=0;salir==false;x++) {
            z=x;
            for (int y=0;salir==false;y++) {
                if (x!=dir.get(y).getId())
                    salir=true;
            }
        }
        
        Direccion dire = new Direccion(z,calle,portal,piso,mano);
        DireccionBD.registrarDireccionTrabajador(dire);
        return dire;
    }
    
    public static ArrayList<String> nombreCentros() {
        ArrayList<String> nomCen = new ArrayList();
        ArrayList<Centro> cen = CentroBD.listaCentros();
        for (int x=0;x<cen.size();x++) {
            nomCen.add(cen.get(x).getNombre());
        }
        return nomCen;
    }
    
    public static ArrayList<Centro> listaCentros(int id) {
        ArrayList<Centro> a = CentroBD.listaCentros();
        return a;
    }
    
    public static void borrarTrabajador(String dni) {
        dni=dni.toLowerCase();
        TrabajadorBD.eliminarTrabajador(dni);
    }
    
    public static void login(String nombre, String contraseña) {
        String a = MisClases.LoginBD.logearUsuario(nombre, contraseña);
        if (a.equalsIgnoreCase("logistica")||a.equalsIgnoreCase("administracion")) {
            login.dispose();
            String b = MisClases.LoginBD.obtenerNombre(nombre, contraseña);
            JOptionPane.showMessageDialog(null, "Bienvenido, "+b);
            if (a.equalsIgnoreCase("logistica")){
                vlogistica = new VLogistica();
                vlogistica.setVisible(true);
            }
            else {
                vadministra = new VAdministrador();
                vadministra.setVisible(true);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, a);
            login.contaErrores();
        }
    }
    
    public static boolean mostrarDatosTrabajador(String dni) { /* va a estar mal ese for fijo xdxdxdxdxd */
        ArrayList<Trabajador> lista = TrabajadorBD.listaTrabajadores();
        boolean existe=false;
        for (int x=0;x<lista.size();x++) {
            if (dni.equalsIgnoreCase(lista.get(x).getDni())) {
                trabajadorActual = lista.get(x);
                existe=true;
            }
        }
        return existe;
    }
    
    public static Trabajador getTrabajadorActual() {
        return trabajadorActual;
    }
    
    public static void cerrarProyecto() {
        System.exit(0);
    }
    
}
