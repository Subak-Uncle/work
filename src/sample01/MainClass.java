package sample01;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("헬로우 자바");
		System.out.println("수정하였음!!!!!");
		System.out.println("Hello World"); // ln은 줄 바꿈
		System.out.print("Hello"); // 커서 위치 확인(줄 바꿈 없음)
		System.out.print("월드");
		// 기능 : escape sequence
		//		\n(개행) : 행 바꿔라.
		//		\b(backspace) : 한 칸 앞으로
		
		System.out.print("World \n");
		System.out.println("헬로우");
		
		// 		\" : "가 있는 채로 출력
		System.out.println("\"Hello world\"");
		
		//		\t : 띄어 쓰기
		System.out.println("\tHello\tworld");
		System.out.println("\t월드\t헬로");
		
		// \를 표현하고 싶으면? -> \\로 쓰면 됨
		System.out.println("\\헬로우 월드\\");
		
		System.out.printf("--%s--\n", "Hello"); // Hello == 문자열(String)
		// 					표현자료형     값
		/*
		 * %b : boolean 형식으로 출력
		 * %d : 정수 형식
		 * %o : 8진수
		 * %x : 16진수
		 * %f : 소수점 형식
		 * %c : 문자형식
		 * %s : 문자열 형식
		 * %n : 줄바꿈 기능
		 * %e : 지수 표현식
		 */
		System.out.println( 1024 ); // 숫자 출력
		
		System.out.println("Hello" + "World");
		

	}

}

// 한 줄 주석문
/*
	범위 주석문
	Html	<!-- -->
	JSP		<%-- --%>
	mySQL 	--
	python # """주석문 """
*/

