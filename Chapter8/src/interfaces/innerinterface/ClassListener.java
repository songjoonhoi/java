package interfaces.innerinterface;

public class ClassListener implements Button.OnClickListener {

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }

}
