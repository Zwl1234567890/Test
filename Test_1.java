package ����_���ֺ��вη���;

public class Test_1 {
public static void main(String[] args) {
	zhazhi myZhazhi= new zhazhi();
	String myFruit="ƻ��";
	String myJuice=myZhazhi.zhazhi(myFruit);
	System.out.println(myJuice);
}
}
class zhazhi{

	public String zhazhi(String fruit){

		 String juice = fruit+"֭";
		 return juice;
		
	}
}