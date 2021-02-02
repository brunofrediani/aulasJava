package Application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import db.DB;

public class Program {

	public static void main(String[] args) {

		
		
		/*
		 * DOUBLE SALARY SÓ ACEITA COM VIRGULA AO INVÉS DE PONTO 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);

		Connection conn = null;
		PreparedStatement st = null;

		try {
			System.out.print("Insira o nome: ");
			String name = sc.nextLine();
			System.out.print("Insira o email: ");
			String email = sc.nextLine();
			System.out.print("Insira o data de nascimento: ");
			Date birthDate = sdf.parse(sc.next());
			System.out.print("Insira o salário base: ");
			Double baseSalary = sc.nextDouble();
			System.out.print("Insira o nº do departamento: ");
			Integer departmentID = sc.nextInt();

			conn = DB.getConnection();
				st = conn.prepareStatement(
				"INSERT INTO seller " 
				+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
				+ "VALUES " 
				+ "(?, ?, ? , ?, ?)");
	
					st.setString(1, name);
					st.setString(2, email);
					st.setDate(3, new java.sql.Date((birthDate).getTime()));
					st.setDouble(4, baseSalary);
					st.setInt(5, departmentID);

			int rowsAffected = st.executeUpdate();
			System.out.println("Done! Rows Affected: " + rowsAffected);

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ParseException e) {
			e.printStackTrace();
		}

		finally {

			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
