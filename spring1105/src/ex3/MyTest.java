package ex3;

public class MyTest {
	private int num;
	private String msg;
	private String code;
	
	public MyTest(int num) {
		this.num = num;
		System.out.println("int�� �����ڰ� ȣ��");
	}
	public MyTest(String msg) {
		this.msg = msg;
		System.out.println("String�� �����ڰ� ȣ��");
	}
	public MyTest(int num, String msg) {
		this.num = num;
		this.msg = msg;
		System.out.println("int��, String�� �����ڰ� ȣ��");
	}
	public MyTest(String code, int num) {
		this.num = num;
		this.code = code;
		System.out.println("String��, int�� �����ڰ� ȣ��");
	}
	public String printMyTest() {
		StringBuffer sb = new StringBuffer();
		sb.append("num : ").append(num);
		sb.append("msg : ").append(msg);
		sb.append("code : ").append(code);
		return sb.toString();
	}
}
