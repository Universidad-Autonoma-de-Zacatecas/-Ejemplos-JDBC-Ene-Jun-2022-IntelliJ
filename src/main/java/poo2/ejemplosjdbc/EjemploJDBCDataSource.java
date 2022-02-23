package poo2.ejemplosjdbc;

import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;

public class EjemploJDBCDataSource  {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            MysqlDataSource fuente =
                    new MysqlDataSource();

            // Modificar para usar los datos que correspondan a su computadora
            fuente.setServerName("localhost");
            fuente.setUser("usuario2022");
            fuente.setPassword("clavecita");
            fuente.setDatabaseName("poo2");
            Connection conn = fuente.getConnection();

            Statement consulta = conn.createStatement();
            ResultSet rs =
                    consulta.executeQuery(
                            "SELECT * FROM estudiante");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                Float prom = rs.getFloat(4);
                System.out.printf(
                        "%s tiene un promedio de %.2f\n",
                        nombre, prom);
            }
            conn.close();
        }
        catch (ClassNotFoundException ec) {
            System.err.println("No se encontro el driver");
        }
        catch (SQLException es) {
            System.err.println("Error al ejecutar sentencia SQL");
            es.printStackTrace();
        }
    }
}