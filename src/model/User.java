package model;
//JavaBeansクラス
import java.io.Serializable;

public class User implements Serializable {
//ユーザ名とパスワード情報
	private String name;
	private String pass;

	//引き数が空のコンストラクタ
	public User() {}
	//引き数ありのコンストラクタ
	public User(String name,String pass) {
		this.name=name;
		this.pass=pass;
	}

	public String getName() {return name;}
	public String getPass() {return pass;}
}
