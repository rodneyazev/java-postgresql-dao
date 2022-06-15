// Create, Insert, Update, Delete PostgreSQL data

package com.postgresql.app;

import java.sql.SQLException;

import com.postgresql.dao.PostgreSQLDAO;

public class PostgreSQL {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		PostgreSQLDAO postgreSQLDAO = new PostgreSQLDAO();
		
		// postgreSQLDAO.createTable();
		postgreSQLDAO.deleteData(1);
		postgreSQLDAO.deleteData(2);
		postgreSQLDAO.deleteData(3);
		postgreSQLDAO.deleteData(4);
		postgreSQLDAO.deleteData(5);
		
		postgreSQLDAO.insertData(1,"rodney");
		postgreSQLDAO.insertData(2,"paula");
		postgreSQLDAO.insertData(3,"paulo");
		postgreSQLDAO.insertData(4,"jose");
		postgreSQLDAO.insertData(5,"alice");
		postgreSQLDAO.selectData();
		postgreSQLDAO.updateData(1, "azevedo");
		System.out.println();
		postgreSQLDAO.selectData();
		postgreSQLDAO.deleteData(1);
		System.out.println();
		postgreSQLDAO.selectData();
	}

}
