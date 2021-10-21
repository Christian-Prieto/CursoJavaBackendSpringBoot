package es.com.inetum.elementos.controlador;
import java.sql.*;

import javax.swing.JOptionPane;



public class ConectorBBDDMySql {
	   static final String DB_URL = "jdbc:mysql://localhost/pruebascursojavaspringboot";
	   static final String USER = "root";
	   static final String PASS = "";
	   static final String QUERY = "SELECT * from alumnos";
	   
	   private static Connection conection;

	   public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery(QUERY);) {
	         // Extract data from result set
	         while (rs.next()) {
	            // Retrieve by column name
	            System.out.print("ID: " + rs.getInt("ALU_ID"));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	
	   
	   public static boolean conectar() {
		   boolean f = true;
		   String salida ="";
		      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		 	         Statement stmt = conn.createStatement();
		 	         ResultSet rs = stmt.executeQuery(QUERY);) {
		    	  	 int i = 0;
		    	  	 
		 	         while (rs.next()) {
		 	           
		 	            salida +=("N" + i+": "+rs.getString("ALU_NOMBRE")+ "A: " + rs.getString("ALU_APELLIDO")+ "\n");
		 	            i++;
		 	         }
		 	      } catch (SQLException e) {
		 	         e.printStackTrace();
		 	         f = false;
		 	         return f;
		 	        		
		 	      } 
		      JOptionPane.showMessageDialog(null, salida);
		      return f;
		      
		 	   }
	   
		
		public static void desConectar() throws SQLException{
			conection.close();
		}
		public static Connection getConection(){
			return conection;
		}
}
