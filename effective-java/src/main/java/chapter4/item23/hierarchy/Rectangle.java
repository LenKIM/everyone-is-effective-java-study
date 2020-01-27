package chapter4.item23.hierarchy;

// 코드 23-2 태그 달린 클래스를 클래스 계층구조로 변환 (144쪽)
class Rectangle extends Figure {
    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width  = width;
    }
    @Override double area() { return length * width; }
}
