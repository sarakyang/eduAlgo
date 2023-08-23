class Solution {
    public String solution(String phone_number) {
        String answer = "";

        // 일단 slice라는걸 할건데
        // 무조건 뒤에 4자리 라고 했으니...
        // 자바는 문자열 지원이 잘 안되는 것 같아요.. 파이썬이나 자바스크립트면 바로 불었을 테지만...여튼
        int length = phone_number.length();
        int repeat = length - 4; // * 반복할 갯수
        answer += "*".repeat(repeat);
        answer += phone_number.substring(length - 4,length);
        //파이썬 슬라이스랑 같은 기능인가요? 그 건너뛰기 그런건 없지만 대략 시작 인덱스부터
        //오 딱 그 슬라이스 보는 기분이네요? repeat는 반복해주는 메소든가요? 네 String class의 메소드에
        //
        // 자바 버전마다 다르지만, repeat쓰고 싶으시면 절대 Java 11부터 사용가능해요.
        // 어지간하면 Java 8 이하는 쳐다도 보지 마세요
        return answer;
    }
}