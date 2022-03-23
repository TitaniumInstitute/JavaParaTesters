import com.tutorial.config.MySQLConfig;
import com.tutorial.entities.Gato;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorldApp {

    public static void main(String[] args) {

        MySQLConfig sqlConfig = new MySQLConfig();
        String query = "SELECT * FROM Gato";
        List<Gato> gatos = new ArrayList<>();

        try {
            ResultSet rs = sqlConfig.ejecutarQuery(query);

            while(rs.next()) {
                String nombre = rs.getString("nombre");
                String raza = rs.getString("raza");
                String color = rs.getString("color");

                Gato gato = new Gato();
                gato.setNombre(nombre);
                gato.setRaza(raza);
                gato.setColor(color);

                gatos.add(gato);
            }

            System.out.println(String.format("Hay %s gatos en la BD", gatos.stream().count()));

            List<Gato> gatosCriollos = gatos.stream().filter(gato -> gato.getRaza().equalsIgnoreCase("Criollo")).collect(Collectors.toList());

            System.out.println(String.format("Hay %s gatos criollos en la BD", gatosCriollos.stream().count()));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
