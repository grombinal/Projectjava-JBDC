package project;

import project.dao.DbConnection;

public class mainapp {

	public static void main(String[] args) {
		DbConnection.getConnection();
	}

}
