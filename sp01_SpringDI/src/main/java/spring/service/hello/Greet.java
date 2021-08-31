package spring.service.hello;

public class Greet {
	// field
	private String message;

	
	// Constructor
	public Greet() {
		// 객체 생성 시점 파악
		System.out.println("1. Instance Create >> " + getClass().getName());
	}

	public Greet(String message) {
		System.out.println("1. Instance Create(message) >> " + getClass().getName());
		this.message = message;
	}

	
	// Setter & Getter
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	// message 출력
	public void printMessage() {
		System.out.println("2. Message : " + message+ " >> " +getClass().getName());
	}
	
}


