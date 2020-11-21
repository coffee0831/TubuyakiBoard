package model;

public class LoginLogic {
	//ログインに関する処理、パスワードが「1234」か？
	public boolean execute(User user) {
		if(user.getPass().equals("1234")) {return true;}
		return false;
	}

}
