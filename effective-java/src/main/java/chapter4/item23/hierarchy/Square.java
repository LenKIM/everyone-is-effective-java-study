package chapter4.item23.hierarchy;

// 태그 달린 클래스를 클래스 계층구조로 변환 (145쪽)
class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}
