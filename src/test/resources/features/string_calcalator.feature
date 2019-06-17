Feature: 문자열 계산기
  문자열을 입력받았을 때 과연 잘 동작할 것인가.

  Scenario: 빈 문자열을 받았을 때 0나오기
    Given 빈 문자열
    When 문자열 계산기에서 입력 받았을 받을 때
    Then 0 값이 나온다.

  Scenario Outline: <str> 을 받았을 때 계산하기
    Given <str> 문자열
    When 문자열 계산기에서 입력 받았을 받을 때
    Then <sum> 값이 나온다.
    Examples:
      | str | sum |
      |1,2  |3    |
      |1,2:3  |6    |
      |1,2:3  |6    |
