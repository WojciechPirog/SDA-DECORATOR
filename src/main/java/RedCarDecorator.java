public class BlackCarDecorator extends CarDecorator {

    public BlackCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    public void create() {
        decoratedCar.create();
        paintCarBlack(decoratedCar);
    }

    private void paintCarBlack(Car decoratedCar) {
        System.out.print(" recently painted black.");
    }
}
