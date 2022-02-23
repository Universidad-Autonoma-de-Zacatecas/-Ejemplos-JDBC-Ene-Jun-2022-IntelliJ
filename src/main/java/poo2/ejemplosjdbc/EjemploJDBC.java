package poo2.ejemplosjdbc;

import java.sql.*;

public class EjemploJDBC  {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Modificar para que use la base de datos que tenga
            String urlBD =
                    "jdbc:mysql://localhost/poo2";
            // Modificar para referirse al usuario que haya creado
            Connection conn =
                    DriverManager.getConnection(
                            urlBD, "usuario2022", "clavecita"
                    );
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


