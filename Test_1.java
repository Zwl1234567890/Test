package 测试_数字和有参方法;

public class Test_1 {
public static void main(String[] args) {
	zhazhi myZhazhi= new zhazhi();
	String myFruit="苹果";
	String myJuice=myZhazhi.zhazhi(myFruit);
	System.out.println(myJuice);
}
}
class zhazhi{

	public String zhazhi(String fruit){

		 String juice = fruit+"汁";
		 return juice;
		
	}
}