### 매개변수 다향성 예시

1. product 클래스 생성
   - 제품의 가격과 보너스 점수 필드 생성
   - 생성자 선언
   - 보너스 점수는 제품의 10퍼센트

2. TV 클래스 생성 -> Product 클래스 상속
   - 100만원

3. Computer 클래스 생성 -> Product 클래스 상속
   - 50원만원

4. Buyer 클래스 생성
   - buy()메서드 생성

**[main 출력 결과]**<br>
TV을/를 구입하셨습니다.<br>
Computer을/를 구입하셨습니다.<br>
현재 남은 돈은 900만원 입니다.<br>
현재 보너스 점수는 30점 입니다.

## 작성후
### 코드 작성
기존 예제는 클래스파일을 하나로 작성하고 필드에 대해 public 접근 제한자를 작성하였다.<br>
나는 이것을 기존에 배운 내용을 바탕으로 클래스파일을 따로 작성하고 클래스들의 변수에 대해 <br>
객체지향 개념의 캡슐화의 특징을 적용하기 위해 private 접근 제한자를 붙였다.
때문에 다른 파일에서 해당 필드값을 사용하기 위해 getter와 setter메서드를 사용했다.

### 느낀점
매개변수의 다형성이라는 개념 자체는 처음 배울 때 필요성을 몰랐는데 클래스 자체를 매개변수 타입로<br>
작성하여 자식 클래스들을 사용할 수 있어 메서드를 하나하나 생성해주지 않아도 되서 중복 코드를 제거하여 필요성을 느꼈다.

### 개념정리
조상 타입의 참조변수로 자손 타입의 객체를 참조하는 것이 가능하다.