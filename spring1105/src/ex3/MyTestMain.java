package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyTestMain {
	public static void main(String[] args) {
		// ������ �����ε��������� �켱������ String�� �ִ�.
		// ���� int���� ȣ���ϰ� �ʹٸ� type�� �����ϸ�ȴ�. ****
		ApplicationContext ctx = new GenericXmlApplicationContext("ex3/mytest.xml");
		MyTest mt = ctx.getBean("myTest3",MyTest.class);
		System.out.println(mt.printMyTest());
		
	}
}
