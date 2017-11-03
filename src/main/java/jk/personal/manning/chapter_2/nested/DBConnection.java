package jk.personal.manning.chapter_2.nested;

class DBConnection {

    public DBConnection(String username, String pwd, String url) {
	// TODO Auto-generated constructor stub
    }
    
    public DBConnection OracleConnection(String username, String pwd, String url) {
	DBConnection conn = DBConnectionCache.getDefaultOracleConnection();
	if(conn != null) {
	    return conn;
	} else {
	    return null;
	}

    }

    static class DBConnectionCache {
	static DBConnection[] connections;
	
	static {
	    connections = new DBConnection[3];
	    connections[0] = new DBConnection(null, null, null);
	    connections[1] = new DBConnection(null, null, null);
	}
	
	static DBConnection getDefaultOracleConnection() {
	    return connections[0];
	}
	
	static DBConnection getDefaultMySQLConnection() {
	    return connections[1];
	}
    }
    
}
