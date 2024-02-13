package com.ict.day08;

public class Ex06 {
	/*
	  클래스
	  1. 정의 : 객체( 오브젝트 , object )를 만들기 위한 모든 정보를 가지고 있는 파일( 설계도면 , 거푸집 ) 등으로 표현)
	  2. 클래스가 가지고 있는 것
	     - 멤버 필드 : ( 변수 , 상수 ) , 데이터 , 속성
	     - 멤버 메소드 : 기능 , 동작 
	     - 생성자 = 클래스가 객체로 생성될때 한번 호출 된다.
	               클래스 이름 = 파일 이름 = 저장 이름 = 생성자 이름
	               
	  3. 클래스 구조 : 헤더 , 멤버필드 , 멤버메서드 , 생성자
	  
	     1) 헤더 : [접근제한자] [클래스종류] class 클래스이름{}
	        가) 접근제한자 : 클래스 , 멤버필드 , 멤버 메서드 , 생성자 모두 맨 앞에 사용 가능 (생략 가능)
	                      외부에서 접근할 수 있는 권한의 단계를 말함
	          - public : 누구나 다 접근가능
	          - private : 외부에서는 절대 접근 불가 , 내부멤버(클래스안에 있는 멤버필드와 메서드) 끼리는 접근 가능                               
	          - 생략 (default) : 같은 패키지에서만 접근 가능
	          - protected : 같은 패키지에서 접근 가능 다른 패키지일때는 상속관계에서만 가능
	          
	        나) 클래스 종류 : 일반적인 클래스는 생략한다.
	                       특정 클래스에 해당하는 클래스에게만 예약어를 사용 ( final , abstract , ... )
	          
	        다) class : 클래스임을 나타내는 예약어
	        
	        라) 클래스이름 : 클래스 이름 = 파일 이름 = 저장 이름 = 생성자 이름
	                     첫글자는 대문자 , 두 단어 이상일때는 단어 첫글자들은 대문자
	                     숫자는 중간이나 뒤에 사용 , 공백문자 사용 불가

	   4. 멤버 필드 : 데이터 , 속성 , 상태값 , 특징
	   
	     1)	변수 : 언제든지 변할 수 있는 속성 , 상태값 , 데이터
	     2) 상수 : 한번 지정하면 절대로 변경할 수 없는 데이터 , 속성 , 상태값
	     
	   5. 멤버메서드 : 동작 , 기능
	   
	     - 해당 메서드를 호출 (실행) 하면 해당 메서드 안에 존재한 내용이 실행된다.
	     - 해당 메서드를 호출하면 내용이 실행 된 후 내용이 끝나면 호출한 곳으로 되돌아 간다.
	     - 메서드가 다른 메서드를 호출할 수 있다.
	     
	     1) 메소드 구성 
	          [접근제한자] [메서드종류] 반환형 메서드이름([인자 또는 매개변수]){ 실행내용 }
	         가) 클래스 설명에서의 접근제한자와 같다.
	         나) 메서드 종류 : 일반적인 메서드는 이 부분 생략한다.
	                       특정메서드 일때 해당 예약어 사용 (static 예약어)
	         다) 반환형 : 해당 메서드가 실행이 끝나면 호출한 곳으로 되돌아 간다.
	                    되돌아 갈때 정보를 가지고 갈 수 있는데 이때 이 정보의 자료형을 말한다.
	                    만약에 정보를 가지고 가지 않을 때는 void라는 예약어를 사용한다.
	                    
	                                  
	  // 메인 메서드 : 해당 메서드를 실행한 후에 호출한 JVM 에게는 되돌아 가는데 아무것도 가져가지 않는다.
	  public static void main(String[] args)                                
	         
	        라) 메서드이름 : 첫글자 소문자 , 두 단어이상 일때는 단어 첫 글자들은 대문자
	                     ([인자=매개변수])앞에 이름 붙는다.
	                     
	        마) 인자 = 매개변수 : 메서드가 실행할 때 필요한 정보를 외부에서 받기 위한 통로
	            ** 메서드 이름이 같아도 인자 수나 인자 자료형이 다르면 다른 메서드로 취급한다.
	            ** 오버로딩 (중복정의) : 클래스 안에 같은 이름을 가진 메서드가 여러개 정의 되어 있는 것
	            
	  6. 생성자 : 클래스가객체로 만들어질때 한번 호출된다.
	     1) 목적 : 멤버필드( 변수 , 상수 )의 초기값을 지정하는 것이 목적
	     2) 형식 : 클래스이름과 생성자 이름은 같다.
	              메서드와 다른점은 반환형이 없다.
	              [접근제한자] 생성자이름(=클래스이름)([인자]){ 실행내용 }
	              public class Ex06 이때 생성자는 [접근제한자]Ex06([인자])
	              인자가 없는 생성자를  "기본생성자"라고 한다. => Ex06 () {}
	              생성자도 오버로딩이 가능하다.
	              즉 , 하나의 클래스 안에 여러개의 생성자가 존재할 수 있다.
	  
	   3) 생성자 없이 클래스를 객체로 생성하면 기본생성자를 호출해서 객채를 만든다.
	   4) 모든 클래스는 생성자를 가지고 있다.
	   
	   5) 클래스를 이용해서 객체를 만드는 방법
	   Scanner scan     =    new    Scanner(System.in);
	    클래스  참조변수    =    예약어     인자가 있는 생성자       
	    
	   new 예약어를 사용하면 무조건 heap 메모리에 사용영역을 만든다.
	   즉 , 인스턴스 , 객체 생성을 의미한다.
	   
	   7. 클래스를 객체를 만든 후 멤버필드와 멤버 메서드에 접근하는 방법
	   : 참조변수 , 멤버필드 , 잠조변수, 멤버메서드()  (단, 접근제한자를 확인하자)
	    
	   8. static과 instance : 멤버필드 , 멤버메서드에 공통으로 해당되는 사항
	      1) instance(인스턴스) : 객체 생성
	         - 인스턴스필드 , 인스턴스메서드 : 객체 생성할때 같이 생성되는 필드와 메서드를 말한다.
	         - 일반적인 클래스에 멤버 필드나 멤버 메서드는 모두 인스턴스이다.
	         - 호출방법 : 참조변수.멤버필드, 참조변수.멤버메서드()
	         - heap 메모리 
	      2) static
	         - 객체 생성과 상관없이 미리 만들어진 멤버필드와 메서드
	         - 반드시 static 이라는 예약어를 사용한다.
	         - 객체 생성과 상관없이 호출 가능
	         - 호출방법 : 클래스이름.멤버필드, 클래스이름.멤버메서드
	         -          System.out , Math.max()
	 
	    지역변수 또는 메서드 인자에 만들어진 변수는 해당 메서드가 실행 될때 만들어진다.
	    객체 생성할때는 만들어지지 않는다.
	 */
}
