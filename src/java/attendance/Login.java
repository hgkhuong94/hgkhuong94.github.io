package attendance;
public class Login {
	private String username;
	private String pass;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public boolean validate() {
        if ("admin".equals(pass)) {
            return true;
        } else {
            return false;
        }
    }
}


