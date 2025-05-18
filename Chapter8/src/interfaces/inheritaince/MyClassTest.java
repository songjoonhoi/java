package interfaces.inheritaince;

public class MyClassTest {
    public static void main(String[] args) {
        // MyClass 객체 생성
        MyClass myClass = new MyClass();

        // 부모 타입으로 형변화
        X x = myClass;
        x.x();

        Y y = myClass;
        y.y();

        // X와 Y를 상속한 iClass 객체 생성
        System.out.println("다중 상속한 iClass 출력");
        Myinterface iClass = myClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}
