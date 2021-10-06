package pl.targosz.homework.CodeRefactoringLesson5Task5;

public class Bicycle extends Vehicle {

    protected void startEngine() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }


    protected void stopEngine() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }

    @Override
    public boolean goingForward() {
        return true;
    }

    @Override
    public boolean goingBackwards() {
        return false;
    }
}
