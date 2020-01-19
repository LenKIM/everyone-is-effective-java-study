package chapter3.item10;

// 단순한 불변 2차원 정수 점(point) 클래스 (56쪽)
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;
        Point p = (Point)o;
        return p.x == x && p.y == y;
    }

//    // 잘못된 코드 - 리스코프 치환 원칙 위배! (59쪽)
//    @Override public boolean equals(Object o) {
//        if (o == null || o.getClass() != getClass())
//            return false;
//        Point p = (Point) o;
//        return p.x == x && p.y == y;
//    }

    // 아이템 11 참조
    @Override public int hashCode()  {
        return 31 * x + y;
    }
}
