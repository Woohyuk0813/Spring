# 실습

## 1) HelloServlet & 매핑

    **요구사항**

- `/hello`로 GET 요청 시 `안녕하세요, 서블릿!` 출력
- 응답 Content-Type을 `text/html; charset=UTF-8`로 설정
- 현재 시간도 함께 출력하세요

![image.png](attachment:a418446c-8cb4-490e-812f-8c40655a4f8c:image.png)

## 2) GET 파라미터 처리 & 검증

**요구사항 (사칙연산 프로그램  입력화면,  처리 서블릿 , 결과 처리)** 

- `/calc?x=10&y=3&op=add`
- 결과를 HTML로 출력

     예)  3 add 2  선택 전송 시  ⇒  출력 : 3 + 2 = 5
           3 sub  2  전송 시  ⇒  출력: 3  -  2 = 1
           3 mul  2  전송 시  ⇒  출력: 3  *  2 = 6
           3 div   2  전송 시 ⇒   출력:  3 / 2  = 1

# 개념문제

1. (OX) 서블릿 수명주기 기본 순서는 `init()` → `service()` → `destroy()` 이다. 
답: O

2. `doGet`과 `doPost`의 올바른 설명은?
    
    A) `doGet`은 보안에 강하므로 비밀번호 전송에 권장된다
    
    B) `doPost`는 본문(body)에 데이터를 담아 보낼 수 있다
    
    C) `doGet`은 본문을 반드시 사용해야 한다
    
    D) 둘 다 브라우저가 자동 캐시를 막는다

   답 :B
    
3. 한글 응답 본문이 깨질 때 **반드시** 설정해야 하는 응답 헤더(또는 API)는?

답: text/html; charset=UTF-8

4. 다음 중 **상태 코드**와 의미가 맞는 것은?
    
    A) 200 - Redirect 완료
    
    B) 302 - 임시 리다이렉트
    
    C) 404 - 서버 내부 오류
    
    D) 500 - 리소스를 찾을 수 없음
    답: B
    
5. 쿼리 파라미터를 읽는 메서드는?
    
    A) `getAttribute`  B) `getParameter`  C) `getHeader`  D) `getCookie` 

   답: B
    
7. WAS 란 무엇이고 상용화 프로그램 종류2가지 

답: 웹서버와 웹 애플리케이션 사이에서 비즈니스 로직을 처리하는 서버
프로그램: Apache Tomcat, JEUS

8. 응답객체에 클라이언트에 전송할 데이터를 쓸 때 사용되는 클래스와 메서드는 무엇인가?

답: PrintWriter, gerWriter

9. 클라이언트가 서버에 접속했을때 WAS 부여해 주는 2가지 객체는 ?

답: HttpservletResponse, HttpservletRequest

10. 서블릿을 WAS 등록할때 사용되는 어노테이션은 무엇이고,  해당 서블릿의 이름이  myServlet 이고  my란 요청명으로  등록 방법은? 

답: @WebServlet(name="myServlet", urlPatterns="/my")

11. 클라이언트가 서버에 요청시 해당 요청을 처리하는 서블릿을 연결해주는 배치관리자 역할의 파일명은 무엇이고  프로젝트에서의 위치(디렉토리명)는 어디인가?
파일명: web.xml , 위치: WEB-INF
