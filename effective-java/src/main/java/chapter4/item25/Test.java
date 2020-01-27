package chapter4.item25;

// 코드 25-3 톱레벨 클래스들을 정적 멤버 클래스로 바꿔본 모습 (151-152쪽)
public class Test {
    public static void main(String[] args) {
        System.out.println(Utensil.NAME + Dessert.NAME);
    }

    private static class Utensil {
        static final String NAME = "pan";
    }

    private static class Dessert {
        static final String NAME = "cake";
    }
}
