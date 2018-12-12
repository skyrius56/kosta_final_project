package ex1;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		// BeanFactory ���� �����̳� �̱� ������ ����� ���� �ʴ´�.
		// GenericXmlApplicationContext : jdk5���� ����
		// Spring 3.0���� �������ִ� ���׸� ����� �����̳� ��ü
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/hello.xml");
		
		// ������ ��ü HelloBean���� �ּҰ��� ������
		// ���ڰ� configuration xml(hello.xml)�� bean ���̵�, ���� �ۿ��ϴ� ��ü
		HelloBean hb = ctx.getBean("hello", HelloBean.class);
		System.out.println("result : " + hb.printMessage());
		HelloBean hb2 = ctx.getBean("hello", HelloBean.class);
		// scope="prototype"�� �ָ� �̱��� �������͸��� ����� �ȵȴ�.
		System.out.println(hb == hb2);
		// �ѹ��غ���
		// today.jsp���� �׻� ���� ��¥�� ����� ���Ѵ�.
		// TodayBean�� ���� ���� ��¥�� ���������� ����
		// ��浿�̶� �̸��� ���Թ޴� bean�� ���� ����Ͻÿ�,
		// prototype���� name�� �ް� TodayBean������ ��¥�� �����.
		
		
		
		
	}
}
