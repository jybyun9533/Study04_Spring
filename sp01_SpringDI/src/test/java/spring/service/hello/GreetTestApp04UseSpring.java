package spring.service.hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class GreetTestApp04UseSpring {

	public static void main(String[] args) {
		// 1. Factory 생성 :: 이 때 주문서를 읽음 -->알아서 공장 안에서 주문서에 적힌 객체를 생성하고 저장
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("./src/main/resources/config/greet.xml")); // 파일시스템이기 때문에 src패키지 인식x >> 처음부터 넣어야 함
		
		
		// 2. Factory에서 저장하고 있는 bean을 받아온다 >> getBean() 사용
		// Greet greet1 = (Greet)factory.getBean("greet1");
		// Greet greet1 = (Greet)factory.getBean("greet2");
		// Greet greet1 = (Greet)factory.getBean("greet3");
		// Greet greet1 = (Greet)factory.getBean("greet4");
		// Greet greet1 = (Greet)factory.getBean("greet5");
		Greet greet1 = (Greet)factory.getBean("greet6");
		
		
		// 3. 받아온 bean의 메소드를 호출
		greet1.printMessage();
	}

}
