package pe.edu.uni.educaapp.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import pe.edu.uni.educaapp.db.AccesoDB;
import pe.edu.uni.educaapp.dto.AlumnoDto;

public class CrudAlumnoService
        implements CrudServiceSpec<AlumnoDto>, RowMapper<AlumnoDto> {
    
    // Consultas base
    final String SQL_SELECT = "SELECT alu_id,alu_nombre,alu_direccion,alu_telefono,alu_email FROM ALUMNO ";
    final String SQL_INSERT = "INSERT INTO alumno(alu_id,alu_nombre,alu_direccion,alu_telefono,alu_email) VALUES(?,?,?,?,?)";
    
    private Connection cn;
    
    @Override
    public AlumnoDto read(int codigo) {
        AlumnoDto dto = null;
        String sql;
        PreparedStatement pstm;
        ResultSet rs;
        try {
            cn = AccesoDB.getConnection();
            sql = SQL_SELECT + " where alu_id=?";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
            if(rs.next()){
                dto = mapRow(rs);
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw  new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw  new RuntimeException("Error en el proceso.");
        } finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return dto;
    }
    
    @Override
    public List<AlumnoDto> readAll() {
        List<AlumnoDto> lista = new ArrayList<>();
        PreparedStatement pstm;
        ResultSet rs;
        try {
            cn = AccesoDB.getConnection();
            pstm = cn.prepareStatement(SQL_SELECT);
            rs = pstm.executeQuery();
            while(rs.next()){
                lista.add(mapRow(rs));
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw  new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw  new RuntimeException("Error en el proceso.");
        } finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }
    
    @Override
    public List<AlumnoDto> readAll(AlumnoDto model) {
        List<AlumnoDto> lista = new ArrayList<>();
        PreparedStatement pstm;
        ResultSet rs;
        String sql = "";
        try {
            sql = SQL_SELECT + " WHERE alu_id = IIF(?=0,alu_id,?) AND alu_nombre like CONCAT('%',?,'%')";
            cn = AccesoDB.getConnection();
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, model.getId());
            pstm.setInt(2, model.getId());
            pstm.setString(3, model.getNombre());
            rs = pstm.executeQuery();
            while(rs.next()){
                lista.add(mapRow(rs));
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw  new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw  new RuntimeException("Error en el proceso.");
        } finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }
    
    @Override
    public void insert(AlumnoDto model) {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int id;
        final String SQL_ID = "select max(alu_id) id from ALUMNO";
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            // Generar el codigo
            pstm = cn.prepareStatement(SQL_ID);
            rs = pstm.executeQuery();
            rs.next();
            id = rs.getInt("id") + 1;
            rs.close();
            pstm.close();
            // Insertar fila
            pstm = cn.prepareStatement(SQL_INSERT);
            pstm.setInt(1, id);
            pstm.setString(2, model.getNombre());
            pstm.setString(3, model.getDireccion());
            pstm.setString(4, model.getTelefono());
            pstm.setString(5, model.getEmail());
            pstm.executeUpdate();
            pstm.close();
            // Final
            model.setId(id);
            cn.commit();
        } catch (SQLException e) {
            try {
                cn.rollback(); // Cancela todos los cambios
            } catch (Exception e1) {
            }
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try {
                cn.rollback(); // Cancela todos los cambios
            } catch (Exception e1) {
            }
            String s = "Error en el proceso, intentelo mas tarde.";
            throw new RuntimeException(s);
        }  finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }
    
    @Override
    public void update(AlumnoDto model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void delete(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public AlumnoDto mapRow(ResultSet rs) throws SQLException {
        AlumnoDto dto = new AlumnoDto();
        dto.setId(rs.getInt("alu_id"));
        dto.setNombre(rs.getString("alu_nombre"));
        dto.setDireccion(rs.getString("alu_direccion"));
        dto.setTelefono(rs.getString("alu_telefono"));
        dto.setEmail(rs.getString("alu_email"));
        return dto;
    }

}
