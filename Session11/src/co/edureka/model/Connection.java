package co.edureka.model;

// Bean
public class Connection {

	// Attributes
	String url;
	String username;
	String password;
	String driver;
	
	public Connection() {
		System.out.println("==Connection Object Constructed==");
	}

	public Connection(String url, String username, String password, String driver) {
		System.out.println("**Connection Object Constructed**");
		this.url = url;
		this.username = username;
		this.password = password;
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public void myInit(){
		System.out.println("==Connection myInit==");
	}
	
	public void myDestroy(){
		System.out.println("==Connection myDestroy==");
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", username=" + username + ", password=" + password + ", driver=" + driver
				+ "]\nHashCode:"+super.toString();
	}
	
}
