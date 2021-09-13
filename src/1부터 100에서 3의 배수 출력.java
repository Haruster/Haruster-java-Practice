//1부터 100까지 3의 배수만을 출력
// for문을 이용해서 값을 구할 구간을 정해주고 if문을 이용해서 3의 배수라는 조건을 걸어주면 될 것 같습니다.

public class Main {
    public static void main(String[] args) {

        int i;

        for (i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
