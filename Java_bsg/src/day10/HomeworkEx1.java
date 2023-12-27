package day10;

public class HomeworkEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		int num2=2;
		char operator='+';
		double res = arithmeticCaculator(num1,operator,num2);
		System.out.println(""+num1+operator+num2+"="+res);
		
	}
/*두 정수와 산술 연산자가 주어지면 산술 연산 결과를 알려주는 메서드
 * 
 * @param num1 정수1
 * @param num2 정수2
 * @param operator 산술연산자
 * @return  정수1과 정수2를 산술연산한 결과=>너누기 때문에
 * */
	public static double arithmeticCaculator(int num1,char operator,int num2) {
		switch(operator) {
		case '+': return num1+num2;
		case '-': return num1-num2;
		case '*': return num1*num2;
		case '/': return num1/num2;
		case '%': return num1%(double)num2;
		}
		//산술 연산자가 아닌 경우.아직은 예외처리를 안배워서 0으로 리턴
		//그래서 0이 리턴되는 경우 1-1인지 1*0인지 4%2인지 0/2인지 구분이 안됨
		return 0;
	}
}
