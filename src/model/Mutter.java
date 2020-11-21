package model;
//JavaBansクラス
import java.io.Serializable;

public class Mutter implements Serializable {
    //つぶやきに関する情報
	private String userName;//ユーザ名
	private String text;//つぶやき内容
	
	//空のコンストラクタ
	public Mutter() {}
	//コンストラクタ
	public Mutter(String userName,String text) {
		this.userName=userName;
		this.text=text;
	}
	public String getUserName() {return userName;}
	public String getText() {return text;}
	
}
