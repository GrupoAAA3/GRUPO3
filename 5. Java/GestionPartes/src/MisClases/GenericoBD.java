package MisClases;
import java.sql.Connection;
import java.sql.DriverManager;

public class GenericoBD {
    
    private Connection con;
    
    public Connection abrirConexion()throws Exception{       
            Class.forName("oracle.jdbc.OracleDriver");

            String login="daw09";
            String password= "daw09";
            String url = "jdbc:oracle:thin:@SrvOracle:1521:orcl";
            con = DriverManager.getConnection(url,login ,password);
            
            return con;
    }
    
    public void cerrarConexion() throws Exception{
            con.close();
    }
        
    
}
