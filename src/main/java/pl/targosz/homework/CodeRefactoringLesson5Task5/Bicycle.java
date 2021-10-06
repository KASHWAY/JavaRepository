package pl.targosz.homework.CodeRefactoringLesson5Task5;

public class Bicycle extends Vehicle {

    @Override
    public boolean goingForward() {
        return true;
    }

    @Override
    public boolean goingBackwards() {
        return false;
    }
}
