
public class MethodoverloadingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1,2));
		System.out.println(sum(1.2,2.3));
	}
public static int sum(int num1,int num2) {
	return num1+num2;
}
public static double sum(double num1,double num2) {
	return num1+num2;
}
//아래 메서드는 1번 메서드와 매개변수의 개수도 같고 자료형도 같기 때문에 메서드 오버로딩x
	/*public static double sum(int num1,int num2) {
		return num1,num2;
	}*/
public static int sum(int num1,int num2,int num3) {
	return num1+num2+num3;
}
}
