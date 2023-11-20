package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import modelo.Cliente;

/**
 *
 * @author gustavogongoraortiz
 */
public class Registro {

    //EDITAR TODO CON LAS NUEVAS TABLAS DE NOSOTROS
//    public boolean agregar(Cliente cliente) throws Exception {
//        Date date;
//        try {
//            Conexion con = new Conexion();
//            //Connection cnx = con.obtenerConexion();
//            Connection cnx = con.obtenerConexionOracle();
//
//            date = libro.getPublicacion();
//
//            String query = "insert into libro(titulo,autor,publicacion,precio,disponible) values(?,?,?,?,?)";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//            stmt.setString(1, libro.getTitulo());
//            stmt.setString(2, libro.getAutor());
//            stmt.setDate(3, new java.sql.Date(date.getTime()));
//            stmt.setInt(4, libro.getPrecio());
//            stmt.setBoolean(5, libro.isDisponible());
//
//            stmt.executeUpdate();
//            stmt.close();
//            cnx.close();
//
//            return true;
//
//        } catch (SQLException e) {
//            System.out.println("Error SQL al agregar Libro " + e.getMessage());
//            return false;
//        }
//    }
//
//    public boolean eliminar(int idLibro) throws Exception {
//
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexionOracle();
//
//            String query = "delete from libro where idlibro=?";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//            stmt.setInt(1, idLibro);
//
//            stmt.executeUpdate();
//            stmt.close();
//            cnx.close();
//
//            return true;
//
//        } catch (SQLException e) {
//            System.out.println("Error SQL al eliminar Libro " + e.getMessage());
//            return false;
//        }
//    }
//
//    public boolean actualizar(Libro libro) throws Exception {
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexionOracle();
//
//            String query = "update libro set titulo=?,autor=?,publicacion=?,precio=?,disponible=? where idlibro=?";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//            stmt.setString(1, libro.getTitulo());
//            stmt.setString(2, libro.getAutor());
//            stmt.setDate(3, new java.sql.Date(libro.getPublicacion().getTime()));
//            stmt.setInt(4, libro.getPrecio());
//            stmt.setBoolean(5, libro.isDisponible());
//            stmt.setInt(6, libro.getIdLibro());
//
//            stmt.executeUpdate();
//            stmt.close();
//            cnx.close();
//
//            return true;
//
//        } catch (SQLException e) {
//            System.out.println("Error SQL al actualizar Libro " + e.getMessage());
//            return false;
//        }
//    }
//
//    public Libro buscarPorId(int idLibro) throws Exception {
//        Libro libro = new Libro();
//        try {
//            Conexion con = new Conexion();
//            //Connection cnx = con.obtenerConexion();
//            Connection cnx = con.obtenerConexionOracle();
//
//            String query = "select * from libro where idlibro=?";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//            stmt.setInt(1, idLibro);
//
//            ResultSet rs = stmt.executeQuery();
//
//            if (rs.next()) {
//                libro.setIdLibro(rs.getInt("idlibro"));
//                libro.setTitulo(rs.getString("titulo"));
//                libro.setAutor(rs.getString("autor"));
//                libro.setPublicacion(rs.getDate("publicacion"));
//                libro.setPrecio(rs.getInt("precio"));
//                libro.setDisponible(rs.getBoolean("disponible"));
//            }
//            rs.close();
//            stmt.close();
//            cnx.close();
//
//        } catch (SQLException e) {
//            System.out.println("Error SQL al listar Libro por id" + e.getMessage());
//        }
//        return libro;
//    }
//
//    public ArrayList<Libro> buscarTodos() throws Exception {
//        ArrayList<Libro> lista = new ArrayList<>();
//        try {
//            Conexion con = new Conexion();
//            //Connection cnx = con.obtenerConexion();
//            Connection cnx = con.obtenerConexionOracle();
//
//            String query = "select * from libro order by titulo";
//            PreparedStatement stmt = cnx.prepareStatement(query);
//
//            ResultSet rs = stmt.executeQuery();
//
//            while (rs.next()) {
//                Libro libro = new Libro();
//                libro.setIdLibro(rs.getInt("idlibro"));
//                libro.setTitulo(rs.getString("titulo"));
//                libro.setAutor(rs.getString("autor"));
//                libro.setPublicacion(rs.getDate("publicacion"));
//                libro.setPrecio(rs.getInt("precio"));
//                libro.setDisponible(rs.getBoolean("disponible"));
//
//                lista.add(libro);
//            }
//            rs.close();
//            stmt.close();
//            cnx.close();
//
//        } catch (SQLException e) {
//            System.out.println("Error SQL al listar Libros " + e.getMessage());
//        }
//        return lista;
//    }

    // Agregar Cliente
    public boolean agregarCliente(Cliente cliente) throws Exception {
        Date date;
        try {
            Conexion con = new Conexion();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = con.obtenerConexionOracle();

            //date = libro.getPublicacion();
            
            String query = "insert into CLIENTE(nombre_cli,apellpaterno_cli,apellmaterno_cli,direccion,telefono,email_cli) values(?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, cliente.getNombre_cli());
            stmt.setString(2, cliente.getApellpaterno_cli());
            stmt.setString(3, cliente.getApellmaterno_cli());
            stmt.setString(4, cliente.getDireccion());
            stmt.setInt(5, cliente.getTelefono());
            stmt.setString(6, cliente.getEmail_cli());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Cliente " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarCliente(int id_cliente) throws Exception {

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();

            String query = "delete from Cliente where id_cliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id_cliente);

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar Cliente " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar(Cliente cliente) throws Exception {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();

            String query = "update Cliente set nombre_cli=?,apellpaterno_cli=?,apellmaterno_cli=?,direccion=?,telefono=?, email_cli=? where id_cliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, cliente.getNombre_cli());
            stmt.setString(2, cliente.getApellpaterno_cli());
            stmt.setString(3, cliente.getApellmaterno_cli());
            stmt.setString(4, cliente.getDireccion());
            stmt.setInt(5, cliente.getTelefono());
            stmt.setString(6, cliente.getEmail_cli());
            stmt.setInt(7, cliente.getId_cliente());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar Cliente " + e.getMessage());
            return false;
        }
    }

    public Cliente buscarPorIdCliente(int id_cliente) throws Exception {
        Cliente cliente = new Cliente();
        try {
            Conexion con = new Conexion();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = con.obtenerConexionOracle();

            String query = "select * from cliente where id_cliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, id_cliente);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNombre_cli(rs.getString("nombre"));
                cliente.setApellpaterno_cli(rs.getString("apellido paterno"));
                cliente.setApellmaterno_cli(rs.getString("apellido materno"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setEmail_cli(rs.getString("email"));
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar Libro por id" + e.getMessage());
        }
        return cliente;
    }

    public ArrayList<Cliente> buscarTodosCliente() throws Exception {
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            //Connection cnx = con.obtenerConexion();
            Connection cnx = con.obtenerConexionOracle();

            String query = "select * from cliente order by apellpaterno_cli";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNombre_cli(rs.getString("nombre"));
                cliente.setApellpaterno_cli(rs.getString("apellido paterno"));
                cliente.setApellmaterno_cli(rs.getString("apellido materno"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setEmail_cli(rs.getString("email"));

                lista.add(cliente);
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al listar Clientes " + e.getMessage());
        }
        return lista;
    }
    // FIN CONTROLADORES CLIENTE

}
